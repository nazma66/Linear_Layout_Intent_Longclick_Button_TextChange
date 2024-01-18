package com.nazma_humayra.linear_layout_intent_longclick_button_textchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button on_longclick,on_click,buttontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        on_click = findViewById(R.id.on_click);
        on_longclick = findViewById(R.id.on_longclick);
buttontext = findViewById(R.id.buttontext);

        on_longclick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Intent intent = new Intent(MainActivity.this, LinearLayout.class);


                startActivity(intent);


                return true;
            }

        });

        on_longclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(MainActivity.this, ConstraintLayout.class);
                startActivity(iii);
            }
        });

        on_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, FirstActivity.class);


                startActivity(intent1);

            }
        });

       buttontext.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
               Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_SHORT).show();

               return false;
           }
       });

       buttontext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               buttontext.setText("hello");
               buttontext.setTextSize(40);
           }
       });
    }
}
