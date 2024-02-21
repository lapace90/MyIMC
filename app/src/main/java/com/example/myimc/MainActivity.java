package com.example.myimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight, editTextHeight;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = findViewById(R.id.weight);
        editTextHeight = findViewById(R.id.height);
        button = findViewById(R.id.btnSubmit);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strHeight = editTextHeight.getText().toString().trim();
                float height = Float.parseFloat(strHeight)/100;

                String strWeight = editTextWeight.getText().toString().trim();
                float weight = Float.parseFloat(strWeight);

                if (weight < 40 || weight > 250)
                    Toast.makeText(getApplicationContext(), "Enter a value between 40 and 250 kg, please !", Toast.LENGTH_SHORT).show();
                else if (height < 1 || height > 2.5)
                    Toast.makeText(getApplicationContext(), "Enter a value between 100 and 250 cm, please !", Toast.LENGTH_SHORT).show();
                else {
                    float imc = weight / (height * height);
                    textView.setText(String.valueOf(Math.round(imc * 100.0) / 100.0));
                }
            }
        });
    }
}