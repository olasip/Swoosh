package com.example.aleksandra.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aleksandra.swoosh.Model.Player
import com.example.aleksandra.swoosh.R
import com.example.aleksandra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish2.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish2)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
