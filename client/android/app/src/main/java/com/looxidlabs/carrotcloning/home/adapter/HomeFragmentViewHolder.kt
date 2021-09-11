package com.looxidlabs.carrotcloning.home.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.looxidlabs.carrotcloning.R

class HomeFragmentViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    var thumbnail = itemView.findViewById<ImageView>(R.id.img_home_item_thumbnail);
    var title = itemView.findViewById<TextView>(R.id.tv_home_item_title);
    var location = itemView.findViewById<TextView>(R.id.tv_home_item_location);
    var price = itemView.findViewById<TextView>(R.id.tv_home_item_price);

}