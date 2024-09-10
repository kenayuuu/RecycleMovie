package com.niken.mobilemi2a.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.niken.mobilemi2a.R
import com.niken.mobilemi2a.model.ModelBuah

class BuahAdapter (val itemList: ArrayList<ModelBuah>):
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>()

{
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemNama : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_customimage,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)
    }


}