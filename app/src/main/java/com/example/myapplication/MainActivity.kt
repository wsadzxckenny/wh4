package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // var mydata= arrayOf("james1","John1" , "Mary1")
        val myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        myAdapter.addAll("james1","John1" , "Mary1")
        mylist.adapter=myAdapter
        button.setOnClickListener{
            myAdapter.add("test")
        }

        mylist.setOnItemClickListener{ parent, view, pos, id ->
            var msg = myAdapter.getItem(pos)
            // Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
            alert ("確定要刪除$msg"){
                yesButton {
                    myAdapter.remove(msg)

                }
                noButton {  }
            }.show()


        }

    }
    }






