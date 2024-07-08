package com.example.vlad;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<ItemList> items;
    public MyAdapter(Context context, List<ItemList> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.name_guest.setText(items.get(position).getName_guest());
        holder.item_time_hour.setText(String.valueOf(items.get(position).getItem_time_hour()));
        holder.item_time_min.setText(String.valueOf(items.get(position).getItem_time_min()));
        holder.number_guest.setText(String.valueOf(items.get(position).getNumber_guest()));

        holder.cal_1.setText(String.valueOf(items.get(position).getCal_1()));
        holder.cal_2.setText(String.valueOf(items.get(position).getCal_2()));
        holder.comments.setText(items.get(position).getComments());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
}
