package com.example.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bioActivity extends AppCompatActivity {
    private ImageView bioImage;
    private TextView bioText;
    private TextView bioDescipt;
    private Bundle entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        bioImage = findViewById(R.id.bioImageID);
        bioText = findViewById(R.id.bioNameID);
        bioDescipt = findViewById(R.id.bioDescribeID);

        // To receive data parsed from previous activity
        entries = getIntent().getExtras();

        if (entries != null){
           String name = entries.getString("name");
           String bio = entries.getString("bio");

           setUp(name, bio);
        }
    }

    public void setUp(String name, String bio){
        if (name.equals("Tommy")){
            // configuring the activity based on parsed data

            bioImage.setImageDrawable(getResources().getDrawable(R.drawable.cat1));
            bioText.setText(name);
            bioDescipt.setText(bio);
        } else if(name.equals("Billy")){
            bioImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            bioText.setText(name);
            bioDescipt.setText(bio);
        }
    }
}
