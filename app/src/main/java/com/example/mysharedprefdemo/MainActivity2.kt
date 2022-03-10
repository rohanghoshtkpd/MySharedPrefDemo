package com.example.mysharedprefdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.datastore.preferences.preferencesDataStore

class MainActivity2 : AppCompatActivity() {

    private val Context.dataStoreInstance by preferencesDataStore(
        name = "MyDemoPrefFile1"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


}