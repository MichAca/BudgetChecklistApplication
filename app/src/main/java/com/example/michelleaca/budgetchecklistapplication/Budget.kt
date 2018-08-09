package com.example.michelleaca.budgetchecklistapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_budget.*
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import com.xwray.groupie.Item


class Budget : AppCompatActivity() {

    val adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget)

            supportActionBar?.title = "Budget"

            budget_item_textView.adapter = adapter  // showing the message in the screen

            //val user = intent.getParcelableExtra<User>(NewMessageActivity.USER_KEY)

            //supportActionBar?.title = user.username

            //setupDummyData()
                    //listenForMessages()

        budget_add_button.setOnClickListener {
            Log.d("BudgetActivity", "attempt to add line item")
            //addToBudgetlist()
        }
    }

//    private fun addToBudgetlist(){
//
//        val text = budget_input_textView.text.toString()
//
//        val id = FirebaseAuth.getInstance().uid
//        val user = intent.getParcelableExtra<User>(NewMessageActivity.USER_KEY)
//        val toId = user.uid
//
//        if (id == null) return
//
//        val reference = FirebaseDatabase.getInstance().getReference("/messages").push()
//
//        val budget = Budget(reference.key!!, text, id)
//        reference.setValue(budget)
//                .addOnSuccessListener {
//                    Log.d("BudgetActivity", "budget item saved: ${reference.key}") //getting the id
//                }
//
//    }




    }


}
