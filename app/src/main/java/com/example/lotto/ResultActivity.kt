package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {

//    val imageView1id = R.id.imageView1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 1) get result
        val result = intent.getIntegerArrayListExtra("result") // ?: return

        // 2) sort the array
//        val result_sorted = result?.let { result.sortedBy{it} }
        result?.let{
            updateLottoBallImages(result.sortedBy{it})
        }

        // 3) set images


    }

    //    private fun updateLottoBallImages(result_sorted : ArrayList<Int>) {
    private fun updateLottoBallImages(result_sorted : List<Int>) {
        val lottoImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView4)
        val imageView2 = findViewById<ImageView>(R.id.imageView5)
        val imageView3 = findViewById<ImageView>(R.id.imageView6)
        val imageView4 = findViewById<ImageView>(R.id.imageView7)
        val imageView5 = findViewById<ImageView>(R.id.imageView8)
        val imageView6 = findViewById<ImageView>(R.id.imageView9)

        imageView1.setImageResource(lottoImageStartId + result_sorted?.get(0)!! - 1)
        imageView2.setImageResource(lottoImageStartId + result_sorted?.get(1) - 1)
        imageView3.setImageResource(lottoImageStartId + result_sorted?.get(2) - 1)
        imageView4.setImageResource(lottoImageStartId + result_sorted?.get(3) - 1)
        imageView5.setImageResource(lottoImageStartId + result_sorted?.get(4) - 1)
        imageView6.setImageResource(lottoImageStartId + result_sorted?.get(5) - 1)
    }
}