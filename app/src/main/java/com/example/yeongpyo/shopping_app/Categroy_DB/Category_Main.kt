package com.example.yeongpyo.shopping_app.Categroy_DB

import com.example.yeongpyo.shopping_app.R

class Category_Main {

    fun Category_Total() : LinkedHashMap<Category_VO, ArrayList<Category_VO>> = LinkedHashMap<Category_VO, ArrayList<Category_VO>>().apply {
        put(Category_VO(R.drawable.shirt, "의류"), Category_Wear() )
        put(Category_VO(R.drawable.device, "디지털"), Categrory_Device() )
        put(Category_VO(R.drawable.furnitrure, "가구"), Category_Furniture() )
        put(Category_VO(R.drawable.fitness, "건강"), Category_Fitness() )
    }

    fun Category_Wear() : ArrayList<Category_VO> =ArrayList<Category_VO>().apply {
            add(Category_VO("티셔츠"))
            add(Category_VO("후드티"))
            add(Category_VO("맨투맨"))
            add(Category_VO("셔츠"))
            add(Category_VO("자켓"))
            add(Category_VO("바지"))
        }


    fun Categrory_Device() :ArrayList<Category_VO> =ArrayList<Category_VO>().apply {
        add(Category_VO("스마트기기"))
        add(Category_VO("카메라"))
        add(Category_VO("주변기기"))
        add(Category_VO("게임"))
        add(Category_VO("태블릿"))
        add(Category_VO("휴대폰"))
    }

    fun Category_Fitness() :ArrayList<Category_VO> =ArrayList<Category_VO>().apply {
        add(Category_VO("자전거"))
        add(Category_VO("헬스"))
        add(Category_VO("수영"))
        add(Category_VO("캠핑"))
    }

    fun Category_Furniture() :ArrayList<Category_VO> =ArrayList<Category_VO>().apply {
        add(Category_VO("거실"))
        add(Category_VO("침실"))
        add(Category_VO("수납"))
        add(Category_VO("주방"))
        add(Category_VO("조명"))
        add(Category_VO("침구"))
    }
}


