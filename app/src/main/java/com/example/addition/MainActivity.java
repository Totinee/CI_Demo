package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Addition class logic
        TextView resultTextView = findViewById(R.id.resultTextView);
        int result = Addition.add(2, 3);
        resultTextView.setText("Result of 2 + 3 = " + result);
    }
}
