package com.example.gui1

import android.app.Activity
import android.widget.Button
import android.widget.TextView
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gui1.ui.theme.Gui1Theme

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Default Text"
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            textView.setTextColor(Color.RED)
            textView.textSize = 30f
            textView.setTypeface(null, Typeface.BOLD_ITALIC)
            textView.text = "New Text!"
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}