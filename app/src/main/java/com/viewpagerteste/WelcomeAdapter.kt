package com.viewpagerteste

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WelcomeAdapter(fa: FragmentActivity, val contents: List<Welcome>): FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return contents.size
    }

    //rolagem infinitas
    /*
    override fun getItemCount(): Int {
        return contents.size * Int.MAX_VALUE
     }
     override fun createFragment(position: Int): Fragment {
      return WelcomeFragment.newInstance(contents[position % contents.size])
    }*/

    override fun createFragment(position: Int): Fragment {
      return WelcomeFragment.newInstance(contents[position])
    }
}