package com.example.michelleaca.budgetchecklistapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_checklist.*


/*class CheckListItem {

    companion object  Factory {
        fun create (): CheckListItem = CheckListItem()
    }

    var objectId: String? = null
    var itemText: String? = null
    var done: Boolean? = false
}
*/
class Checklist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist)
    }

    fun add (view: View) {

       var editText = findViewById<View>(R.id.entryText) as EditText
        val input = editText.text.toString()
        display (input)
    }

    private fun display (text: String) {
        var input = checklist_listView.toString()

    }
}
