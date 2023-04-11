package com.x7.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.x7.myapplication.databinding.RecyclerviewItemBinding
import com.x7.myapplication.room.User

class SlovarAdapter constructor(
    val context: Context,
    var arrayList: ArrayList<User>
):RecyclerView.Adapter<SlovarAdapter.SlovarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlovarViewHolder {
        val view=RecyclerviewItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return SlovarViewHolder(view)
    }

    override fun onBindViewHolder(holder: SlovarViewHolder, position: Int) {
       holder.binding.textview1.text="${arrayList.get(position).english} - ${arrayList.get(position).uzbek}"

       holder.binding.textview1.setOnClickListener {
         val intent=Intent(context,MainActivity3::class.java)
         intent.putExtra("hammasi",arrayList.get(position))
         context.startActivity(intent)
       }
    }
    override fun getItemCount(): Int =arrayList.size

    class SlovarViewHolder(val binding: RecyclerviewItemBinding):RecyclerView.ViewHolder(binding.root)


    fun filterList(filteredList: ArrayList<User>) {
        arrayList = filteredList
        notifyDataSetChanged()
    }
}