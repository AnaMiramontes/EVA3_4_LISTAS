package com.example.eva3_4_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class OtraPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra_pantalla);
        Intent intent = getIntent();
        intent.getStringExtra("DATO");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}