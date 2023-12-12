package com.example.luckynumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button luckyButt = findViewById(R.id.randogenerator);

        luckyButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToLucky();
            }
        });
    }

    public void GoToLucky(){

        Intent intent = new Intent(this, YourNumberPage.class);
        //1st parameter = current location //2nd = destination
        startActivity(intent);
    }

}

