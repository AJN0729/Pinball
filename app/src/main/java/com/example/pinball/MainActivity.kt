package com.example.pinball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.view.Display
import android.view.Gravity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        lateinit var  paddleL: ImageView
        lateinit var paddleR: ImageView
        lateinit var ball: ImageView



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun getStuff() {
        val paddleL = R.id.paddleLeft
        val paddleR = R.id.paddleRight
        val ball = R.id.Ball
    }


   fun moveBall() {

       val paddleL = R.id.paddleLeft
       val paddleR = R.id.paddleRight
       val ball = R.id.Ball


   display(ball)
View.ball.TRANSLATION
   }

    private fun display(ball: Int) {

    }


    fun getBallValue() {

        val paddleL = R.id.paddleLeft
        val paddleR = R.id.paddleRight
        val ball = R.id.Ball





    }



}