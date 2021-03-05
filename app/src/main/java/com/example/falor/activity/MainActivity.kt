package com.example.falor.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.falor.Agent
import com.example.falor.CardVievAgentAdapter
import com.example.falor.R
import com.example.falor.agentsData

class MainActivity : AppCompatActivity() {
    private lateinit var rvAgents: RecyclerView
    private lateinit var icProfile: ImageButton
    private var list: ArrayList<Agent> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        icProfile = findViewById(R.id.ic_account)
        icProfile.setOnClickListener {
            val profileIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(profileIntent)
        }

        rvAgents = findViewById(R.id.rv_agent)
        rvAgents.setHasFixedSize(true)

        list.addAll(agentsData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvAgents.layoutManager = LinearLayoutManager(this)
        val cardVievAgentAdapter = CardVievAgentAdapter(list)
        rvAgents.adapter = cardVievAgentAdapter
    }
}