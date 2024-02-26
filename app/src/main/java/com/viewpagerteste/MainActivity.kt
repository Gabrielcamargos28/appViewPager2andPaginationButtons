package com.viewpagerteste

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2

    private lateinit var welcomeAdapter: WelcomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.view_pager)

        val contents = listOf(
            Welcome(
                "Seja bem vindo",
                R.drawable.ic_launcher_background,
                "Tutoria view"
            ), Welcome(
                "Pag2",
                R.drawable.ic_launcher_foreground,
                "ABC"
            ), Welcome(
                "Pag3",
                R.drawable.ic_launcher_background,
                "DEF"
            )
        )

        welcomeAdapter = WelcomeAdapter(this, contents)
        viewPager2.adapter = welcomeAdapter


        var contentIndex = 0
        /*
        val nextBtn: Button = findViewById(R.id.btn_next)
        val prevBtn: Button = findViewById(R.id.btn_prev)

        prevBtn.setOnClickListener{
            if(contentIndex > 0){
                contentIndex--
                //aqui vai o fragment
                replace(contents,contentIndex)
                if(contentIndex == 0){
                    prevBtn.isEnabled= false
                }
                if(contentIndex == contents.size - 2){
                    nextBtn.isEnabled = true
                }
            }
        }
        nextBtn.setOnClickListener {
            if (contentIndex < contents.size - 1) {
                contentIndex++
                //aqui vai o fragment
                replace(contents,contentIndex)
                if (contentIndex == contents.size - 1) {
                    nextBtn.isEnabled = false
                }
                if (contentIndex == 1) {
                    prevBtn.isEnabled = true
                }
            }
        }
    }
    private fun replace(contents: List<Welcome>, contentIndex: Int){
        val fragment = WelcomeFragment.newInstance(contents[contentIndex])
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }*/
    }
}