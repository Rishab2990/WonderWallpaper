@file:Suppress("DEPRECATION")

package com.example.wonderwallpaper

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Category()
            1 -> Wallpaper()
            else ->
                throw IllegalArgumentException("Invalid position: $position")

        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Category"
            1 -> "Wallpaper"
            else ->
                throw IllegalArgumentException("Invalid position: $position")

        }
    }
}