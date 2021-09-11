package com.looxidlabs.carrotcloning.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.looxidlabs.carrotcloning.R
import com.looxidlabs.carrotcloning.home.data.HomeFragmentData

class HomeFragmentAdapter(private var homes : ArrayList<HomeFragmentData>,
                          private var requestManager : RequestManager, private var context : Context) :
    RecyclerView.Adapter<HomeFragmentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentViewHolder {
        return HomeFragmentViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_home_item,
            parent,false))
    }

    override fun onBindViewHolder(holder: HomeFragmentViewHolder, position: Int) {
//        holder.title = homeItems[position]
    }

    override fun getItemCount(): Int = homes.size

}