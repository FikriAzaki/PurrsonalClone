package com.capstoneproject.purrsonalcatapp.ui.diagnosis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.capstoneproject.purrsonalcatapp.R
import com.capstoneproject.purrsonalcatapp.ui.home.MainActivity
import com.capstoneproject.purrsonalcatapp.ui.user.UserActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class DiagnosisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosis)

        val navigationView = findViewById<BottomNavigationView>(R.id.navigation)
        navigationView.setOnNavigationItemSelectedListener{menuItem ->
            when (menuItem.itemId){
                R.id.action_home ->{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_user ->{
                    val intent = Intent(this, UserActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }


}