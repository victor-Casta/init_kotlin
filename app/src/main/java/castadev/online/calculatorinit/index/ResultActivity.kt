package castadev.online.calculatorinit.index

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import castadev.online.calculatorinit.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val addResult = intent.getIntExtra("sum", 0).toString()
        val subtractionResult = intent.getIntExtra("difference", 0).toString()
        val multiplicationResult = intent.getIntExtra("product", 0).toString()
        val divisionResult = intent.getIntExtra("quotient", 0).toString()

        val resultText = findViewById<TextView>(R.id.result_text)
        resultText.text = "Sum: $addResult"

        val subtractionView = findViewById<TextView>(R.id.subtraction_result)
        subtractionView.text = "Difference: $subtractionResult"

        val multiplicationView = findViewById<TextView>(R.id.multiplication_result)
        multiplicationView.text = "Product: $multiplicationResult"

        val divisionView = findViewById<TextView>(R.id.division_result)
        divisionView.text = "Quotient: $divisionResult"
    }
}
