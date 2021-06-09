package com.example.soleol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button demarrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.demarrer = (Button) findViewById(R.id.demarrer);
        demarrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mapsactivity =  new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(Mapsactivity);
                finish();

            }
        });

    }
}