package com.ix.ibrahim7.fiirstlibrary.views

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.fiirstlibrary.R
import com.ix.ibrahim7.fiirstlibrary.views.MenuAdapter

class MenuView(context: Context, attributeSet: AttributeSet) : FrameLayout(context, attributeSet),
    MenuAdapter.onClick {

    var actionListener: ActionListener? = null
    private var listener: OnClickItemListener? = null

    private val list_adapter by lazy {
        MenuAdapter(context, ArrayList(), this)
    }


    lateinit var recyclerView: RecyclerView

    init {
        initView()
    }

    private fun initView() {
        val view = View.inflate(context, R.layout.menu_layout, this)
        view.apply {
            recyclerView = findViewById(R.id.list_menu)
            recyclerView.apply {
                adapter = list_adapter
            }
        }
    }

    fun addItem(id: Int,icon:Int,isSelected:Boolean) {
        list_adapter.data.add(MenuItem(id, icon, isSelected))
        list_adapter.notifyDataSetChanged()
    }

    fun addList(array: ArrayList<MenuItem>) {
        list_adapter.data.addAll(array)
        list_adapter.notifyDataSetChanged()
    }

    fun setSelectedTint(color: Int) {
        Constant.selectedTintActive = true
        Constant.selectedTint = color
        list_adapter.notifyDataSetChanged()
    }

    fun setSelectedImageResource(drawable: Int) {
        Constant.selectedImageChange = true
        Constant.image=list_adapter.setselectedImageResource(drawable)
        list_adapter.notifyDataSetChanged()
    }



    fun setIconTint(color: Int) {
        Constant.iconTintActive = true
        Constant.iconTint = color
        list_adapter.notifyDataSetChanged()
    }

    override fun onClickListener(menuitem: MenuItem, position: Int) {
        listener?.onClickItem(menuitem.id)
        if (actionListener != null) {
            actionListener!!.clickListener(menuitem)
        }
    }


    fun setClickItemListener(listener: OnClickItemListener) {
        this.listener = listener
    }

    interface OnClickItemListener {
        fun onClickItem(id: Int)
    }


    fun setCallback(actionListener: ActionListener) {
        this.actionListener = actionListener
    }

}