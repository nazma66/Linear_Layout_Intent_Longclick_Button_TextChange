package com.nazma_humayra.linear_layout_intent_longclick_button_textchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    Button button1;
    EditText editText1,editText2 ,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button1 = findViewById(R.id.bt_1);
        editText1 = findViewById(R.id.et_1);
        editText2 = findViewById(R.id.et_2);
        editText3 = findViewById(R.id.et_3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(FirstActivity.this,SecondActivity.class);
                String message1 = editText1.getText().toString().trim();
                ii.putExtra("name",message1);

                String message2s = editText2.getText().toString().trim();
                double message2 = Double.parseDouble(message2s);
                ii.putExtra("price", message2);

                String message3S = editText3.getText().toString().trim();
                double message3 = Double.parseDouble(message3S);
                ii.putExtra("quantity", message3);

                startActivity(ii);
            }
        });
    }
}