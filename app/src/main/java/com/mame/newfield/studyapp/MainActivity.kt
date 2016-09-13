package com.mame.newfield.studyapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    //region < initializer >
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button) as Button
        button.setOnClickListener { view ->
            buttonOnClick(view)
        }
    }
    //endregion
    
    //region < control event >
    fun buttonOnClick(v: View?) {
        Toast.makeText(this, "Tapped", Toast.LENGTH_SHORT).show()
    }
    //endregion
}
