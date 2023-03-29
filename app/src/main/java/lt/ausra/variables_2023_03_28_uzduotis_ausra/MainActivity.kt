package lt.ausra.variables_2023_03_28_uzduotis_ausra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val fuelPriceEditText: EditText = findViewById(R.id.fuelPriceEditText)

        val okButton: Button = findViewById(R.id.okButton)
        okButton.setOnClickListener {

            val myName = nameEditText.text.toString()

            val kuroKaina: Float = fuelPriceEditText.text.toString().toFloat()

            fun variableActions() {

                val vardoRaidziuSkaicius = myName.length
                val rezultatas = vardoRaidziuSkaicius + kuroKaina
                val arRezultatasTeigiamas = rezultatas > 0
                val vardoPirmojiRaide = myName.get(0)
                val pirmosRaidesId = vardoPirmojiRaide.code
                val rezultatas02 = (vardoRaidziuSkaicius - pirmosRaidesId) + rezultatas
                val arRezultatas02Teigiamas = rezultatas02 > 0

                val numberOfLettersTextView: TextView = findViewById(R.id.numberOfLettersTextView)
                numberOfLettersTextView.setText("The name contains $vardoRaidziuSkaicius symbols")

                val fuelPriceTextView: TextView = findViewById(R.id.fuelPriceTextView)
                fuelPriceTextView.setText("Fuel price is $kuroKaina Eur")

                val sumTextView: TextView = findViewById(R.id.sumTextView)
                sumTextView.setText("Sum of symbols and fuel price is $rezultatas")

                val isSumPositiveTextView: TextView = findViewById(R.id.isSumPositiveTextView)
                isSumPositiveTextView.setText(
                    if (arRezultatasTeigiamas == true) {
                        "Is sum positive? Yes"
                    } else {
                        "Is sum positive? No"
                    }
                )

                val firstLetterTextView: TextView = findViewById(R.id.firstLetterTextView)
                firstLetterTextView.setText("First letter of the name is '$vardoPirmojiRaide' ")

                val subtractTextView: TextView = findViewById(R.id.subtractTextView)
                subtractTextView.setText("Result of subtraction $rezultatas02")

                val isStillPositiveTextView: TextView = findViewById(R.id.isStillPositiveTextView)
                isStillPositiveTextView.setText(
                    if (arRezultatas02Teigiamas == true) {
                        "Is sum still positive? Yes"
                    } else if (rezultatas02.toInt() == 0) {
                        "Is sum still positive? Sum equals zero"
                    } else {
                        "Is sum still positive? No"
                    }
                )

                val letterIdPositiveTextView: TextView = findViewById(R.id.letterIdPositiveTextView)
                letterIdPositiveTextView.setText("The id of '$vardoPirmojiRaide' letter is $pirmosRaidesId")
            }
            variableActions()
        }
    }
}

