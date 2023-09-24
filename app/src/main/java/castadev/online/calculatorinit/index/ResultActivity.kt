package castadev.online.calculatorinit.index

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import castadev.online.calculatorinit.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val addResult = intent.getStringExtra("sum")
        val subtractionResult = intent.getStringExtra("subtraction")
        val multiplicationResult = intent.getStringExtra("multiplication")
        val divisionResult = intent.getStringExtra("division")

        val resultText = findViewById<TextView>(R.id.result_text)
        resultText.text = addResult

        val subtractionView = findViewById<TextView>(R.id.subtraction_result)
        subtractionView.text = subtractionResult

        val multiplicationView = findViewById<TextView>(R.id.multiplication_result)
        multiplicationView.text = multiplicationResult

        val divisionView = findViewById<TextView>(R.id.division_result)
        divisionView.text = divisionResult

    }
}