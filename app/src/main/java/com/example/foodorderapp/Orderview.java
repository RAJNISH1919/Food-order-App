package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.example.foodorderapp.databinding.ActivityOrderviewBinding;

import java.util.ArrayList;

public class Orderview extends AppCompatActivity {

    ActivityOrderviewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Ordersmodel> list = new ArrayList<>();

        list.add(new Ordersmodel(R.drawable.food_3,"burger","4","123"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","5","695"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","7","549"));
        list.add(new Ordersmodel(R.drawable.food_1," Veg burger","1","497"));
        list.add(new Ordersmodel(R.drawable.food_7,"chawmein","8","546"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","1","452"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","3","549"));
        list.add(new Ordersmodel(R.drawable.food_4,"panir","2","154"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","4","548"));
        list.add(new Ordersmodel(R.drawable.food_6,"chawmein","5","457"));
        list.add(new Ordersmodel(R.drawable.food_7,"Chawmein","2","515"));
        list.add(new Ordersmodel(R.drawable.food_1," Roast burger","6","333"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","4","123"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","5","695"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","7","549"));
        list.add(new Ordersmodel(R.drawable.food_1," Veg burger","1","497"));
        list.add(new Ordersmodel(R.drawable.food_7,"chawmein","8","546"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","1","452"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","3","549"));
        list.add(new Ordersmodel(R.drawable.food_4,"panir","2","154"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","4","548"));
        list.add(new Ordersmodel(R.drawable.food_6,"chawmein","5","457"));
        list.add(new Ordersmodel(R.drawable.food_7,"Chawmein","2","515"));
        list.add(new Ordersmodel(R.drawable.food_1," Roast burger","6","333"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","4","123"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","5","695"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","7","549"));
        list.add(new Ordersmodel(R.drawable.food_1," Veg burger","1","497"));
        list.add(new Ordersmodel(R.drawable.food_7,"chawmein","8","546"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","1","452"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","3","549"));
        list.add(new Ordersmodel(R.drawable.food_4,"panir","2","154"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","4","548"));
        list.add(new Ordersmodel(R.drawable.food_6,"chawmein","5","457"));
        list.add(new Ordersmodel(R.drawable.food_7,"Chawmein","2","515"));
        list.add(new Ordersmodel(R.drawable.food_1," Roast burger","6","333"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","4","123"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","5","695"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","7","549"));
        list.add(new Ordersmodel(R.drawable.food_1," Veg burger","1","497"));
        list.add(new Ordersmodel(R.drawable.food_7,"chawmein","8","546"));
        list.add(new Ordersmodel(R.drawable.food_2,"pizza","1","452"));
        list.add(new Ordersmodel(R.drawable.food_3,"burger","3","549"));
        list.add(new Ordersmodel(R.drawable.food_4,"panir","2","154"));
        list.add(new Ordersmodel(R.drawable.food_5,"chiken biryani","4","548"));
        list.add(new Ordersmodel(R.drawable.food_6,"chawmein","5","457"));
        list.add(new Ordersmodel(R.drawable.food_7,"Chawmein","2","515"));
        list.add(new Ordersmodel(R.drawable.food_1," Roast burger","6","333"));


        Ordersadapter adapter = new Ordersadapter(list,this);
        binding.Orderrecyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.Orderrecyclerview.setLayoutManager(layoutManager);
    }
}