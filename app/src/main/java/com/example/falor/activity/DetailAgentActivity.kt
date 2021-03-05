package com.example.falor.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.falor.R
import com.example.falor.agentsData

class DetailAgentActivity : AppCompatActivity() {
    lateinit var tvName: TextView
    lateinit var tvRole: TextView
    lateinit var tvBiography: TextView
    lateinit var tvSkill1: TextView
    lateinit var tvSkill2: TextView
    lateinit var tvSkill3: TextView
    lateinit var tvSkill4: TextView
    lateinit var imgDetail: ImageView

    companion object {
        const val AGENT_NAME = "agent_name"
        const val SELECTED_AGENT = "selected_agent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_agent)

        tvName = findViewById(R.id.tv_name)
        tvRole = findViewById(R.id.tv_role)
        tvBiography = findViewById(R.id.tv_biography)
        tvSkill1 = findViewById(R.id.tv_skill_1)
        tvSkill2 = findViewById(R.id.tv_skill_2)
        tvSkill3 = findViewById(R.id.tv_skill_3)
        tvSkill4 = findViewById(R.id.tv_skill_4)
        imgDetail = findViewById(R.id.img_detail)

        val selected_agent = intent.getIntExtra(SELECTED_AGENT, 0)

        val agent = agentsData[selected_agent]

        tvName.text = agent.name
        tvRole.text = agent.role
        tvBiography.text = agent.biography
        tvSkill1.text = agent.abilities[0]
        tvSkill2.text = agent.abilities[1]
        tvSkill3.text = agent.abilities[2]
        tvSkill4.text = agent.abilities[3]
        Glide.with(baseContext)
            .load(agent.imageDetail)
            .into(imgDetail)
    }
}