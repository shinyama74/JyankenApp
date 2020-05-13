package com.example.jyankenapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener {
            Player.text="あなたの手はグーです"
            val number : Int = Random.nextInt(3)

            when(number){
                0-> {
                    showResult("相手の手はグーです","引き分けです","#8a000000")
                }
                1-> {
                    showResult("相手の手はチョキです","あなたの勝ちです","#f44336")
                }
                2-> {
                    showResult("相手の手はパーです","あなたの負けです","#2196f3")
                }
            }
        }

        chokiButton.setOnClickListener {
            Player.text="あなたの手はチョキです"
            val number : Int = Random.nextInt(3)

            when(number){
                0-> {
                    showResult("相手の手はグーです","あなたの負けです","#2196f3")
                }
                1-> {
                    showResult("相手の手はチョキです","引き分けです","#8a000000")
                }
                2-> {
                    showResult("相手の手はパーです","あなたの勝ちです","#f44336")
                }
            }
        }

        paaButton.setOnClickListener {
            Player.text="あなたの手はパーです"
            val number : Int = Random.nextInt(3)

            when(number){
                0-> {
                    showResult("相手の手はグーです","あなたの勝ちです","#f44336")
                }
                1-> {
                    showResult("相手の手はチョキです","あなたの負けです","#2196f3")
                }
                2-> {
                    showResult("相手の手はパーです","引き分けです","#8a000000")
                }
            }
        }


    }

    fun showResult(cpuHand:String, resultText:String,resultColor:String){
        cpu.text=cpuHand
        result.text=resultText
        result.setTextColor(Color.parseColor(resultColor))
    }
}
