package com.example.wonderwallpaper

import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager
import com.example.wonderwallpaper.R.id.viewpager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagebutton = findViewById<ImageButton>(R.id.imagebutton)
        val  navigation = findViewById<DrawerLayout>(R.id.main)
        val viewpager = findViewById<ViewPager>(R.id.viewpager)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)

        imagebutton.setOnClickListener {
            navigation.open()

        }

        // null check for viewpager
        if(viewpager==null){
            Log.e("MainActivity" , "ViewPager is null")
        }
        else{
            Log.d("MainActivity" ,"ViewPager is initialized" )
        }


        val adapter = ViewPagerAdapter(supportFragmentManager)  // creating an object
        viewpager.adapter = adapter // set adapter with view pager
        tablayout.setupWithViewPager(viewpager)

    }
}


