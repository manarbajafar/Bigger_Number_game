package com.example.numbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var points=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pickRandomNumbers()
    }
fun pickRandomNumbers(){
    val l=findViewById<Button>(R.id.leftButton)
    val r=findViewById<Button>(R.id.rightButton)

    var num1=(0..100).random()
    var num2=(0..100).random()
    while(num1 == num2){
        pickRandomNumbers()
    }
    l.text="$num1"
    r.text="$num2"
}
    fun leftButtonClick(view: View){
        val l=findViewById<Button>(R.id.leftButton)
        val r=findViewById<Button>(R.id.rightButton)
        val leftNum=l.text.toString().toInt()
        val rightNum=r.text.toString().toInt()
        if(leftNum > rightNum){
            points++
        }
        else{
            points--
        }
        findViewById<TextView>(R.id.points).text="points: $points"
        pickRandomNumbers()
    }

    fun rightButtonClick(view: View){
        val l=findViewById<Button>(R.id.leftButton)
        val r=findViewById<Button>(R.id.rightButton)
        val leftNum=l.text.toString().toInt()
        val rightNum=r.text.toString().toInt()
        if(leftNum < rightNum){
            points++
        }
        else{
            points--
        }
        findViewById<TextView>(R.id.points).text="points: $points"
        pickRandomNumbers()
    }
}
