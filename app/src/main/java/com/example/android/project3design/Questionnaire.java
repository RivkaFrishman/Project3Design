package com.example.android.project3design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText wallAEditText = findViewById(R.id.wallAwidthValue);
                EditText wallBEditText = findViewById(R.id.wallBwidthValue);
                EditText wallCEditText = findViewById(R.id.wallCwidthValue);
                EditText wallDEditText = findViewById(R.id.wallDwidthValue);
                EditText wallHeightEditText = findViewById(R.id.wallHeightValue);

                String strWallAEditText = wallAEditText.getText().toString();
                String strWallBEditText = wallBEditText.getText().toString();
                String strWallCEditText = wallCEditText.getText().toString();
                String strWallDEditText = wallDEditText.getText().toString();
                String strWallHeightEditText = wallHeightEditText.getText().toString();

                if (!strWallAEditText.matches("") || !strWallBEditText.matches("") ||
                        !strWallCEditText.matches("") || !strWallDEditText.matches("") ||
                        !strWallHeightEditText.matches("")) {
                    Intent intent = new Intent(getApplicationContext(), DoorsWindows.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please fill in the requested values to continue", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}
