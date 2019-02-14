package com.example.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val list = listOf(1, 2, 3, 4, 5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.i("kingiyu", "MainActivity-->-->onCreate-->${list.fold(0) { total1, next1 -> total1 + next1 }}")
//        Log.i("kingiyu", "MainActivity-->-->onCreate-->${list.max()}")
//
//        list.forEach(fun(value: Int) {
//            if (value < 3) return
//            Log.i("kingiyu", "MainActivity-->-->-->$value")
//        })
        list.forEach fff@{
            if (it > 3) return@fff
            Log.i("kingiyu", "MainActivity-->-->onCreate-->$it")
        }
//        list.forEach {
//            Log.i("kingiyu", "MainActivity-->-->onCreate-->$it")
//        }
        var user = User("king", 11)
        var oldUser = user.copy(age = 15)
        Log.i("kingiyu", "MainActivity-->-->onCreate-->oldUser-->"+oldUser.age+"-->"+oldUser.name1)
    }

    data class User(var name1:String,var age:Int){

    }

}
