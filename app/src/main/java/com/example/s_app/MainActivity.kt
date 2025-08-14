package com.example.s_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rooms = arrayOf(
            "Juniper",
            "Maple",
            "Cedar",
            "Birch",
            "Oak",
            "Pine",
            "Spruce",
            "Willow",
            "Aspen",
            "Elm",
            "Alder",
            "Holly",
            "Hazel",
            "Rowan",
            "Beech",
            "Linden",
            "Poplar",
            "Sycamore",
            "Chestnut",
            "Magnolia"
        )

        for (i in 0..rooms.size) {
            println("Переговорки в офисе: ${rooms[i]}")
        }
    }
}