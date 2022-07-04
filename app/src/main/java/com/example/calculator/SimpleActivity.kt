package com.example.calculator

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SimpleActivity : AppCompatActivity() {

    //Declaring Number buttons
    lateinit var btnC: Button
    lateinit var btnpercent: Button
    lateinit var btnback: ImageButton
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn00: Button
    lateinit var btn0: Button
    lateinit var btndot: Button
    lateinit var btndivide: FloatingActionButton
    lateinit var btnmultiply: FloatingActionButton
    lateinit var btnsubtract: FloatingActionButton
    lateinit var btnadd: FloatingActionButton
    lateinit var btnequal: FloatingActionButton
    //Declaring text fields
    lateinit var edtTxteqn: EditText
    lateinit var answer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        supportActionBar?.setElevation(0f)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f3f3f3")))
        supportActionBar?.setDisplayShowTitleEnabled(false)

                btnC=findViewById(R.id.btnC)
                btnpercent=findViewById(R.id.btnpercent)
                btnback=findViewById(R.id.btnback)
                btn1=findViewById(R.id.btn1)
                btn2=findViewById(R.id.btn2)
                btn3=findViewById(R.id.btn3)
                btn4=findViewById(R.id.btn4)
                btn5=findViewById(R.id.btn5)
                btn6=findViewById(R.id.btn6)
                btn7=findViewById(R.id.btn7)
                btn8=findViewById(R.id.btn8)
                btn9=findViewById(R.id.btn9)
                btn00=findViewById(R.id.btn00)
                btn0=findViewById(R.id.btn0)
                btndot=findViewById(R.id.btndot)
                btndivide=findViewById(R.id.btndivide)
                btnmultiply=findViewById(R.id.btnmul)
                btnsubtract=findViewById(R.id.btnsubtract)
                btnadd=findViewById(R.id.btnequal)
                btnequal=findViewById(R.id.btntemp)
                //initializing text fields
                answer=findViewById(R.id.answer)
                edtTxteqn=findViewById(R.id.edtTxteqn)
                edtTxteqn.showSoftInputOnFocus=false;



                // adding on click listener to our all buttons.
                btn1.setOnClickListener {
                    // on below line we are appending
                    // the expression to our text view.
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "1")
                }
                btn2.setOnClickListener {
                    // on below line we are appending
                    // the expression to our text view.
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "2")
                }
                btn3.setOnClickListener {
                    // on below line we are appending
                    // the expression to our text view.
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "3")
                }
                btn4.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "4")
                }
                btn5.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "5")
                }
                btn6.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "6")
                }
                btn7.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "7")
                }
                btn8.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "8")
                }
                btn9.setOnClickListener {
                    edtTxteqn.setText (edtTxteqn.text.toString() + "9")
                }
                btn0.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "0")
                }
                btn00.setOnClickListener {
                    edtTxteqn.setText((edtTxteqn.text.toString()+"00"))
                }
                btndot.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + ".")
                }
                btnadd.setOnClickListener {
                    edtTxteqn.setText  (edtTxteqn.text.toString() + "+")
                }
                btndivide.setOnClickListener {
                    edtTxteqn.setText (edtTxteqn.text.toString() + "/")
                }


                btnsubtract.setOnClickListener {
                    // on clicking on minus we are checking if
                    // the user has already a minus operation on screen.
                    // if minus operation is already present
                    // then we will not do anything.
                    val str: String = edtTxteqn.text.toString()
                    if (!str.get(index = str.length - 1).equals("-")) {
                        edtTxteqn.setText  (edtTxteqn.text.toString() + "-")
                    }
                }
                btnmultiply.setOnClickListener {
                    // if mul sign is not present in our
                    // text view then only we are adding
                    // the multiplication operator to it.
                    val str: String = edtTxteqn.text.toString()
                    if (!str.get(index = str.length - 1).equals("*")) {
                        edtTxteqn.setText  (edtTxteqn.text.toString() + "*")
                    }
                }

                btnequal.setOnClickListener {
                    val str: String = edtTxteqn.text.toString()
                    // on below line we are calling an evaluate
                    // method to calculate the value of expressions.
                    val result: Double = evaluate(str)
                    // on below line we are getting result
                    // and setting it to text view.
                    val r = result.toString()
                    edtTxteqn.setText(r)
                    answer.text = str
                }
                btnC.setOnClickListener {
                    // on clicking on ac button we are clearing
                    // our primary and secondary text view.
                    edtTxteqn.setText("")
                    answer.setText("")
                }
                btnpercent.setOnClickListener {
                    edtTxteqn.setText(edtTxteqn.text.toString()+"%")
                }
                btnback.setOnClickListener {
                    // on clicking on c button we are clearing
                    // the last character by checking the length.
                    var str: String = edtTxteqn.text.toString()
                    if (!str.equals("")) {
                        str = str.substring(0, str.length - 1)
                        edtTxteqn.setText(str)
                    }
                }

            }
            override fun onCreateOptionsMenu(menu: Menu?): Boolean {
                menuInflater.inflate(R.menu.menu,menu)
                return true
            }

            override fun onOptionsItemSelected(item: MenuItem): Boolean {

                when(item.itemId){
                    R.id.menu->{
                        val intent=Intent(this@SimpleActivity,MenuActivity::class.java)
                        startActivity(intent)
//                        Toast.makeText(this@SimpleActivity,"clicked menu", Toast.LENGTH_SHORT).show()
                    }
                }
                return true
            }

            fun evaluate(str: String): Double {
                return object : Any() {
                    // on below line we ar creating variable
                    // for tracking the position and char pos.
                    var pos = -1
                    var ch = 0

                    // below method is for moving to next character.
                    fun nextChar() {
                        // on below line we are incrementing our position
                        // and moving it to next position.
                        ch = if (++pos < str.length) str[pos].code else -1
                    }

                    // this method is use to check the extra space
                    // present int the expression and removing it.
                    fun eat(charToEat: Int): Boolean {
                        while (ch == ' '.code) nextChar()
                        // on below line we are checking the char pos
                        // if both is equal then we are returning it to true.
                        if (ch == charToEat) {
                            nextChar()
                            return true
                        }
                        return false
                    }

                    // below method is to parse our
                    // expression and to get the ans
                    // in this we are calling a parse
                    // expression method to calculate the value.
                    fun parse(): Double {
                        nextChar()
                        val x = parseExpression()
                        if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                        return x
                    }

                    // in this method we will only perform addition and
                    // subtraction operation on the expression.
                    fun parseExpression(): Double {
                        var x = parseTerm()
                        while (true) {
                            if (eat('+'.code)) x += parseTerm() // addition
                            else if (eat('-'.code)) x -= parseTerm() // subtraction
                            else return x
                        }
                    }

                    // in below method we will perform
                    // only multiplication and division operation.
                    fun parseTerm(): Double {
                        var x = parseFactor()
                        while (true) {
                            if (eat('*'.code)) x *= parseFactor() // multiplication
                            else if (eat('/'.code)) x /= parseFactor() // division
                            else return x
                        }
                    }

                    // below method is use to parse the factor
                    fun parseFactor(): Double {
                        //on below line we are checking for addition
                        // and subtraction and performing unary operations.
                        if (eat('+'.code)) return parseFactor() // unary plus
                        if (eat('-'.code)) return -parseFactor() // unary minus
                        // creating a double variable for ans.
                        var x: Double
                        // on below line we are creating
                        // a variable for position.
                        val startPos = pos
                        // on below line we are checking
                        // for opening and closing parenthesis.
                        if (eat('('.code)) { // parentheses
                            x = parseExpression()
                            eat(')'.code)
                        } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) {
                            // numbers
                            while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                            // on below line we are getting sub string from our string using start and pos.
                            x = str.substring(startPos, pos).toDouble()
                        } else if (ch >= 'a'.code && ch <= 'z'.code) {
                            // on below function we are checking for the operator in our expression.
                            while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                            val func = str.substring(startPos, pos)
                            // calling a method to parse our factor.
                            x = parseFactor()


                        } else {
                            // if the condition not satisfy then we are returning the exception
                            throw RuntimeException("Unexpected: " + ch.toChar())
                        }
                        // on below line we are calculating the power of the expression.

                        return x
                    }
                    // at last calling a parse for our expression.
                }.parse()
            }
        }