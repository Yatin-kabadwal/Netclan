package com.example.netclan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ExploreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val buttonRefine = findViewById<Button>(R.id.button_refine)
        buttonRefine.setOnClickListener {
            val intent = Intent(this, RefineActivity::class.java)
            startActivity(intent)
        }
    }
}
