
package com.example.foodorderapp;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Mainadapter extends RecyclerView.Adapter<Mainadapter.viewholder> {

    ArrayList<Mainmodel> list;
    Context context;

    public Mainadapter(ArrayList<Mainmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     LayoutInflater inflater = LayoutInflater.from(parent.getContext());
      View view= LayoutInflater.from(context).inflate(R.layout.singlerow,parent,false);
      return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, final int position) {
   final  Mainmodel model = list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());


        //holder.description.setText(list.get(position).getName());
        //Picasso.get().load(list.get(position).getImage()).into(holder.foodimage);
        //holder.mainName.setText(list.get(position).getName());
       //holder.price.setText(list.get(position).getPrice());

        holder.foodimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("foodimage",model.getImage());
                intent.putExtra("mainName",model.getName());
                intent.putExtra("price",model.getPrice());
                intent.putExtra("description",model.getDescription());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder {

        ImageView foodimage;
        TextView mainName,price,description;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            foodimage =(itemView).findViewById(R.id.imageView);
            mainName=(itemView).findViewById(R.id.name);
            price=(itemView).findViewById(R.id.mainprice);
            description=(itemView).findViewById(R.id.maindesc);

        }
    }
}
