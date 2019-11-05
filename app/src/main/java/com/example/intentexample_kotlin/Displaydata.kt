package com.example.intentexample_kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Displaydata : AppCompatActivity()

{
    lateinit var  data_name:TextView
    lateinit var  data_city:TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
//Optional
        data_name=findViewById<TextView>(R.id.text_name)
        data_city=findViewById<TextView>(R.id.text_city)

        //Getting data through Intent

     /*  var strUser: String = intent.getStringExtra("Name")
         var strCity: String = intent.getStringExtra("City")*/

        //Getting data through Bundle

        val bundle: Bundle? = intent.extras
        val strUser = bundle!!.getString("Name")
        val strCity = bundle!!.getString("City")


          data_name.setText(strUser)
          data_city.setText(strCity)




  }


    fun back_action(v: View)
    {
        val intent: Intent = Intent(this@Displaydata,MainActivity::class.java)
        startActivity(intent)
    }
}