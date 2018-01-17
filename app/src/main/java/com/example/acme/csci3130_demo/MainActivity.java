package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_1 = findViewById(R.id.button_1);
        final TextView textView_1 = findViewById(R.id.textView_1);
        final EditText editText_1 = findViewById(R.id.editText_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text;
                text = editText_1.getText().toString();
                textView_1.setText(text);
            }
        });
    }
}
