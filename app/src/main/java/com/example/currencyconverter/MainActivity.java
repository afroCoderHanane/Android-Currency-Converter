package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToUSD(View view) {
        TextView input = findViewById(R.id.currencyBox);
        double final_answer = Integer.parseInt(input.getText().toString())*1.08;
        Toast.makeText(this,"In USD: "+ String.valueOf(final_answer) , Toast.LENGTH_SHORT).show();
    }
}