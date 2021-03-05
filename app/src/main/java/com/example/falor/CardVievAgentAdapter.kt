package com.example.falor

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.falor.activity.DetailAgentActivity

class CardVievAgentAdapter(private val listAgent: ArrayList<Agent>) :
    RecyclerView.Adapter<CardVievAgentAdapter.CardViewViewHolder>() {
    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_agent_name)
        var tvRole: TextView = itemView.findViewById(R.id.tv_agent_role)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_agent_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_agent, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val agent = listAgent[position]

        Glide.with(holder.itemView.context)
            .load(agent.image)
            .apply(RequestOptions().override(80, 80))
            .into(holder.imgPhoto)

        holder.tvName.text = agent.name
        holder.tvRole.text = agent.role

        holder.itemView.setOnClickListener {
            val detailIntent = Intent(holder.itemView.context, DetailAgentActivity::class.java)
            detailIntent.putExtra(DetailAgentActivity.SELECTED_AGENT, position)
            holder.itemView.context.startActivity(detailIntent)
        }

    }

    override fun getItemCount(): Int {
        return listAgent.size
    }

}