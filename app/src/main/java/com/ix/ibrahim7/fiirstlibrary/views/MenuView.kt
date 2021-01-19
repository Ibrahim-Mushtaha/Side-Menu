package com.ix.ibrahim7.fiirstlibrary.views

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.fiirstlibrary.R
import com.ix.ibrahim7.fiirstlibrary.views.MenuAdapter

class MenuView(context: Context,attributeSet: AttributeSet) : FrameLayout(context,attributeSet),
    MenuAdapter.onClick {

    private val list_adapter by lazy {
        MenuAdapter(
            context as Activity,
            ArrayList(),
            color,this
        )
    }


    lateinit var recyclerView: RecyclerView
    var color: Int

    init {
        color = Color.BLUE
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

    fun setSelectedColor(color: Int){
        list_adapter.changeStatus()
        list_adapter.changeColor = color
        list_adapter.notifyDataSetChanged()
    }

    override fun onClickListener(menuitem: MenuItem, position: Int) {

    }


}