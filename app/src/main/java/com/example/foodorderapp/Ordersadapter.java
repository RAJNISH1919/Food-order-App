package com.example.foodorderapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ordersadapter extends RecyclerView.Adapter<Ordersadapter.viewholder>
{


    ArrayList<Ordersmodel> list;
    Context context;
    public Ordersadapter(ArrayList<Ordersmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ordersinglerow,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final  Ordersmodel model = list.get(position);
        holder.orderImage.setImageResource(model.getOrderImage());
        holder.soldItemName.setText(model.getSoldItemName());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.price.setText(model.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewholder  extends RecyclerView.ViewHolder {

        ImageView orderImage;
        TextView soldItemName , orderNumber , price;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            orderImage = (itemView).findViewById(R.id.orderimage);
            soldItemName= (itemView).findViewById(R.id.orderitemName);
            orderNumber = (itemView).findViewById(R.id.orderNumber);
            price= (itemView).findViewById(R.id.orderprice);

        }
    }
}
