package com.example.teqdatvaliereba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var pirveliori : EditText
    private lateinit var meoreori : EditText
    private lateinit var samiricxvi : EditText
    private lateinit var piradi : EditText


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun shesvla (view: View){
        pirveliori=findViewById(R.id.pirveliori)
        meoreori=findViewById(R.id.meoreori)
        samiricxvi=findViewById(R.id.samiricxvi)
        piradi=findViewById(R.id.piradi)

        if (pirveliori.length() != 2 || meoreori.length() != 2 || piradi.length() != 11 || samiricxvi.length() != 3){
            Toast.makeText(this , "არასწორია" , Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this , "თქვენ წარმატებით შეხვედით" , Toast.LENGTH_SHORT).show()
        }

    }
}