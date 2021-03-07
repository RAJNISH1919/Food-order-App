package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorderapp.databinding.ActivityDetailBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DetailActivity extends AppCompatActivity {

    FirebaseFirestore dbroot;
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dbroot=FirebaseFirestore.getInstance();


        binding.Detailimage.setImageResource(getIntent().getIntExtra("foodimage",0));
        binding.foodName.setText(getIntent().getStringExtra("mainName"));
        binding.Detailprice.setText(getIntent().getStringExtra("price"));

        binding.insertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertdata();
            }
        });


    }
    public  void insertdata(){

        Map<String,String> item = new HashMap<>();
        item.put("nameBox",binding.nameBox.getText().toString().trim());
        item.put("phoneBox",binding.phoneBox.getText().toString().trim());

        dbroot.collection("CustomerDetails").add(item)
                .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentReference> task) {
                        binding.nameBox.setText("");
                        binding.phoneBox.setText("");
                        Toast.makeText(getApplicationContext(),"Request Sended",Toast.LENGTH_LONG).show();
                    }
                });
    }

    public void gotobuy(View view) {
        startActivity(new Intent(DetailActivity.this,detail2.class));
    }
}