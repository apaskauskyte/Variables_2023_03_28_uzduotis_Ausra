package lt.ausra.variables_2023_03_28_uzduotis_ausra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "my_tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "Ausra"
        val vardoRaidziuSkaicius = myName.length
        val kuroKaina = 1.49F
        val rezultatas = vardoRaidziuSkaicius + kuroKaina
        val arRezultatasTeigiamas = rezultatas > 0
        val vardoPirmojiRaide = 'a'
        val pirmosRaidesId = vardoPirmojiRaide.code
        val rezultatas02 = (
                vardoRaidziuSkaicius - pirmosRaidesId
                ) + rezultatas
        val arRezultatas02Teigiamas = rezultatas02 > 0

    }
}

