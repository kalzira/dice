package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final Random random = new Random();
    private Button roll;
    private ImageView image1, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.roll);
        image1 = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("ic_dice_six_faces_" + value1, "drawable", "com.example.dice");
                int res2 = getResources().getIdentifier("ic_dice_six_faces_" + value2, "drawable", "com.example.dice");

                image1.setImageResource(res1);
                image2.setImageResource(res2);
            }
        });
    }

    public static int randomDiceValue() {
        return random.nextInt(6) + 1;
    }




}
