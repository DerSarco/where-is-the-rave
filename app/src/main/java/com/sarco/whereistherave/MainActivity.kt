package com.sarco.whereistherave

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sarco.whereistherave.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
    }
}