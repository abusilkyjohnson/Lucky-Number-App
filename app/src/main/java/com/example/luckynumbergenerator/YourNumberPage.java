package com.example.luckynumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class YourNumberPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_number_page);

        TextView randomText = findViewById(R.id.LuckyNum);

        randomText.setText("" + RandomNum());
    }
    public int RandomNum()
    {
        Random rand = new Random();
        int randomInt = rand.nextInt(100);
        return randomInt;
    }

}