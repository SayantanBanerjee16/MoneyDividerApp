package com.sayantanbanerjee.moneydividerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var amount1numberText: EditText
    private lateinit var amount2numberText: EditText
    private lateinit var display: TextView
    private lateinit var calculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amount1numberText = findViewById(R.id.person1amount)
        amount2numberText = findViewById(R.id.person2amount)
        display = findViewById(R.id.display)
        calculate = findViewById(R.id.calculate)

        calculate.setOnClickListener {
            val amount1 = amount1numberText.text.toString()
            val amount2 = amount2numberText.text.toString()
            if (amount1 == "" || amount2 == "") {
                Toast.makeText(this, "No field should remain empty", Toast.LENGTH_SHORT).show()
            } else {
                if (amount1 == amount2) {
                    display.text = getString(R.string.amountEqual)
                } else if (amount1 > amount2) {
                    val diff = amount1.toInt() - amount2.toInt()
                    display.text = getString(R.string.amount1more) + " " + diff.toString()
                } else {
                    val diff = amount2.toInt() - amount1.toInt()
                    display.text = getString(R.string.amount2more) + " " + diff.toString()
                }
            }
        }
    }
}