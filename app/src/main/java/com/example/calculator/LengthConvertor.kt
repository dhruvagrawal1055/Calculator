package com.example.calculator

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LengthConvertor : AppCompatActivity() {

    var i: Int = 0
    var j: Int = 0
    lateinit var btn00: Button
    lateinit var btnC: FloatingActionButton
    lateinit var btnback: FloatingActionButton
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn0: Button
    lateinit var btndot: Button
    lateinit var spiner: Spinner
    lateinit var spiner2: Spinner
    lateinit var adapter: ArrayAdapter<String>
    lateinit var adapter2: ArrayAdapter<String>
    lateinit var bequal: FloatingActionButton

    val arr = arrayOf("Kilometer", "meter", "centimeter", "Milimeter")
    val arr2 = arrayOf("Kilometer", "meter", "centimeter", "Milimeter")


    lateinit var textView: TextView
    lateinit var textView2: TextView

    var curr: String = ""
    var num: Float = 0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length_convertor)
        supportActionBar?.setElevation(0f)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f3f3f3")))
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        btnC = findViewById(R.id.btnC)
        btn00 = findViewById(R.id.btn00)
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btndot = findViewById(R.id.btndot)
        bequal = findViewById(R.id.btnequal)
        btnback = findViewById(R.id.btnback)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        spiner = findViewById(R.id.spinner)
        spiner2 = findViewById(R.id.spinner2)



        if (spiner != null) {
            adapter = ArrayAdapter(
                this,
                R.layout.spinnertext, arr
            )
            spiner.adapter = adapter


            spiner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?, view: View?, position: Int, id: Long
                ) {
                    i = position

//                    Toast.makeText(this@MainActivity,arr[position],Toast.LENGTH_SHORT).show()
//                    bequal.setOnClickListener {
//                        textView2.text = "${((num - 32) * 5) / 9}"
//                    }

//                    if (arr[position]=="F"){
//                        ccc1()
//                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }

        if (spiner2 != null) {
            adapter2 = ArrayAdapter(
                this,
                R.layout.spinnertext, arr2
            )
            spiner2.adapter = adapter2

            spiner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?, view: View?, position: Int, id: Long
                ) {
                    j = position


//                    Toast.makeText(this@MainActivity,arr[position],Toast.LENGTH_SHORT).show()

//                    if (arr2[position]=="C"){
//                        ccc2()
////
//////                        Toast.makeText(this@MainActivity,"Hello",Toast.LENGTH_SHORT).show()
////
//                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

            }
//            if(arr[i]=="C" && arr2[j]=="C"){
//                textView2.text = "${textView.text}"
//            }


        }




        fun display() {
            textView.text = curr
        }
        bequal.setOnClickListener {
            if (arr[i] == "Kilometer" && arr2[j] == "Kilometer") {
                textView2.text = "${textView.text}"
            }
            if (arr[i] == "meter" && arr2[j] == "meter") {
                textView2.text = "${textView.text}"
            }

            if (arr[i] == "centimeter" && arr2[j] == "centimeter") {
                textView2.text = "${textView.text}"
            }
            if (arr[i] == "Milimeter" && arr2[j] == "Milimeter") {
                textView2.text = "${textView.text}"
            }
            if (arr[i] == "Kilometer" && arr2[j] == "meter") {
                textView2.text = "${(num * 1000)}"
            }
            if (arr[i] == "Kilometer" && arr2[j] == "centimeter") {
                textView2.text = "${(num * 100000)}"
            }
            if (arr[i] == "Kilometer" && arr2[j] == "Milimeter") {
                textView2.text = "${(num * 1000000)}"
            }
            if (arr[i] == "meter" && arr2[j] == "Kilometer") {
                textView2.text = "${(num / 1000)}"
            }
            if (arr[i] == "meter" && arr2[j] == "centimeter") {
                textView2.text = "${(num * 100)}"
            }
            if (arr[i] == "meter" && arr2[j] == "Milimeter") {
                textView2.text = "${(num * 1000)}"
            }
            if (arr[i] == "centimeter" && arr2[j] == "Kilometer") {
                textView2.text = "${(num / 100000)}"
            }
            if (arr[i] == "centimeter" && arr2[j] == "meter") {
                textView2.text = "${(num / 100)}"
            }
            if (arr[i] == "centimeter" && arr2[j] == "Milimeter") {
                textView2.text = "${(num * 10)}"
            }
            if (arr[i] == "Milimeter" && arr2[j] == "Kilometer") {
                textView2.text = "${(num / 1000000)}"
            }
            if (arr[i] == "Milimeter" && arr2[j] == "meter") {
                textView2.text = "${(num / 1000)}"
            }
            if (arr[i] == "Milimeter" && arr2[j] == "centimeter") {
                textView2.text = "${(num / 10)}"
            }


        }

        btnC.setOnClickListener {
            curr = ""
            textView2.text = ""
            display()
        }

        btnback.setOnClickListener {
            if (curr.length == 1) {
                curr = ""
                display()
            }
            if (!curr.equals("")) {
                curr = curr.substring(0, curr.length - 1)
                display()
                num = curr.toString().toFloat()
            }
        }
        btn00.setOnClickListener {
            curr = curr + "00"
            display()
            num = curr.toString().toFloat()
        }

        btndot.setOnClickListener {
            curr = curr + "."
            display()
            num = curr.toString().toFloat()
        }

        btn0.setOnClickListener {

            curr = curr + "0"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn1.setOnClickListener {

            curr = curr + "1"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()


        }
        btn2.setOnClickListener {

            curr = curr + "2"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn3.setOnClickListener {

            curr = curr + "3"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn4.setOnClickListener {

            curr = curr + "4"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn5.setOnClickListener {

            curr = curr + "5"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn6.setOnClickListener {

            curr = curr + "6"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn7.setOnClickListener {

            curr = curr + "7"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn8.setOnClickListener {

            curr = curr + "8"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn9.setOnClickListener {

            curr = curr + "9"
            display()
            num = curr.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }

    }
}
