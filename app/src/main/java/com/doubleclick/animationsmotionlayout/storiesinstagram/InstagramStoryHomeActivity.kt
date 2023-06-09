package com.doubleclick.animationsmotionlayout.storiesinstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doubleclick.animationsmotionlayout.R
import com.doubleclick.animationsmotionlayout.storiesinstagram.scenes.InstagramStoryScene1Activity
import com.doubleclick.animationsmotionlayout.storiesinstagram.scenes.InstagramStoryScene2Activity
import com.doubleclick.animationsmotionlayout.storiesinstagram.scenes.InstagramStoryScene3Activity
import com.doubleclick.animationsmotionlayout.storiesinstagram.scenes.InstagramStoryScene4Activity
import kotlinx.android.synthetic.main.activity_instagram_story_home.*

class InstagramStoryHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram_story_home)

        demoInstagram.setOnClickListener {
            startActivity(
                Intent(this, InstagramStoryDemoActivity::class.java)
            )
        }

        instagramStoryScene1.setOnClickListener {
            startActivity(
                Intent(this, InstagramStoryScene1Activity::class.java)
            )
        }

        instagramStoryScene2.setOnClickListener {
            startActivity(
                Intent(this, InstagramStoryScene2Activity::class.java)
            )
        }

        instagramStoryScene3.setOnClickListener {
            startActivity(
                Intent(this, InstagramStoryScene3Activity::class.java)
            )
        }

        instagramStoryScene4.setOnClickListener {
            startActivity(
                Intent(this, InstagramStoryScene4Activity::class.java)
            )
        }
    }
}