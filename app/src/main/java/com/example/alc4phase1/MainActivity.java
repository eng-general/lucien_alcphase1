package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloworld.R;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    //public Button abt_me;

    public void init() {
        btn = (Button) findViewById(R.id.button_alc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abt_alc = new Intent(MainActivity.this, Activity2.class);

                startActivity(abt_alc);
            }
        });

       Button abt_me = (Button) findViewById(R.id.button_profile);
        abt_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button_profile = new Intent(MainActivity.this, activity3.class);

                startActivity(button_profile);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        //btn = (Button) findViewById(R.id.button_alc);
        init();
    }
}



