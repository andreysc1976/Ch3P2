package ru.a_party.ch3p2.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a_party.ch3p2.R
import ru.a_party.ch3p2.databinding.ActivityMainBinding

class MainActivity : BaseActivity<AppState>(){

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}