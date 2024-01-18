package com.nazma_humayra.linear_layout_intent_longclick_button_textchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button button3,button4;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button3 = findViewById(R.id.bt_3);
        textView4 = findViewById(R.id.tv_4);
        button4= findViewById(R.id.bt_4);

        double product = getIntent().getExtras().getDouble("product");
        double message4 = getIntent().getExtras().getDouble("percentage");
        double result = (( message4 * product) / 100 );
        textView4.setText(result + " TK");
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(ThirdActivity.this, MainActivity.class);


                startActivity(ii);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(ThirdActivity.this, FirstActivity.class);


                startActivity(ii);
            }
        });
    }
}
