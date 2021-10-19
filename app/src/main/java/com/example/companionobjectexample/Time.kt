package com.example.companionobjectexample

import android.view.View

class Time {

    companion object{

        val night = 0
        val day = 1

    }

    fun changeBackground(layout:View,Time:Int){

        when (Time){
            0->{layout.setBackgroundResource(R.drawable.night)}
            1->{layout.setBackgroundResource(R.drawable.day)}
        }

    }
}