package com.ix.ibrahim7.sidemenulibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.sidemenulibrary.Constant.Height
import com.ix.ibrahim7.sidemenulibrary.Constant.Width
import com.ix.ibrahim7.sidemenulibrary.Constant.image
import com.ix.ibrahim7.sidemenulibrary.Constant.resizeSelectedIcon
import com.ix.ibrahim7.sidemenulibrary.Constant.selectedImageChange
import com.ix.ibrahim7.sidemenulibrary.Constant.selectedTint
import com.ix.ibrahim7.sidemenulibrary.Constant.selectedTintActive


class MenuView(context: Context,attr: AttributeSet) : FrameLayout(context, attr),
    MenuAdapter.onClick {

    var clickListener: ClickListener? = null
    private var listener: OnClickItemListener? = null

    private val list_adapter by lazy {
        MenuAdapter(context, ArrayList(), this)
    }

    lateinit var recyclerView: RecyclerView
    lateinit var cardView: CardView
    lateinit var constraintLayout: ConstraintLayout

    init {
        initView()
    }

    private fun initView() {
        val view = View.inflate(context, R.layout.menu_layout, this)
        view.apply {
            recyclerView = findViewById(R.id.list_menu)
            cardView = findViewById(R.id.card_container)
            constraintLayout = findViewById(R.id.constraint_container)
            recyclerView.apply {
                adapter = list_adapter
            }
        }

    }

    fun setCardBackgroundColor(color: Int){
        cardView.setCardBackgroundColor(color)
        constraintLayout.setBackgroundColor(color)
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
        selectedTintActive = true
        selectedImageChange = false
        selectedTint = color
        list_adapter.notifyDataSetChanged()
    }

    fun setSelectedImageResource(drawable: Int) {
       selectedTintActive = false
        selectedImageChange = true
        image=list_adapter.setSelectedImageResource(drawable)
        list_adapter.notifyDataSetChanged()
    }



    fun setIconTint(color: Int) {
        Constant.iconTintActive = true
        Constant.iconTint = color
        list_adapter.notifyDataSetChanged()
    }

    fun setSelectedImageSize(height:Int,width:Int) {
        resizeSelectedIcon = true
        Height = height
        Width = width
        list_adapter.notifyDataSetChanged()
    }

    override fun onClickListener(menuitem: MenuItem, position: Int) {
        listener?.onClickItem(menuitem.id)
        if (clickListener != null) {
            clickListener!!.onClickListener(menuitem)
        }
    }


    fun setClickItemListener(listener: OnClickItemListener) {
        this.listener = listener
    }

    interface OnClickItemListener {
        fun onClickItem(id: Int)
    }


    fun setCallback(clickListener: ClickListener) {
        this.clickListener = clickListener
    }

}