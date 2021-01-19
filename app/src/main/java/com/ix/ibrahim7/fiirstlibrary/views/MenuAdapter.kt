package com.ix.ibrahim7.fiirstlibrary.views

import android.app.Activity
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.fiirstlibrary.R
import kotlinx.android.synthetic.main.item_menu.view.*
import java.util.*


class MenuAdapter(var activity: Activity, var data: ArrayList<MenuItem>, val itemclick: onClick) :
        RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    private var selectedItemPos = 0
    var selectedTint:Int?=null
    var iconTint:Int?=null
    var selectedTintActive=false
    var iconTintActive=false
    class MenuViewHolder(item: View) : RecyclerView.ViewHolder(item)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val itemView = LayoutInflater.from(activity).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(
            itemView
        )
    }

    override fun getItemCount()= data.size


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        val currentItem = data[position]

        holder.itemView.apply {
          when {
              selectedTintActive -> {
                  item_menu_selected.drawable.setTint(selectedTint!!)
                  /* Log.e("eee selected",selectedTintActive.toString())
                    Log.e("eee icon",iconTintActive.toString())*/
              }
              iconTintActive -> {
                  /* Log.e("eee icon",iconTintActive.toString())*/
                  item_menu_icon.setColorFilter(iconTint!!)
              }
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

    fun changeIconTint(){
        iconTintActive = true
    }


    fun changeSelectedTint(){
        selectedTintActive = true
    }


    interface onClick {
        fun onClickListener(menuitem: MenuItem, position: Int)
    }

}
