package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * Passe the list of affirmations in
 * context helps the adapter to resolve string resources and contains other informations about the app
 */

class ItemAdapter(val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    /**
     * Holds a single list item or affirmations views
     */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /**
     * The onCreateViewHolder()method is called by the layout manager to create new view holders for the RecyclerView
     * Inflates or references the item layout (list_item) by defifning an instance of LayoutInflater called adapterLayout
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from((parent.context)).inflate(
            R.layout.list_item, parent, false
        )
        return ItemViewHolder(adapterLayout)
    }


    /**
     * s called by the layout manager in order to replace the contents of a list item view.
     * It gets item at a given position (current item position
     * Set the item to textView which will be displayed by holder.textView...
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /**Returns the size of dataset or affirmations**/
    override fun getItemCount(): Int {
        return dataset.size
    }
}