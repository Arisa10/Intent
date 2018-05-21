package com.akbt.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Button Nbutton = (Button) findViewById(R.id.button_NextPage);
        Nbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Page2.this, Page3.class);
                startActivity(i);
            }
        });

        Button Bbutton = (Button) findViewById(R.id.Bbutton_P1);
        Bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Page2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
