package com.example.autismdetection

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.MainThread
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickLister();
    }

    fun onClickLister(){
        var checkAutism = findViewById<CardView>(R.id.cv_check);

        checkAutism.setOnClickListener {
            openCheckActivity()
        }
        }

    fun openCheckActivity(){
        startActivity(Intent(this@MainActivity, CheckActivity::class.java))
    }
}