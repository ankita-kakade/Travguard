package com.example.travguard2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText locationInput;
    Button checkButton, feedbackButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationInput = findViewById(R.id.locationInput);
        checkButton = findViewById(R.id.checkButton);
        feedbackButton = findViewById(R.id.feedbackButton);
        resultText = findViewById(R.id.resultText);

        checkButton.setOnClickListener(v -> {
            String location = locationInput.getText().toString();

            if(location.isEmpty()){
                resultText.setText("Enter a location");
            } else {
                resultText.setText("Location Status: Unexplored");
            }
        });

        feedbackButton.setOnClickListener(v -> {
            String url = "https://forms.gle/YOUR_LINK";
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        });
    }
}