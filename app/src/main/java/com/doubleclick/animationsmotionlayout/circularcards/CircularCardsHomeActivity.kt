package com.doubleclick.animationsmotionlayout.circularcards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doubleclick.animationsmotionlayout.R
import com.doubleclick.animationsmotionlayout.circularcards.scenes.*
import kotlinx.android.synthetic.main.activity_circular_cards_home.*

class CircularCardsHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_cards_home)
        circularCardsDemo.setOnClickListener {
            startActivity(
                Intent(this, CircularCardsDemoActivity::class.java)
            )
        }

        circularCardsScene1.setOnClickListener {
            startActivity(
                Intent(this, CircularCardsScene1Activity::class.java)
            )
        }

        circularCardsScene2.setOnClickListener {
            startActivity(
                Intent(this, CircularCardsScene2Activity::class.java)
            )
        }

        circularCardsScene3.setOnClickListener {
            startActivity(
                Intent(this, CircularCardsScene3Activity::class.java)
            )
        }

        circularCardsScene4.setOnClickListener {
            startActivity(
                Intent(this, CircularCardsScene4Activity::class.java)
            )
        }

        circularCardsScene5.setOnClickListener {
            startActivity(
                Intent(this, CircularCardsScene5Activity::class.java)
            )
        }
    }
}