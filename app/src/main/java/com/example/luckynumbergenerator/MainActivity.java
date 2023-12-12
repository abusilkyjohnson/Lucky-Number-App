package com.example.luckynumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userNameXML = findViewById(R.id.EnterName);
        Button luckyButt = findViewById(R.id.randogenerator);

        luckyButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameXML.getText().toString();

                // Explicit Intent
                Intent i = new Intent(getApplicationContext(), YourNumberPage.class);

                //passing the name to the secondpage/activity the put extra can send many different data value types
                i.putExtra("name", userName);

                startActivity(i);//always need this when using intents
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

