package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // findViewById allows us to find an element in our layout.
        //Inside <> , we place the type of view. Remember a "view" refers to an element
        // Use R.id to find/state the name of the view id
        //Import Button
        //Create a variable to store button
        val button = findViewById<Button>(R.id.learnMoreButton)

        //Listen for when the user clicks on the button
        button.setOnClickListener {
            //Use android logs to display a message
            Log.v("Hello World", "Button Clicked")
            //Show a message to the user
            //Provide a context which is the activity: "This"
            //Use .show to show the toast/message to the user
            Toast.makeText(this, "Learn more about VSU", Toast.LENGTH_SHORT).show()
        }
    }
}