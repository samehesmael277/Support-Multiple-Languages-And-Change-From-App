package com.sameh.multiplelanguages

import android.os.Bundle
import com.sameh.multiplelanguages.databinding.ActivityMainBinding
import com.zeugmasolutions.localehelper.Locales

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnglish.setOnClickListener {
            updateLocale(Locales.English)
        }

        binding.btnArabic.setOnClickListener {
            updateLocale(Locales.Arabic)
        }

    }
}