package com.example.listbaitap;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewholder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView Name,Email;

    public MyViewholder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        Name = itemView.findViewById(R.id.name);
        Email = itemView.findViewById(R.id.email);
    }
}
