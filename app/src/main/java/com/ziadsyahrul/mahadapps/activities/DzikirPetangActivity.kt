package com.ziadsyahrul.mahadapps.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziadsyahrul.mahadapps.R

class DzikirPetangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)


        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar_petang)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}