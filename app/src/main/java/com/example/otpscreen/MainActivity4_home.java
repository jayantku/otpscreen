package com.example.otpscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import sdk.chat.ui.utils.GlideWith;

public class MainActivity4_home extends AppCompatActivity {
TextView textView,textView1;
String name;
FirebaseAuth auth;
FirebaseDatabase database;

Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_home);
        //textView1=findViewById(R.id.coins);
        button=findViewById(R.id.button6);
        database=FirebaseDatabase.getInstance();

        auth=FirebaseAuth.getInstance();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4_home.this,MainActivity5_videocall.class);
                startActivity(intent);
            }
        });
    }
}