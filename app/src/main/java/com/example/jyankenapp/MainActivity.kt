package com.example.jyankenapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        gooButton.setOnClickListener {
            myHand.setImageResource(R.drawable.mygoo)
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    showResult("引き分けです", "#8a000000")
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    showResult("あなたの勝ちです", "#f44336")
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    showResult("あなたの負けです", "#2196f3")
                }
            }
        }

        chokiButton.setOnClickListener {
            myHand.setImageResource(R.drawable.mychoki)
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    showResult("あなたの負けです", "#2196f3")
                    cpu.setImageResource(R.drawable.goo)
                }
                1 -> {
                    showResult("引き分けです", "#8a000000")
                    cpu.setImageResource(R.drawable.choki)
                }
                2 -> {
                    showResult("あなたの勝ちです", "#f44336")
                    cpu.setImageResource(R.drawable.paa)
                }
            }
        }

        paaButton.setOnClickListener {
            myHand.setImageResource(R.drawable.mypaa)
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    showResult("あなたの勝ちです", "#f44336")
                    cpu.setImageResource(R.drawable.goo)
                }
                1 -> {
                    showResult("あなたの負けです", "#2196f3")
                    cpu.setImageResource(R.drawable.choki)
                }
                2 -> {
                    showResult("引き分けです", "#8a000000")
                    cpu.setImageResource(R.drawable.paa)
                }
            }
        }


    }

    fun showResult(resultText: String, resultColor: String) {
        result.text = resultText
        result.setTextColor(Color.parseColor(resultColor))
    }
}
