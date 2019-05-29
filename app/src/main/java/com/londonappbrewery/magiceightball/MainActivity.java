package com.londonappbrewery.magiceightball;

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

        Button rollButton;
        rollButton = (Button) findViewById(R.id.askButton);

        final ImageView Question = (ImageView) findViewById(R.id.imageQuestion);

        final int[] ballArray = {R.mipmap.yes,
                R.mipmap.no,
                R.mipmap.maybe,
                R.mipmap.notnow,
                R.mipmap.doubt,
                R.mipmap.later,
                R.mipmap.sure
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MagicBall", "Ze button has been clicked");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                Log.d("MagicBall", "The random answer is: " + number);

                Question.setImageResource(ballArray[number]);
            }
        });
    }
}
