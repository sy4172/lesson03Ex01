package com.example.lesson03ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btnC;
    TextView text;
    Random rnd;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btnC = findViewById(R.id.btnC);
        text = findViewById(R.id.textView);
        rnd = new Random();

        i = 0;
    }


    public void randomNum(View view) {
        i = rnd.nextInt(10)+1;
        text.setText("Number is "+i);
    }

    public void clear(View view) {
        text.setText("Number not found");
        btn.setText("Click for number");
    }
}
