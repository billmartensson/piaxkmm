package se.magictechnology.piaxkmm.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import se.magictechnology.piaxkmm.Greeting
import android.widget.TextView
import se.magictechnology.piaxkmm.FancyCounter
import se.magictechnology.piaxkmm.Person

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        /*
        var someone = Person()
        someone.firstname = "Bill"

        Log.i("PIAXDEBUG", someone.getfullname())
        */

        findViewById<Button>(R.id.makenameButton).setOnClickListener {
            var someone = Person()
            someone.firstname = findViewById<EditText>(R.id.firstnameET).text.toString()
            someone.lastname = findViewById<EditText>(R.id.lastnameET).text.toString()

            findViewById<TextView>(R.id.text_view).text = someone.getfullname()

        }


    }
}
