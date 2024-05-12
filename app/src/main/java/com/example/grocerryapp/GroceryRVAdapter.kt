package com.example.grocerryapp

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class GroceryRVAdapter (
    var list:List<GroceryItems>,
    val groceryItemClickInterface: GroceryItemClickInterface
        ) : RecyclerView.Adapter<GroceryRVAdapter.GroceryViewHolder>(){

            inner class GroceryViewHolder(ItemView: View) : RecyclerView.ViewHolder(itemView){
                val nameTV = itemView.findViewById<TextView>(R.id.idTVItemName)
                val quantityTV = itemView.findViewById<TextView>(R.id.idTVQuantity)
                val rateTV = itemView.findViewById<TextView>(R.id.idTVRaate)
                val amountTV = itemView.findViewById<TextView>(R.id.idTVToatalAmt)
                val deleteTV = itemView.findViewById<TextView>(R.id.idIVDelete)

            }

    interface GroceryItemClickInterface{
        fun onItemClick(groceryItems: GroceryItems)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GroceryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
