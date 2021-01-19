package com.ix.ibrahim7.fiirstlibrary.views

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.fiirstlibrary.R
import com.ix.ibrahim7.fiirstlibrary.views.MenuAdapter

class MenuView(context: Context,attributeSet: AttributeSet) : FrameLayout(context,attributeSet),
    MenuAdapter.onClick {

    var actionListener: ActionListener? = null
    private val list_adapter by lazy {
        MenuAdapter(
            context as Activity,
            ArrayList(),
            this
        )
    }


    lateinit var recyclerView: RecyclerView

    init {
        initView()
    }

    private fun initView(){
        val view = View.inflate(context, R.layout.menu_layout,this)
        view.apply {
            recyclerView =findViewById(R.id.list_menu)
            recyclerView.apply {
                adapter =list_adapter
            }
        }
    }

    fun setData(item: MenuItem){
        list_adapter.data.add(item)
        list_adapter.notifyDataSetChanged()
    }

    fun setSelectedTint(color: Int){
        list_adapter.changeSelectedTint()
        list_adapter.selectedTint = color
        list_adapter.notifyDataSetChanged()
        list_adapter.selectedTintActive =true
    }

    fun setIconTint(color: Int){
        list_adapter.changeIconTint()
        list_adapter.iconTint = color
        list_adapter.notifyDataSetChanged()
        list_adapter.iconTintActive =true
    }

    override fun onClickListener(menuitem: MenuItem, position: Int) {
        if (actionListener != null) {
            actionListener!!.clickListener(menuitem)
        }
    }

    fun setCallback(actionListener: ActionListener) {
        this.actionListener = actionListener
    }




}