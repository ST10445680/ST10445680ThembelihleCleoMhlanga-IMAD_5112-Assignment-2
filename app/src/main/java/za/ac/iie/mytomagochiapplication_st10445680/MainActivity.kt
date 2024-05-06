package za.ac.iie.mytomagochiapplication_st10445680

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tamagochiWelcome = findViewById<TextView>(R.id.welcomeMessage)
        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)
        val homepageImg = findViewById<ImageView>(R.id.homepageImg)

        btnGetStarted.setOnClickListener {

            startActivity(Intent(this, tomagochiAppMainPage::class.java))
        }
    }
}