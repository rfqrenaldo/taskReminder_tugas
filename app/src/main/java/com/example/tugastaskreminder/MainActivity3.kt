package com.example.tugastaskreminder

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugastaskreminder.databinding.ActivityMain2Binding
import com.example.tugastaskreminder.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val title = intent.getStringExtra("title")
        val repeat = intent.getStringExtra("repeat")
        val time = intent.getStringExtra("time")
        val date = intent.getStringExtra("date")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding) {
            txtTitle.text = title
            txtRepeat.text = "Repeated " + repeat
            txtTime.text = time
            txtDate.text = date
            button3.setOnClickListener {
                finish()
            }
        }
    }
}