package com.sanidhyakeluskar.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Rollbutton= findViewById(R.id.rollButton);
        final ImageView leftDice= findViewById(R.id.image_left);
        final ImageView rightDice= findViewById(R.id.image_right);
        final int[] Dicearray= {  R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        Rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.d("dicee","button has been pressed");
            Random randonNumberGeneartor= new Random();
            int number = randonNumberGeneartor.nextInt(6);
            Log.d("dicee","random no is"+number);

            leftDice.setImageResource(Dicearray[number]);
            number= randonNumberGeneartor.nextInt(6);
            rightDice.setImageResource(Dicearray[number]);
            }
        });


    }
}
