package za.ac.iie.mytomagochiapplication_st10445680

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class tomagochiAppMainPage : AppCompatActivity() {
    private var hunger = 100
    private var cleanliness = 100
    private var energy = 100
    lateinit var imgFeed:ImageView
    lateinit var imgClean:ImageView
    lateinit var imgPlay:ImageView
    var statusClean = findViewById<TextView>(R.id.statusClean)
    var statusPlay = findViewById<TextView>(R.id.statusPlay)
    var statusFeed = findViewById<TextView>(R.id.statusFeed)

    // Function to update status TextViews showing pet attributes (hunger, cleanliness, energy
    private fun updateTextView(){
        // Update the text displayed for cleanliness, hunger, and energy levels
        statusClean.text="Cleanliness: $cleanliness"
        statusFeed.text= "Hunger: $hunger"
        statusPlay.text= "Energy: $energy"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Find and store references to ImageViews for later use
        fun updateImageView(imageView: ImageView){
            imgFeed.setImageResource(R.drawable.imgfeed)
            imgClean.setImageResource(R.drawable.imgclean)
            imgPlay.setImageResource(R.drawable.imgplay)
        }
        setContentView(R.layout.activity_tomagochi_app_main_page)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val imgMainPage = findViewById<ImageView>(R.id.imgMainPage)
        var statusClean = findViewById<TextView>(R.id.statusClean)
        val statusPlay = findViewById<TextView>(R.id.statusPlay)
        val statusFeed = findViewById<TextView>(R.id.statusFeed)


        imgFeed = findViewById<ImageView>(R.id.imgFeed)
        imgClean = findViewById<ImageView>(R.id.imgClean)
        imgPlay = findViewById<ImageView>(R.id.imgPlay)


        // Set up button click listeners for feeding, cleaning, and playing with the pet
        btnFeed.setOnClickListener {
            // Increase energy, decrease hunger, and possibly decrease cleanliness when feeding
            energy += 10
            hunger -= 10
            cleanliness -= 10
            statusClean.text="Cleanliness: $cleanliness"
            statusFeed.text= "Hunger: $hunger"
            statusPlay.text= "Energy: $energy"
            imgFeed.setImageResource(R.drawable.imgfeed)

            if (hunger in 0..15) {
                statusFeed.text = "Your pet is starving! Please feed it immediately."
            } else if (hunger in 16..29) {
                statusFeed.text = "Your pet is hungry. It could use a meal."
            } else if (hunger in 30..100) {
                statusFeed.text = "Your pet is well-fed and content!"
            }

        }

        btnClean.setOnClickListener {
            // Decrease energy, increase hunger, and increase cleanliness when cleaning
            energy -= 10
            hunger += 10
            cleanliness += 10
            statusClean.text="Cleanliness: $cleanliness"
            statusFeed.text= "Hunger: $hunger"
            statusPlay.text= "Energy: $energy"
            imgClean.setImageResource(R.drawable.imgclean)
            if (cleanliness in 0..15) {
                statusClean.text = "Your pet is very dirty! It urgently needs a bath."
            } else if (cleanliness in 16..29) {
                statusClean.text  = "Your pet is not very clean. It could use a bath."
            } else if (cleanliness in 30..100) {
                statusClean.text  = "Your pet is clean and fresh!"
            }



        }

        btnPlay.setOnClickListener {
            // Decrease energy, increase hunger, and possibly decrease cleanliness when playing
            energy-= 10
            hunger += 10
            cleanliness -= 10
            statusClean.text="Cleanliness: $cleanliness"
            statusFeed.text= "Hunger: $hunger"
            statusPlay.text= "Energy: $energy"
            imgPlay.setImageResource(R.drawable.imgplay)

            if (energy in 0..30) {
                statusFeed.text = "Your pet is not feeling well. Please consider taking it to a vet."
            } else if (energy in 31..79) {
                statusFeed.text = "Your pet is okay, but could use some more attention."
            } else if (energy in 80..100) {
                statusFeed.text= "Your pet is happy and healthy!"
            }
        }











        
    }
}