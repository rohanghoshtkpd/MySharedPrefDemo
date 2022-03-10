package com.example.mysharedprefdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {

    private val Context.dataStoreInstance by preferencesDataStore(
        name = "MyDemoPrefFile2"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        getDataFromPreference()
    }

    private fun getDataFromPreference() {
        GlobalScope.launch {
            dataStoreInstance.data.collect {
                Log.e("Hiii",it[stringPreferencesKey("name")]?:"")
            }
        }

//        dataStoreInstance.data.map {
//            data->
//            Log.e("Hiii",data[stringPreferencesKey("name")]?:"")
//        }
    }


}