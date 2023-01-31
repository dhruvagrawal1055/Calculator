package com.example.calculator

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Scientific : AppCompatActivity() {
    // declaring variables for our text view and button
    lateinit var sec: TextView
    lateinit var Main: TextView
    lateinit var cl: Button
    lateinit var bc: ImageButton
    lateinit var bbrac1: Button
    lateinit var bbrac2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button
    lateinit var binv: Button
    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmul: ImageButton
    lateinit var bminus: ImageButton
    lateinit var bplus: ImageButton
    lateinit var bequal: ImageButton
    lateinit var bdot: Button
    lateinit var bdiv: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientific)
        supportActionBar?.setElevation(0f)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#f3f3f3")))
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        //initializing number buttons
        sec = findViewById(R.id.uppers)
        Main = findViewById(R.id.primarys)
        cl = findViewById(R.id.clear)
        bc = findViewById(R.id.btnback)
        bbrac1 = findViewById(R.id.brac1)
        bbrac2 = findViewById(R.id.brac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        btan = findViewById(R.id.btan)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bfact = findViewById(R.id.bfact)
        bsquare = findViewById(R.id.bsquare)
        bsqrt = findViewById(R.id.bsqrt)
        binv = findViewById(R.id.binv)
        b0 = findViewById(R.id.b0)
        b9 = findViewById(R.id.b9)
        b8 = findViewById(R.id.b8)
        b7 = findViewById(R.id.b7)
        b6 = findViewById(R.id.b6)
        b5 = findViewById(R.id.b5)
        b4 = findViewById(R.id.b4)
        b3 = findViewById(R.id.b3)
        b2 = findViewById(R.id.b2)
        b1 = findViewById(R.id.b1)
        bpi = findViewById(R.id.bpi)
        bmul = findViewById(R.id.bmul)
        bminus = findViewById(R.id.bminus)
        bplus = findViewById(R.id.bplus)
        bequal = findViewById(R.id.bequal)
        bdot = findViewById(R.id.bdot)
        bdiv = findViewById(R.id.bdiv)

        // adding on click listener to our all buttons.
        // on below lines we are appending
        // the expression to our text view.
        b1.setOnClickListener {
            Main.text = (Main.text.toString() + "1")
        }
        b2.setOnClickListener {
            Main.text = (Main.text.toString() + "2")
        }
        b3.setOnClickListener {
            Main.text = (Main.text.toString() + "3")
        }
        b4.setOnClickListener {
            Main.text = (Main.text.toString() + "4")
        }
        b5.setOnClickListener {
            Main.text = (Main.text.toString() + "5")
        }
        b6.setOnClickListener {
            Main.text = (Main.text.toString() + "6")
        }
        b7.setOnClickListener {
            Main.text = (Main.text.toString() + "7")
        }
        b8.setOnClickListener {
            Main.text = (Main.text.toString() + "8")
        }
        b9.setOnClickListener {
            Main.text = (Main.text.toString() + "9")
        }
        b0.setOnClickListener {
            Main.text = (Main.text.toString() + "0")
        }
        bdot.setOnClickListener {
            Main.text = (Main.text.toString() + ".")
        }
        bplus.setOnClickListener {
            Main.text = (Main.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            Main.text = (Main.text.toString() + "/")
        }
        bbrac1.setOnClickListener { Main.text = (Main.text.toString() + "(")
        }
        bbrac2.setOnClickListener { Main.text = (Main.text.toString() + ")")
        }
        bpi.setOnClickListener {
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            Main.text = (Main.text.toString() + "3.142")
            sec.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            Main.text = (Main.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            Main.text = (Main.text.toString() + "cos")
        }
        btan.setOnClickListener {
            Main.text = (Main.text.toString() + "tan")
        }
        binv.setOnClickListener {
            Main.text = (Main.text.toString() + "^" + "(-1)")
        }
        bln.setOnClickListener {
            Main.text = (Main.text.toString() + "ln")
        }
        blog.setOnClickListener {
            Main.text = (Main.text.toString() + "log")
        }
        bminus.setOnClickListener {
            Main.text = (Main.text.toString() + "-")
        }
        bmul.setOnClickListener {
            Main.text = (Main.text.toString() + "*")
        }
        bsqrt.setOnClickListener {
            if (Main.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = Main.text.toString()
                // on below line we are calculation
                // square root of the given number.
                val r = Math.sqrt(str.toDouble())
                // on below line we are converting our double
                // to string and then setting it to text view.
                val result = r.toString()
                Main.setText(result)
            }
        }
        bequal.setOnClickListener {
            val str: String = Main.text.toString()
            // on below line we are calling an evaluate
            // method to calculate the value of expressions.
            val result: Double = evaluate(str)
            // on below line we are getting result
            // and setting it to text view.
            val r = result.toString()
            Main.setText(r)
            sec.text = str
        }
        cl.setOnClickListener {
            // on clicking on ac button we are clearing
            // our primary and secondary text view.
            Main.setText("")
            sec.setText("")
        }
        bc.setOnClickListener {
            // on clicking on c button we are clearing
            // the last character by checking the length.
            var str: String = Main.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                Main.text = str
            }
        }
        bsquare.setOnClickListener {
            if (Main.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting the expression and then calculating the square of the number
                val d: Double = Main.getText().toString().toDouble()
                // on below line we are calculating the square.
                val square = d * d
                // after calculating the square we
                // are setting it to text view.
                Main.setText(square.toString())
                // on below line we are setting
                // the d to secondary text view.
                sec.text = "$d²"
            }
        }
        bfact.setOnClickListener {
            if (Main.text.toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                // on below line we are getting int value
                // and calculating the factorial value of the entered number.
                val value: Int = Main.text.toString().toInt()
                val fact: Int = factorial(value)
                Main.setText(fact.toString())
                sec.text = "$value`!"
            }

        }

    }

    fun factorial(n: Int): Int {
        // this method is use to find factorial
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
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
                }
                else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) {
                    // numbers
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                    // on below line we are getting sub string from our string using start and pos.
                    x = str.substring(startPos, pos).toDouble()
                }
                else if (ch >= 'a'.code && ch <= 'z'.code) {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                    val func = str.substring(startPos, pos)
                    // calling a method to parse our factor.
                    x = parseFactor()
                    // on below line we are checking for square root.
                    x =
                        if (func == "sqrt") Math.sqrt(x)
                        // on below line we are checking for sin function
                        // and calculating sin function using Math class.
                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)
                            // on below line we are calculating the cos value
                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)
                            // on below line we are calculating
                            // the tan value of our expression.
                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))
                        // on below line we are calculating
                        // log value of the expression.
                        else if (func == "log")
                            Math.log10(x)
                        // on below line we are calculating
                        // ln value of expression.
                        else if (func == "ln") Math.log(x)
                        // f we get any error then
                        // we simply return the exception.
                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                }
                else {
                    // if the condition not satisfy then we are returning the exception
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                // on below line we are calculating the power of the expression.
                if (eat('^'.code)) x = Math.pow(x, parseFactor()) // exponentiation
                return x
            }
            // at last calling a parse for our expression.
        }.parse()
    }
}