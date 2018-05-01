package com.example.yeongpyo.shopping_app

import android.databinding.DataBindingUtil
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.example.yeongpyo.shopping_app.Categroy_DB.Category_VO
import com.example.yeongpyo.shopping_app.databinding.ExpandableItemBinding

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

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        View_holder(convertView!!).Binding.vodata = array[groupPosition]
        return convertView
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        View_holder(convertView!!).Binding.vodata = Datalist.get(array[groupPosition])!![childPosition]
        return convertView
    }

    inner class View_holder( view : View ){
        val Binding : ExpandableItemBinding = DataBindingUtil.bind(view)!!
    }



}