package com.example.michelleaca.budgetchecklistapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun checkList (view: View) {
        val checkListIntent = Intent(this, Checklist::class.java)
        startActivity(checkListIntent)
    }
}
