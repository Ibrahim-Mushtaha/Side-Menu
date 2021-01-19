package com.ix.ibrahim7.fiirstlibrary.views

import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.fiirstlibrary.R
import kotlinx.android.synthetic.main.item_menu.view.*
import java.util.ArrayList


class MenuAdapter(var activity: Activity, var data: ArrayList<MenuItem>,val color: Int, val itemclick: onClick) :
        RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    private var selectedItemPos = 0
    var changeColor:Int?=null
    var changed=false
    class MenuViewHolder(item: View) : RecyclerView.ViewHolder(item)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val itemView = LayoutInflater.from(activity).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(
            itemView
        )
    }

    override fun getItemCount()= data.size


    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        val currentItem = data[position]

        holder.itemView.apply {
            if (changed){
                item_menu_selected.drawable.setTint(color)
            }
            item_menu_icon.setImageResource(currentItem.icon)
            if (currentItem.isSelected)
                item_menu_selected.visibility=View.VISIBLE
            else
                item_menu_selected.visibility=View.INVISIBLE

            setOnClickListener {
                itemclick.onClickListener(currentItem,holder.adapterPosition)
                data[selectedItemPos].isSelected=false
                data[position].isSelected=true
                selectedItemPos =position
               notifyDataSetChanged()
            }
        }

    }

    fun changeColor(color: Int):Int{
        changeColor = color
        return color
    }


    fun changeStatus(){
        changed = true
    }

    interface onClick {
        fun onClickListener(menuitem: MenuItem, position: Int)
    }

}
