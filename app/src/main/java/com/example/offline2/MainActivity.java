package com.example.offline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt1 = (Button)findViewById(R.id.button);
        Button butt2 = (Button)findViewById(R.id.button2);
        Button butt3 = (Button)findViewById(R.id.button3);
        Button butt4 = (Button)findViewById(R.id.button4);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int1 = new Intent(MainActivity.this,SecondActivity.class);
                 startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int2 = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int3 = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int4 = new Intent(MainActivity.this,FifthActivity.class);
                startActivity(int4);
            }
        });
    }
}
