package com.example.luckynumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class YourNumberPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_number_page);

        TextView randomText = findViewById(R.id.LuckyNum);

        int random_num  = RandomNum();

        Intent i = getIntent();//allows us to get intent from key we did in the put extra method
        String userName = i.getStringExtra("name");

        if(userName.length() == 0)
        {
            randomText.setText("Please put your name first");

        }
        else
        {
            randomText.setText("" + random_num);
        }


        Button shareButt = findViewById(R.id.shareButt);

        shareButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            SharedData(userName,random_num);
            }
        });
    }
    public int RandomNum()
    {
        Random rand = new Random();
        int randomInt = rand.nextInt(100);
        return randomInt;
    }

    public void SharedData(String userName, int randomNum)
    {
        //Implicit Intent
        Intent i = new Intent(Intent.ACTION_SEND);//action send i s used to send data
        i.setType("text/plain");

        i.putExtra(Intent.EXTRA_SUBJECT, userName + "Got Lucky Number " );
        i.putExtra(Intent.EXTRA_TEXT, "Lucky Num is " + randomNum);

        startActivity(Intent.createChooser(i, "Choose A platform"));
    }

}