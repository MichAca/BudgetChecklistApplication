package com.example.michelleaca.budgetchecklistapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        budget_Btn.setOnClickListener{
            val budgetInt = Intent(this, Budget::class.java)
            startActivity(budgetInt)
        }

        checkList_Btn.setOnClickListener{
            val checklistInt = Intent(this, Checklist::class.java)
            startActivity(checklistInt)
        }



    }


}
