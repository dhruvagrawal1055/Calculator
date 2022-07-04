package com.example.calculator

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BmiCalculator : AppCompatActivity() {
    var i:Boolean=false
    var j:Boolean=false
    var pos: Int=0
    //    lateinit var btnS:Button
    lateinit var btnC: FloatingActionButton
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
    lateinit var btnback:FloatingActionButton
    //    lateinit var btndiv: Button
    lateinit var spiner: Spinner
    lateinit var txtweight: TextView
    lateinit var bmitxt: TextView
    lateinit var adapter: ArrayAdapter<String>
    //    lateinit var bminus: Button
    lateinit var btnequal: FloatingActionButton
    lateinit var btndot: Button

    val arr= arrayListOf<String>("Feet","Cm");



    lateinit var edtTxtHeight: EditText
    lateinit var edtTxtWeight: EditText

    var currheight: String = ""
    var currweight:String=""
    var height: Float =0f
    var weight:Float=0f
    var bmi: Float =0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        supportActionBar?.setElevation(0F)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f3f3f3")))
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)

        btnC = findViewById(R.id.btnC)
//        btnS = findViewById(R.id.btnS)
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
        btndot=findViewById(R.id.btndot)
        btnequal=findViewById(R.id.btnequal)
        edtTxtHeight = findViewById(R.id.edtTxtHeight)
        edtTxtWeight = findViewById(R.id.edtTxtWeight)
        btnback=findViewById(R.id.btnback)


        spiner = findViewById(R.id.spinner)
        txtweight = findViewById(R.id.txtweight)
        bmitxt = findViewById(R.id.bmi)
        edtTxtHeight.showSoftInputOnFocus=false
        edtTxtWeight.showSoftInputOnFocus=false



        if (spiner != null) {
            adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arr)
            spiner.adapter = adapter


            spiner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                    Toast.makeText(this@MainActivity,arr[position],Toast.LENGTH_SHORT).show()
//                    bequal.setOnClickListener {
//                        textView2.text = "${((num - 32) * 5) / 9}"
//                    }
                    pos=position
                    if(position==0){
                        txtweight.text="Pound";
                    }
                    else{
                        txtweight.text="Kg";
                    }


                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }


        edtTxtHeight.setOnFocusChangeListener { view, edtheight ->
            if(edtheight){
                i=true;
            }
            else{
                i=false;
            }
        }
        edtTxtWeight.setOnFocusChangeListener { view, edtweight ->
            if (edtweight){
                j=true;
            }
            else{
                j=false;
            }
        }



        fun display() {
            if (i) {
                edtTxtHeight.setText(currheight)
                edtTxtHeight.setSelection(edtTxtHeight.length())
            }
            if(j){
                edtTxtWeight.setText(currweight)
                edtTxtWeight.setSelection(edtTxtWeight.length())
            }
        }

        btnC.setOnClickListener {
            edtTxtHeight.setText("")
            edtTxtWeight.setText("")
            currheight =""
            currweight=""
            bmitxt.text=""
            height=0f;
            weight=0f;
            bmi=0.0f;

        }

        btnback.setOnClickListener {
            if(i){

                if (!currheight.equals("")) {
                    currheight = currheight.substring(0, currheight.length - 1)
                    display()
                }
            }
            if (j){

                if (!currweight.equals("")) {
                    currweight = currweight.substring(0, currweight.length - 1)
                    display()
                }
            }
        }
        btndot.setOnClickListener {
            if(i) {
                currheight = currheight + "."
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "."
                display()
                weight = currweight.toString().toFloat()
            }
        }

        btn0.setOnClickListener {
            if(i) {
                currheight = currheight + "0"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "0"
                display()
                weight = currweight.toString().toFloat()
            }
        }
        btn1.setOnClickListener {
            if(i) {
                currheight = currheight + "1"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if (j){
                currweight = currweight + "1"
                display()
                weight = currweight.toString().toFloat()
            }

        }
        btn2.setOnClickListener {

            if(i) {
                currheight = currheight + "2"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "2"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn3.setOnClickListener {

            if(i) {
                currheight = currheight + "3"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "3"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn4.setOnClickListener {

            if(i) {
                currheight = currheight + "4"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "4"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn5.setOnClickListener {

            if(i) {
                currheight = currheight + "5"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "5"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn6.setOnClickListener {

            if(i) {
                currheight = currheight + "6"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "6"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn7.setOnClickListener {

            if(i) {
                currheight = currheight + "7"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "7"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn8.setOnClickListener {

            if(i) {
                currheight = currheight + "8"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "8"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
        btn9.setOnClickListener {

            if(i) {
                currheight = currheight + "9"
                display()
                height = currheight.toString().toFloat()
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
            }
            if(j){
                currweight = currweight + "9"
                display()
                weight = currweight.toString().toFloat()
            }
//                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()

        }
//            btndiv.setOnClickListener {
//
//                if(i) {
//                    currheight = currheight + "/"
//                    display()
//                    height = currheight.toString().toFloat()
////                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
//                }
//                if(j){
//                    currweight = currweight + "/"
//                    display()
//                    weight = currweight.toString().toFloat()
//                }
////                Toast.makeText(this@MainActivity,"$curr",Toast.LENGTH_LONG).show()
//            }
        btnequal.setOnClickListener {
            if(pos==0){
//                val int = height.toInt()
                weight = weight*0.45392.toFloat()
//                val heightf:Float = ((int*12)+(point*1.2)).toFloat()
                height=height*30.48.toFloat()
                bmi=((weight / (height * height)) * 10000)
            }
            if(pos==1) {
                bmi = ((weight / (height * height)) * 10000)
            }
            bmitxt.text = "%.2f".format(bmi)
        }
    }
}