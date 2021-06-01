package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.gotoRan)
        cardRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
//            val shuffledNumbers = getShuffledLottoNumbers ()
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
//            intent.putIntegerArrayListExtra("result", ArrayList(shuffledNumbers))
            startActivity(intent)
        }
        val cardConstell = findViewById<CardView>(R.id.gotoCons)
        cardConstell.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        val cardName = findViewById<CardView>(R.id.gotoName)
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
/*        val numbers = listOf(1, 2, 3, 4)
//        println(numbers)
//        numbers.forEach { numbers -> println(numbers) }
          numbers.forEach { number -> println(number) }
//        numbers.forEach { println(it) }
        val mutableNumbers = mutableListOf<Int>(5, 6, 7, 8)
        mutableNumbers.add(9)
        mutableNumbers.forEach { mutableNumber -> println(mutableNumber) }*/

/*        val b = 10
        b.plus(1)
        println(b)
        println(b.plus(1))*/
    }
}
fun getRandomLottoNumber (): Int{
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

//    (1..6).forEach {
/*    for(i in 1..6){
*//*        var number = 0
        do{
           number = getRandomLottoNumber()
        }while(lottoNumbers.contains(number))
        lottoNumbers.add(number)*//*
        lottoNumbers.add(getRandomLottoNumber(1))
    }*/
    // 1. From scratch
/*    while(true){
        var number: Int = getRandomLottoNumber()
        var flagExisting: Int = 0
        for(j in 0..lottoNumbers.size){
            if(number.equals(lottoNumbers[j])) {
                flagExisting = 1
                break;
            }
        }
        if (flagExisting.equals(1))
            continue
        else
            lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
            break;
    }*/
    // 2. Using "contains()"
    /*   while(true){
           var number: Int = getRandomLottoNumber()
           var flagExisting: Int = 0
           if(lottoNumbers.contains(number)) {
               flagExisting = 1
                   break;
           }
           if (flagExisting.equals(1))
               continue
           else
               lottoNumbers.add(number)
           if(lottoNumbers.size >= 6)
               break;
       }*/
    // 3.
    for(i in 1..6){
        var number = 0
        do{
            number = getRandomLottoNumber()
        }while(lottoNumbers.contains(number))
        lottoNumbers.add(number)
    }

    return lottoNumbers
}

/*fun getShuffledLottoNumbers () : MutableList<Int>{
val list = mutableListOf<Int>()
for(number in 1..45){
    list.add(number)
}
list.shuffle()
return list.subList(0, 6)
}*/