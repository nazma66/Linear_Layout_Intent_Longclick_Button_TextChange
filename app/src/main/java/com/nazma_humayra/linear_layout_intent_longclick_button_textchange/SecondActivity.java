package com.nazma_humayra.linear_layout_intent_longclick_button_textchange;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button button2;
    TextView textView1;
    TextView textView2;
    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button2 = findViewById(R.id.bt_2);
        textView1 = findViewById(R.id.tv_1);
        textView2 = findViewById(R.id.tv_2);
        editText4 = findViewById(R.id.et_4);

        String string_value = getIntent().getExtras().getString("name");
        textView1.setText(string_value);

        double message2 = getIntent().getExtras().getDouble("price");
        double message3 = getIntent().getExtras().getDouble("quantity");

        double product = message2 * message3;
        textView2.setText(product + " TK");



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Move the code block inside the onClick method



                double product = message2 * message3;
                textView2.setText(product + " TK");

                String message4s = editText4.getText().toString().trim();
                double message4 = Double.parseDouble(message4s);



                Intent ii = new Intent(SecondActivity.this,ThirdActivity.class);

                ii.putExtra("product",product);

                ii.putExtra("percentage", message4);

                startActivity(ii);
            }
        });
    }
}
