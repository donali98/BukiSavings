package com.example.bukisavings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity(),FragmentHelper {
    lateinit var args:HomeActivityArgs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        args = HomeActivityArgs.fromBundle(this.intent.extras!!)
    }

    override fun getUserId(): Long  = args.userId
}
