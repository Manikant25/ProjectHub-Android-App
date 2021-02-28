package com.mani.projecthub.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.mani.projecthub.databinding.ActivityIntroBinding

class introActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding.btnSignUpIntro.setOnClickListener{
            startActivity(Intent(this, signUpActivity::class.java))
        }
        binding.btnSignInIntro.setOnClickListener{
            startActivity(Intent(this, signInActivity::class.java))
        }

    }

}