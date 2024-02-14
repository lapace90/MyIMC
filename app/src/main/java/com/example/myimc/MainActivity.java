package com.example.myimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText editTextWeight, editTextHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWeight = findViewById(R.id.weight);
        editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btnSubmit);
        TextView textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            private EditText editTextWeight, editTextHeight;

            @Override
            public void onClick(View v) {

                float height =  Float.parseFloat(editTextHeight.getText().toString()) /100;
                float weight = Float.parseFloat(editTextWeight.getText().toString());

                if (height = "" || weight = "") {
                    // Mettre un toast ici pour remplir les champs
                    return;
                } else {
                    float bmi = weight / (height * height);
                    textView.setText(String.valueOf(bmi));
                }

            }
        });
    }
}