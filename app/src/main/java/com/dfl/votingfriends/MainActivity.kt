package com.dfl.votingfriends

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, DetailActivity::class.java)

        matthewLinear.setOnClickListener {
            intent.putExtra(getString(R.string.recept_id), R.string.matthew)
            startActivity(intent)
        }
        mattLinear.setOnClickListener {
            intent.putExtra(getString(R.string.recept_id), R.string.matt)
            startActivity(intent)
        }
        courteneyLinear.setOnClickListener {
            intent.putExtra(getString(R.string.recept_id), R.string.courteney)
            startActivity(intent)
        }
        lisaLinear.setOnClickListener {
            intent.putExtra(getString(R.string.recept_id), R.string.lisa)
            startActivity(intent)
        }
        jenniferLinear.setOnClickListener {
            intent.putExtra(getString(R.string.recept_id), R.string.jennifer)
            startActivity(intent)
        }
        davidLinear.setOnClickListener {
            intent.putExtra(getString(R.string.recept_id), R.string.davidul)
            startActivity(intent)
        }
    }
}
