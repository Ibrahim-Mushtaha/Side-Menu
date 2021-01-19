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

        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                55,
                true
            )
        )
        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                44,
                false
            )
        )
        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                33,
                false
            )
        )


        menu1.setIconTint(Color.BLUE)
       menu1.setSelectedTint(Color.RED)
       menu1.setCallback(this)



    }


    override fun clickListener(item: MenuItem) {
        Log.e("eee click",item.code.toString())
    }
}