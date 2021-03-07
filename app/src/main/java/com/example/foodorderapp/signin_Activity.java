package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorderapp.databinding.ActivitySigninBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin_Activity extends AppCompatActivity {

    ActivitySigninBinding binding;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

         auth= FirebaseAuth.getInstance();

         binding.buttonsignin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 auth.signInWithEmailAndPassword
                         (binding.etEmailLogin.getText().toString(),binding.etPasswordLogin.getText().toString())
                         .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                             @Override
                             public void onComplete(@NonNull Task<AuthResult> task) {

                                 if(task.isSuccessful()){

                                     Intent intent = new Intent(signin_Activity.this,MainActivity.class);
                                     intent.putExtra("email",auth.getCurrentUser().getEmail());
                                     intent.putExtra("uid",auth.getCurrentUser().getUid());
                                     startActivity(intent);
                                 }
                                 else {

                                     Toast.makeText(signin_Activity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                 }
                             }
                         });
             }
         });

    }

    public void gotosignup(View view) {
        startActivity(new Intent(signin_Activity.this,SignUpActivity2.class));
    }
}