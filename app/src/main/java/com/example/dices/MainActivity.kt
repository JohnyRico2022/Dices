package com.example.dices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.dices.adapter.PagerAdapter
import com.example.dices.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        binding.viewPager.adapter = PagerAdapter(this)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_one)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.main))
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_two)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.main))
                    tab.icon?.alpha = 40
                }
            }
        }.attach()

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.icon?.alpha = 250
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.icon?.alpha = 40
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }
}