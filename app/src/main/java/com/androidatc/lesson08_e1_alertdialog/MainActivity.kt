package com.androidatc.lesson08_e1_alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save(view: View) {
        val SaveAlert= AlertDialog.Builder(this)

        SaveAlert.setTitle("Save")
        SaveAlert.setMessage("Are you sure you want to save changes?")

        SaveAlert.setPositiveButton("Yes") {
            dialogInterface: DialogInterface?, which: Int -> Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()
        }
        SaveAlert.setNegativeButton("No") {
            dialogInterface: DialogInterface?, which: Int -> Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
        }
        SaveAlert.setNeutralButton("Remind me later") {
            dialogInterface: DialogInterface?, which: Int -> Toast.makeText(applicationContext,"Remind me later",Toast.LENGTH_LONG).show()
        }

        SaveAlert.show()
    }
}
