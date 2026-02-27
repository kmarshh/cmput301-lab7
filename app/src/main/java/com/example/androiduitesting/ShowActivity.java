package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView cityText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityText = findViewById(R.id.text_cityName);
        backButton = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra("city_name");
        cityText.setText(cityName);

        backButton.setOnClickListener(v -> finish());
    }
}
