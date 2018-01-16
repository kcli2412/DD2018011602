package com.example.student.dd2018011602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("msg0116");

        myRef.setValue("Hello, World!!!!");
    }

    public void click2(View v)
    {


    }
}
