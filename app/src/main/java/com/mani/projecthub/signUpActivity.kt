package com.mani.projecthub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mani.projecthub.databinding.ActivitySignUpBinding

class signUpActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    private fun setupActionBar(){
        setSupportActionBar(binding.toolbarSignUpActivity)
    }
}