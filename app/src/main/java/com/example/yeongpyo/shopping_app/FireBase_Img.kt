package com.example.yeongpyo.shopping_app

import android.net.Uri
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import java.io.File

class FireBase_Img {

    var mStorageRef : StorageReference = FirebaseStorage.getInstance().getReference()

    fun UploadImg(fileName : String){
        val file = Uri.fromFile(File(fileName))
        val riverRef = mStorageRef.child(fileName)
        riverRef.putFile(file)
                .addOnSuccessListener(OnSuccessListener {
                    val downLoadUri = it.downloadUrl
                }).addOnFailureListener(OnFailureListener {

                })
    }

    fun DownloadImg(fileName : String){
        val localFile = File.createTempFile("image", "jpg")
        mStorageRef.getFile(localFile)
                .addOnSuccessListener(OnSuccessListener {

                }).addOnFailureListener(OnFailureListener {

                })
    }
}