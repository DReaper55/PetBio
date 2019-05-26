package com.example.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView myCat;
    private ImageView myDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = findViewById(R.id.myCatID);
        myDog = findViewById(R.id.myDogID);

        myCat.setOnClickListener(MainActivity.this);
        myDog.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.myCatID:
//                Toast.makeText(MainActivity.this, "Tommy", Toast.LENGTH_SHORT).show();

                // To move to next activity
                Intent catIntent = new Intent(MainActivity.this, bioActivity.class);

                // To parse data to next activity

                catIntent.putExtra("name", "Tommy");
                catIntent.putExtra("bio", "Lazy creature that loves to scratch");
                startActivity(catIntent);
                break;

            case R.id.myDogID:
//                Toast.makeText(MainActivity.this, "Billy", Toast.LENGTH_SHORT).show();
                Intent dogIntent = new Intent(MainActivity.this, bioActivity.class);
                dogIntent.putExtra("name", "Billy");
                dogIntent.putExtra("bio", "Loyal mutt and loves to lick");
                startActivity(dogIntent);
                break;
        }
    }
}
