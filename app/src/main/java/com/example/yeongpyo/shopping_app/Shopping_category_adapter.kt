package com.example.yeongpyo.shopping_app

import android.databinding.DataBindingUtil
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.example.yeongpyo.shopping_app.Categroy_DB.Category_VO
import com.example.yeongpyo.shopping_app.databinding.ExpandableItemBinding
import kotlinx.android.synthetic.main.expandable_item.view.*

class Shopping_category_adapter(val Datalist :LinkedHashMap<Category_VO, ArrayList<Category_VO>> ) : BaseExpandableListAdapter() {
    var array : ArrayList<Category_VO> = ArrayList()

    init {
        for ( VO in Datalist.keys ) array.add(VO)
    }

    override fun getGroup(groupPosition: Int): Any = 0

    override fun hasStableIds(): Boolean = true
    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = false

    override fun getGroupId(groupPosition: Int): Long  = groupPosition.toLong()
    override fun getChildId(groupPosition: Int, childPosition: Int): Long  = groupPosition.toLong()
    override fun getChild(groupPosition: Int, childPosition: Int): Any = childPosition
    override fun getGroupCount(): Int = Datalist.size
    override fun getChildrenCount(groupPosition: Int): Int  = Datalist.get(array[groupPosition])!!.size

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View  {
        var view = getinflateView(parent!!)
        View_holder(view).Binding.vodata = array[groupPosition]
        return view
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        var view = getinflateView(parent!!)
        View_holder(view).Binding.vodata = Datalist[array[groupPosition]]!![childPosition]
        view.setOnClickListener {
            Log.i("Click event", it.textView.text.toString())
        }
        return view
    }

    fun getinflateView(viewGroup : ViewGroup ) : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.expandable_item, viewGroup, false)

    inner class View_holder( view : View ){
        val Binding : ExpandableItemBinding = DataBindingUtil.bind(view)!!
    }



}