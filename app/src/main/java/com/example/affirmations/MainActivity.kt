package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**An instance or object of Datasource class and store the returned list in myDataset**/
        val datasource = Datasource()
        val myDataset = datasource.loadAffirmationss()

        /**Find reference to the RecyclerView**/
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        /**Tell the RecyclerView to use the created adapter**/
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}