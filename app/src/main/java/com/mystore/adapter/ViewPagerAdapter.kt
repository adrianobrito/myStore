package com.mystore.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.*

/**
 * Created by adriano.brito on 22/11/2016.
 */
class ViewPagerAdapter(manager:FragmentManager) : FragmentPagerAdapter(manager){

    val fragmentList:ArrayList<Fragment> = ArrayList()
    val fragmentTitleList:ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment = fragmentList.get(position)

    override fun getCount(): Int = fragmentList.size

    fun addFragment(fragment: Fragment, title: String){
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitleList.get(position)
    }

}