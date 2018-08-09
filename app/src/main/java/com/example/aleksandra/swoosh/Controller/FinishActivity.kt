package com.example.aleksandra.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aleksandra.swoosh.R
import com.example.aleksandra.swoosh.Utilities.EXTRA_LEAGUE
import com.example.aleksandra.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish2.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish2)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
