package com.example.vlad;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView item_time,name_guest,number_guest,cal_1,cal_2,comments;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        item_time = itemView.findViewById(R.id.time);
        name_guest = itemView.findViewById(R.id.name);
        number_guest = itemView.findViewById(R.id.number_guest);
        cal_1 = itemView.findViewById(R.id.cal_basis);
        cal_2 = itemView.findViewById(R.id.cal_prem);
        comments = itemView.findViewById(R.id.view_comments);


    }
}
