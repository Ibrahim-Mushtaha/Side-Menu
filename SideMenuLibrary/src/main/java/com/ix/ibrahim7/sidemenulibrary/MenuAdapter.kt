package com.ix.ibrahim7.sidemenulibrary

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.ix.ibrahim7.fiirstlibrary.R
import com.ix.ibrahim7.fiirstlibrary.views.Constant.iconTint
import com.ix.ibrahim7.fiirstlibrary.views.Constant.iconTintActive
import com.ix.ibrahim7.fiirstlibrary.views.Constant.image
import com.ix.ibrahim7.fiirstlibrary.views.Constant.selectedImageChange
import com.ix.ibrahim7.fiirstlibrary.views.Constant.selectedItemPos
import com.ix.ibrahim7.fiirstlibrary.views.Constant.selectedTint
import com.ix.ibrahim7.fiirstlibrary.views.Constant.selectedTintActive
import kotlinx.android.synthetic.main.item_menu.view.*
import java.util.*


class MenuAdapter(var context: Context, var data: ArrayList<MenuItem>, val itemclick: onClick) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {


    class MenuViewHolder(item: View) : RecyclerView.ViewHolder(item)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(
            itemView
        )
    }

    override fun getItemCount() = data.size


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        val currentItem = data[position]

        holder.itemView.apply {
            when {
                selectedImageChange -> {
                    item_menu_selected.setImageResource(image)
                   // Log.e("eee selectedImageChange","$iconTintActive || $selectedImageChange || $selectedTintActive")
                }
                selectedTintActive -> {
                    item_menu_selected.setImageResource(R.drawable.ovel)
                    item_menu_selected.drawable.setTint(selectedTint!!)
                }
            }

            if (iconTintActive) item_menu_icon.setColorFilter(iconTint!!)


            item_menu_icon.setImageResource(currentItem.icon)
            if (currentItem.isSelected)
                item_menu_selected.visibility = View.VISIBLE
            else
                item_menu_selected.visibility = View.INVISIBLE

            setOnClickListener {
                itemclick.onClickListener(currentItem, holder.adapterPosition)
                data[selectedItemPos].isSelected = false
                data[position].isSelected = true
                selectedItemPos = position

                iconTintActive =iconTintActive
                selectedImageChange =selectedImageChange
                selectedTintActive =selectedTintActive
                notifyDataSetChanged()
            }

        }

    }

    fun setSelectedImageResource(drawable: Int): Int {
        return drawable
    }


    interface onClick {
        fun onClickListener(menuitem: MenuItem, position: Int)
    }

}
