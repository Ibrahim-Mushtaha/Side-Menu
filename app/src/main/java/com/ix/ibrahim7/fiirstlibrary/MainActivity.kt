package com.ix.ibrahim7.fiirstlibrary

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ix.ibrahim7.fiirstlibrary.views.ActionListener
import com.ix.ibrahim7.fiirstlibrary.views.MenuItem
import com.ix.ibrahim7.fiirstlibrary.views.MenuView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  ,ActionListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu1.setOnClickListener {

        }

        menu1.addItem(
            MenuItem(
                55,
                R.drawable.ic_baseline_home_black,
                true
            )
        )
        menu1.addItem(
            MenuItem(
                44,
                R.drawable.ic_baseline_home_black,
                false
            )
        )
        menu1.addItem(
            MenuItem(
                33,
                R.drawable.ic_baseline_home_black,
                false
            )
        )


    /*    menu1.setIconTint(Color.BLUE)
       menu1.setSelectedTint(Color.RED)*/
       menu1.setCallback(this)
        menu1.setSelectedImageResource(R.drawable.ic_launcher_background)


        menu1.setClickItemListener(object :MenuView.OnClickItemListener{
            override fun onClickItem(id: Int) {
                Log.e("eee click2",id.toString())
            }

        })

    }


    override fun clickListener(item: MenuItem) {
        Log.e("eee click",item.id.toString())
    }
}