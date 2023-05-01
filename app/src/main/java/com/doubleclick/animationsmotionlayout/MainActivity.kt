package com.doubleclick.animationsmotionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doubleclick.animationsmotionlayout.carouselhelper.CarouselHelperActivity
import com.doubleclick.animationsmotionlayout.circularcards.CircularCardsHomeActivity
import com.doubleclick.animationsmotionlayout.democonstraintset.DemoConstraintSetActivity
import com.doubleclick.animationsmotionlayout.examplekeyposition.PositionKeyExampleActivity
import com.doubleclick.animationsmotionlayout.flow.FlowDemoActivity
import com.doubleclick.animationsmotionlayout.horizontalcarousel.HorizontalCarouselActivity
import com.doubleclick.animationsmotionlayout.menuselection.MenuSelectionCarouselActivity
import com.doubleclick.animationsmotionlayout.modopay.ModoPaymentActivity
import com.doubleclick.animationsmotionlayout.motionwithar.MotionAndAugmentedRealityActivity
import com.doubleclick.animationsmotionlayout.pillcards.PillCardsActivity
import com.doubleclick.animationsmotionlayout.pivotrotation.FoodCircleTabsActivity
import com.doubleclick.animationsmotionlayout.rotationcard.RotationCardHomeActivity
import com.doubleclick.animationsmotionlayout.sensor.CardSensorActivity
import com.doubleclick.animationsmotionlayout.starbucks.StarbucksDetailActivity
import com.doubleclick.animationsmotionlayout.storiesinstagram.InstagramStoryHomeActivity
import com.doubleclick.animationsmotionlayout.telegramheaderdemo.TelegramHeaderDemoActivity
import com.doubleclick.animationsmotionlayout.verticalsnake.VerticalSnakeActivity
import com.doubleclick.animationsmotionlayout.verticalstackcards.VerticalStackCardsHomeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        storiesHome.setOnClickListener {
//            startActivity(
//                    Intent(this, CircularStepsActivity::class.java)
//            )
        }
        circularCards.setOnClickListener {
            startActivity(
                    Intent(this, CircularCardsHomeActivity::class.java)
            )
        }
        rotationCardScenes.setOnClickListener {
            startActivity(
                    Intent(this, RotationCardHomeActivity::class.java)
            )
        }

        verticalCards.setOnClickListener {
            startActivity(
                    Intent(this, VerticalStackCardsHomeActivity::class.java)
            )
        }
        positionKeyExamples.setOnClickListener {
            startActivity(
                    Intent(this, PositionKeyExampleActivity::class.java)
            )
        }

        starbucks.setOnClickListener {
            startActivity(
                    Intent(this, StarbucksDetailActivity::class.java)
            )
        }

        sensorButton.setOnClickListener {
            startActivity(
                    Intent(this, CardSensorActivity::class.java)
            )
        }

        snakeCarousel.setOnClickListener {
            startActivity(
                    Intent(this, HorizontalCarouselActivity::class.java)
            )
        }

        pillCardsButton.setOnClickListener {
            startActivity(
                    Intent(this, PillCardsActivity::class.java)
            )
        }

        demosConstraintSet.setOnClickListener {
            startActivity(
                    Intent(this, DemoConstraintSetActivity::class.java)
            )
        }

        flowDemo.setOnClickListener {
            startActivity(
                    Intent(this, FlowDemoActivity::class.java)
            )
        }

        telegramHeaderDemo.setOnClickListener {
            startActivity(
                    Intent(this, TelegramHeaderDemoActivity::class.java)
            )
        }

        ARExample.setOnClickListener {
            startActivity(
                Intent(this, MotionAndAugmentedRealityActivity::class.java)
            )
        }

        pivotDemo.setOnClickListener {
            startActivity(
                Intent(this, FoodCircleTabsActivity::class.java)
            )
        }

        carouselHelperActivity.setOnClickListener {
            startActivity(
                Intent(this, CarouselHelperActivity::class.java)
            )
        }

        snakeActivity.setOnClickListener {
            startActivity(
                Intent(this, VerticalSnakeActivity::class.java)
            )
        }

        modoPaymentActivity.setOnClickListener {
            startActivity(
                    Intent(this, ModoPaymentActivity::class.java)
            )
        }

        menuSelection.setOnClickListener {
            startActivity(
                Intent(this, MenuSelectionCarouselActivity::class.java)
            )
        }
    }
}
