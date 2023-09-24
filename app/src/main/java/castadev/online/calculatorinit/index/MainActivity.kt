package castadev.online.calculatorinit.index

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import castadev.online.calculatorinit.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the EditTexts
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)

        // Get the buttons
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {
            val number1 = editText1.text.toString().toInt()
            val number2 = editText2.text.toString().toInt()

            val sum = number1 + number2
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }

        subtractButton.setOnClickListener {
            // Get the numbers from the EditTexts
            val number1 = editText1.text.toString().toInt()
            val number2 = editText2.text.toString().toInt()

            // Calculate the difference
            val difference = number1 - number2

            // Create an Intent to start the ResultActivity
            val intent = Intent(this, ResultActivity::class.java)

            // Put the difference in the Intent
            intent.putExtra("difference", difference)

            // Start the ResultActivity
            startActivity(intent)
        }

        multiplyButton.setOnClickListener {
            // Get the numbers from the EditTexts
            val number1 = editText1.text.toString().toInt()
            val number2 = editText2.text.toString().toInt()

            // Calculate the product
            val product = number1 * number2

            // Create an Intent to start the ResultActivity
            val intent = Intent(this, ResultActivity::class.java)

            // Put the product in the Intent
            intent.putExtra("product", product)

            // Start the ResultActivity
            startActivity(intent)
        }

        divideButton.setOnClickListener {
            // Get the numbers from the EditTexts
            val number1 = editText1.text.toString().toInt()
            val number2 = editText2.text.toString().toInt()

            // Calculate the quotient
            val quotient = number1 / number2

            // Create an Intent to start the ResultActivity
            val intent = Intent(this, ResultActivity::class.java)

            // Put the quotient in the Intent
            intent.putExtra("quotient", quotient)

            // Start the ResultActivity
            startActivity(intent)
        }    }
}