package com.ix.ibrahim7.fiirstlibrary

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ix.ibrahim7.fiirstlibrary.views.ActionListener
import com.ix.ibrahim7.fiirstlibrary.views.MenuItem
import com.ix.ibrahim7.fiirstlibrary.views.MenuView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity(), ActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        menu1.apply {
            addItem(55, R.drawable.ic_baseline_home_black, true)
            addItem(44, R.drawable.ic_baseline_home_black, false)
            addItem(33, R.drawable.ic_baseline_home_black, false)
        }


        menu1.apply {
            GlobalScope.launch {
             withContext(Dispatchers.Main) {
                 setIconTint(Color.BLUE)
                // delay(1000)
                  //setSelectedTint(Color.RED)
                 delay(1000)
                 setSelectedImageResource(R.drawable.ic_launcher_background)
             }
            }
        }


        /*
        to active the on ActionListener Class you must set the callback
         */
        menu1.setCallback(this)


        /*
            the setclickItemListener return the id
         */
        menu1.setClickItemListener(object : MenuView.OnClickItemListener {
            override fun onClickItem(id: Int) {
                when (id) {
                    55 -> Toast.makeText(this@MainActivity, "55 is my number", Toast.LENGTH_SHORT)
                        .show()
                    44 -> Toast.makeText(this@MainActivity, "my id is 44", Toast.LENGTH_SHORT)
                        .show()
                    33 -> Toast.makeText(this@MainActivity, "you are a loser", Toast.LENGTH_SHORT)
                        .show()
                }
            }

        })

    }


    override fun clickListener(item: MenuItem) {
        Log.e("eee click", item.id.toString())
    }
}