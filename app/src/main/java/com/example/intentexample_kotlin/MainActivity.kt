package com.example.intentexample_kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edit_name:EditText
    lateinit var  edit_city:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         edit_name=findViewById<EditText>(R.id.nameid)
         edit_city=findViewById<EditText>(R.id.cityid)

         button=findViewById<Button>(R.id.button_next)

         button.setOnClickListener {
             val intent:Intent = Intent(this@MainActivity,Displaydata::class.java)
             var  name = edit_name.text.toString()
             var  city = edit_city.text.toString()
             intent.putExtra("Name", name)
             intent.putExtra("City", city)
             startActivity(intent)
             Toast.makeText(applicationContext,"Display data:Name $name city:$city" ,Toast.LENGTH_SHORT).show()
         }
    }


    fun action(v:View)
    {

        intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://www.google.com/"))
        startActivity(intent)
    }



}
