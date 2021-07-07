package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*
    * MainActivity class is extending AppCompatActivity class
    *
    * AppCompatActivity contains a lot of methods inside it's implementation e.g. onCreate, onPause etc.
    * onCreate is a lifecycle method and is executed whenever this activity is first created.
    *
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
    /*
    * Notes on Intent:
    * Intent is a class and is way to move from one process to another process.
    * During the moving process, we can pass along some data as well. Passing data is done using
    * intent.putExtra() method
    *
    * as an example:
    * Intent is being used here to go from one MainActivity Screen to BirthdayGreeting screen.
    * */
        val name = inputName.editableText.toString()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }


}