package com.example.myapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menyembunyikan ActionBar di MainActivity2
        supportActionBar?.hide()

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        // Menentukan NavController untuk BottomNavigationView
        val navController = findNavController(R.id.nav_host_fragment_activity_main2)

        // Menyiapkan BottomNavigationView dengan NavController
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_activity_main2)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}