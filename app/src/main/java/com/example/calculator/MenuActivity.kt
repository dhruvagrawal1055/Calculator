package com.example.calculator

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MenuActivity : AppCompatActivity() {
    lateinit var ScientificCalculator:ImageButton
    lateinit var DiscountCalculator:ImageButton
    lateinit var bmiCalculator:ImageButton
    lateinit var lengthConvertor:ImageButton
    lateinit var areaConvertor:ImageButton
    lateinit var VolumeConvertor:ImageButton
    lateinit var TempConvertor:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.setElevation(0f)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f3f3f3")))
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)

        ScientificCalculator=findViewById(R.id.ScientificCalculator)
        DiscountCalculator=findViewById(R.id.DiscountCalculator)
        bmiCalculator=findViewById(R.id.bmiCalculator)
        lengthConvertor=findViewById(R.id.lengthconvertor)
        areaConvertor=findViewById(R.id.areaConvertor)
        VolumeConvertor=findViewById(R.id.VolumeConvertor)
        TempConvertor=findViewById(R.id.TempConvertor)

        ScientificCalculator.setOnClickListener {
            val intent = Intent(this@MenuActivity,Scientific::class.java)
            startActivity(intent)
        }

        DiscountCalculator.setOnClickListener {
            val intent=Intent(this@MenuActivity,com.example.calculator.DiscountCalculator::class.java)
            startActivity(intent)
        }

        bmiCalculator.setOnClickListener {
            val intent=Intent(this@MenuActivity,BmiCalculator::class.java)
            startActivity(intent)
        }

        lengthConvertor.setOnClickListener {
            val intent = Intent(this@MenuActivity,LengthConvertor::class.java)
            startActivity(intent)
        }

        areaConvertor.setOnClickListener {
            val intent = Intent(this@MenuActivity,AreaConvertor::class.java)
            startActivity(intent)
        }

        VolumeConvertor.setOnClickListener {
            val intent =Intent(this@MenuActivity,com.example.calculator.VolumeConvertor::class.java)
            startActivity(intent)
        }

        TempConvertor.setOnClickListener {
            val intent=Intent(this@MenuActivity,com.example.calculator.TempConvertor::class.java)
            startActivity(intent)
        }

    }
}