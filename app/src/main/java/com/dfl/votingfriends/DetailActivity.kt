package com.dfl.votingfriends

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        title = "DetailsActivity"
        val pref = getSharedPreferences(
            getString(R.string.voting),
            Context.MODE_PRIVATE
        )

        val idSelected = intent.getIntExtra(getString(R.string.recept_id), 0)
        val personSelected = getString(idSelected)
        val numStars = pref.getFloat(personSelected, 0f)
        ratingBar.rating = numStars
        imageDetails.setImageResource(
            resources.getIdentifier(
                personSelected,
                "drawable",
                packageName
            )
        )
        detailsText.text =
            getString(resources.getIdentifier(personSelected + "_detail", "string", packageName))

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            pref.edit().putFloat(personSelected, rating).apply()
        }
    }
}

