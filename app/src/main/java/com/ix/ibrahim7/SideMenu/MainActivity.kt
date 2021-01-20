package com.ix.ibrahim7.SideMenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ix.ibrahim7.SideMenu.views.ClickListener
import com.ix.ibrahim7.SideMenu.views.MenuItem
import com.ix.ibrahim7.SideMenu.views.MenuView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        menu1.apply {
            addItem(55, R.drawable.ic_baseline_home_black, true)
            addItem(44, R.drawable.ic_baseline_home_black, false)
            addItem(33, R.drawable.ic_baseline_home_black, false)


            // TODO TO CHANGE CARD BACKGROUND COLOR
            //setCardBackgroundColor(Color.parseColor("#181C23"))

        }


        /*menu1.apply {
            setSelectedImageResource(R.drawable.ic_launcher_background)
            setIconTint(Color.BLUE)
        }*/

        btn_change_selected_color.setOnClickListener {
            menu1.setSelectedTint(Color.RED)
        }

        btn_change_icon_tint.setOnClickListener {
            menu1.setIconTint(Color.BLUE)
        }

        btn_change_selected_image.setOnClickListener {
            menu1.setSelectedImageResource(R.drawable.ic_launcher_background)
        }



        // TODO TO ACTIVE THE ON ACTIONLISTENER CLASS YOU MUST SET THE CALLBACK
        menu1.setCallback(this)



        // TODO THE SETCLICKITEMLISTENER RETURN THE ID
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

    //TODO THE RESULT OF CALLBACK OF THE CLICKLISTENER INTERFACE
    override fun onClickListener(item: MenuItem) {
        Log.e("eee click", item.id.toString())
    }
}