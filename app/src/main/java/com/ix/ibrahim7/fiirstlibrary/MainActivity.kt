package com.ix.ibrahim7.fiirstlibrary

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ix.ibrahim7.fiirstlibrary.views.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                32,
                true
            )
        )
        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                32,
                false
            )
        )
        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                32,
                false
            )
        )
        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                32,
                false
            )
        )
        menu1.setData(
            MenuItem(
                R.drawable.ic_baseline_home_black,
                32,
                false
            )
        )

        menu1.setSelectedColor(Color.RED)

    }
}