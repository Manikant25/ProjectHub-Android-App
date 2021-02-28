package com.mani.projecthub.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.mani.projecthub.R
import com.mani.projecthub.databinding.ActivitySignUpBinding

class signUpActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setupActionBar()
    }

    private fun setupActionBar(){
        setSupportActionBar(binding.toolbarSignUpActivity)

        val actionBar=supportActionBar
        //check if action bar exist
        if(actionBar!=null){
           actionBar.setDisplayHomeAsUpEnabled(true)
           actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }
        binding.toolbarSignUpActivity.setNavigationOnClickListener{ onBackPressed()}
    }

}