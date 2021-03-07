package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  ActivityMainBinding binding;

  //DatabaseReference reference;

  //ArrayList<Mainmodel> list;

  //Mainadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        /*LinearLayoutManager layoutManager = (new LinearLayoutManager(this));
        binding.recview.setLayoutManager(layoutManager);
        list = new ArrayList<Mainmodel>();

        reference= FirebaseDatabase.getInstance().getReference().child("FoodData");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
               for(DataSnapshot snapshot1:snapshot.getChildren()){

                   Mainmodel model = snapshot1.getValue(Mainmodel.class);
                   list.add(model);
               }
                Mainadapter adapter = new Mainadapter(list,MainActivity.this);
                binding.recview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
              Toast.makeText(MainActivity.this,"opps ..... something is wromg",Toast.LENGTH_SHORT).show();
            }
        });



     */   ArrayList<Mainmodel> list= new ArrayList<>();

        list.add(new Mainmodel(R.drawable.food_1,"burder","5","This is chiken burger"));
        list.add(new Mainmodel(R.drawable.food_2,"Tomato","7","This is normal pizza"));
        list.add(new Mainmodel(R.drawable.food_3,"burger","8","This is best chawmein"));
        list.add(new Mainmodel(R.drawable.food_4,"panir","1","This is normal burger"));
        list.add(new Mainmodel(R.drawable.food_5,"Chiken","3","This is chiken "));
        list.add(new Mainmodel(R.drawable.food_6,"chawmein","3","This is not good maton"));
        list.add(new Mainmodel(R.drawable.food_7,"chawmein","8","Rice is good"));
        list.add(new Mainmodel(R.drawable.food_1,"burder","9","This is chiken burger"));
        list.add(new Mainmodel(R.drawable.food_5,"Chiken","2","This is chiken masala"));
        list.add(new Mainmodel(R.drawable.food_1,"burder","5","This is chiken burger"));
        list.add(new Mainmodel(R.drawable.food_2,"Tomato","7","This is normal pizza"));
        list.add(new Mainmodel(R.drawable.food_3,"burger","8","This is best chawmein"));
        list.add(new Mainmodel(R.drawable.food_4,"panir","1","This is normal burger"));
        list.add(new Mainmodel(R.drawable.food_5,"Chiken","3","This is chiken "));
        list.add(new Mainmodel(R.drawable.food_6,"chawmein","3","This is not good maton"));
        list.add(new Mainmodel(R.drawable.food_7,"chawmein","8","Rice is good"));
        list.add(new Mainmodel(R.drawable.food_1,"burder","9","This is chiken burger"));
        list.add(new Mainmodel(R.drawable.food_5,"Chiken","2","This is chiken masala"));
        list.add(new Mainmodel(R.drawable.food_1,"burder","5","This is chiken burger"));
        list.add(new Mainmodel(R.drawable.food_2,"Tomato","7","This is normal pizza"));
        list.add(new Mainmodel(R.drawable.food_3,"burger","8","This is best chawmein"));
        list.add(new Mainmodel(R.drawable.food_4,"panir","1","This is normal burger"));
        list.add(new Mainmodel(R.drawable.food_5,"Chiken","3","This is chiken "));
        list.add(new Mainmodel(R.drawable.food_6,"chawmein","3","This is not good maton"));
        list.add(new Mainmodel(R.drawable.food_7,"chawmein","8","Rice is good"));
        list.add(new Mainmodel(R.drawable.food_1,"burder","9","This is chiken burger"));
        list.add(new Mainmodel(R.drawable.food_5,"Chiken","2","This is chiken masala"));

        Mainadapter adapter = new Mainadapter(list,this);
        binding.recview.setAdapter(adapter);


        LinearLayoutManager layoutManager = (new LinearLayoutManager(this));
        binding.recview.setLayoutManager(layoutManager);
    }
}