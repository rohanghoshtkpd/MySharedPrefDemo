package com.example.mysharedprefdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val set: MutableSet<String> = HashSet()
        set.add("object 1");
        set.add("object 2");
        set.add("object 3");
        set.add("object 4");


        val editor1 = getSharedPreferences("MyDemoPrefFile1", MODE_PRIVATE).edit()
        editor1.putString("name", "Rohan")
       editor1.putStringSet("demoSetString",set)
        editor1.apply()



        val editor2 = getSharedPreferences("MyDemoPrefFile2", MODE_PRIVATE).edit()
        editor2.putString("name", "Rohan")
        editor2.putInt("demoNum", 12)
        editor2.apply()
    }

    fun goToNextActivity(view: View) {
        startActivity(Intent(this,MainActivity2::class.java))
    }
}