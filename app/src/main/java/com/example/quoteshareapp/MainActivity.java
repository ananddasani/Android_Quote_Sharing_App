package com.example.quoteshareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQuote;
    Button buttonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide the toolbar
        getSupportActionBar().hide();

        tvQuote = findViewById(R.id.tvQuote);
        buttonShare = findViewById(R.id.buttonShare);

        buttonShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String quoteToShare = tvQuote.getText().toString();

                        Intent intent = new Intent();

                        intent.setAction(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, quoteToShare);

                        startActivity(intent);
                    }
                }
        );
    }
}