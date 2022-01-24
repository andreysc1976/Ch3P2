package ru.a_party.ch3p2.view.main.recyler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.a_party.ch3p2.R
import ru.a_party.ch3p2.data.WorldAndTranslate

class MainAdapter(private val worlds:List<WorldAndTranslate>): RecyclerView.Adapter<MainAdapter.WTViewHolder>() {
    class WTViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(worldAndTranslate: WorldAndTranslate) {
            itemView.findViewById<TextView>(R.id.textViewWord).text=worldAndTranslate.word
            itemView.findViewById<TextView>(R.id.textViewTranslate).text=worldAndTranslate.translateWord
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WTViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_word, parent, false)
            return WTViewHolder(view)
    }

    override fun onBindViewHolder(holder: WTViewHolder, position: Int) {
        holder.bind(worlds[position])
    }

    override fun getItemCount(): Int {
        return worlds.size
    }

}