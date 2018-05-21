package com.akbt.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonP2 = (Button) findViewById(R.id.button_P2);
        buttonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Page2.class);
                startActivity(i);
            }
        });

        Button buttonP3 = (Button) findViewById(R.id.button_P3);
        buttonP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Page3.class);
                startActivity(i);
            }
        });

    }
}
