package com.example.calculator

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DiscountCalculator : AppCompatActivity() {
    // declaring variables for our text view and button
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
    lateinit var bequal: FloatingActionButton

    lateinit var price:EditText
    lateinit var discount:EditText

    lateinit var famount:TextView

    var currprice: String = ""
    var currdiscount:String=""
    var pricef: Float =0f
    var discountf:Float=0f
    var amountf: Float =0f
    var i:Boolean=false
    var j:Boolean=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discount_calculator)
        supportActionBar?.setElevation(0f)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f3f3f3")))
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        //initializing number buttons
        btnC=findViewById(R.id.btnC)
        btn00=findViewById(R.id.btn00)
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
        bequal = findViewById(R.id.btnequal)
        btnback=findViewById(R.id.btnback)
        price=findViewById(R.id.price)
        discount=findViewById(R.id.discount)
        famount=findViewById(R.id.famount)

        price.showSoftInputOnFocus=false
        discount.showSoftInputOnFocus=false

        price.setOnFocusChangeListener { view, edtpricef ->
            if(edtpricef){
                i=true;
            }
            else{
                i=false;
            }
        }
        discount.setOnFocusChangeListener { view, edtdiscountf ->
            if (edtdiscountf){
                j=true;
            }
            else{
                j=false;
            }
        }

        fun display() {
            if (i) {
                price.setText(currprice)
                price.setSelection(price.length())
            }
            if(j){
                discount.setText(currdiscount)
                discount.setSelection(discount.length())
            }
        }

        btnC.setOnClickListener {
            price.setText("")
            discount.setText("")
            currprice =""
            currdiscount=""
            famount.text=""
            pricef=0f;
            discountf=0f;
            amountf=0.0f;

        }

        btnback.setOnClickListener {
            if(i){

                if (!currprice.equals("")) {
                    if(currprice.length==1){
                        currprice=""
                        display()
                        pricef=0f
                    }
                    else {
                        currprice = currprice.substring(0, currprice.length - 1)
                        display()
                        pricef = currprice.toString().toFloat()
                    }
                }
            }
            if (j){

                if (!currdiscount.equals("")) {
                    if(currdiscount.length==1){
                        currdiscount=""
                        display()
                        discountf=0f
                    }
                    else {
                        currdiscount = currdiscount.substring(0, currdiscount.length - 1)
                        display()
                        discountf = currdiscount.toString().toFloat()
                    }
                }
            }
        }
        btndot.setOnClickListener {
            if(i) {
                currprice = currprice + "."
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "."
                display()
                discountf = currdiscount.toString().toFloat()
            }
        }
        btn0.setOnClickListener {
            if(i) {
                currprice = currprice + "0"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "0"
                display()
                discountf = currdiscount.toString().toFloat()
            }
        }
        btn00.setOnClickListener {
            if(i) {
                currprice = currprice + "00"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "00"
                display()
                discountf = currdiscount.toString().toFloat()
            }
        }
        btn1.setOnClickListener {
            if(i) {
                currprice = currprice + "1"
                display()
                pricef = currprice.toString().toFloat()
            }
            if (j){
                currdiscount = currdiscount + "1"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn2.setOnClickListener {

            if(i) {
                currprice = currprice + "2"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "2"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn3.setOnClickListener {

            if(i) {
                currprice = currprice + "3"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "3"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn4.setOnClickListener {

            if(i) {
                currprice = currprice + "4"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "4"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn5.setOnClickListener {

            if(i) {
                currprice = currprice + "5"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "5"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn6.setOnClickListener {

            if(i) {
                currprice = currprice + "6"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "6"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn7.setOnClickListener {

            if(i) {
                currprice = currprice + "7"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "7"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn8.setOnClickListener {

            if(i) {
                currprice = currprice + "8"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "8"
                display()
                discountf = currdiscount.toString().toFloat()
            }

        }
        btn9.setOnClickListener {

            if(i) {
                currprice = currprice + "9"
                display()
                pricef = currprice.toString().toFloat()
            }
            if(j){
                currdiscount = currdiscount + "9"
                display()
                discountf = currdiscount.toString().toFloat()
            }
        }
        bequal.setOnClickListener {
            if(discountf>=100){
                Toast.makeText(this@DiscountCalculator,"Please enter discount in range ",Toast.LENGTH_SHORT).show()
            }
            else {
                amountf = pricef - ((pricef * discountf) / 100)
                famount.text = "%.2f".format(amountf)
            }
        }
    }
}