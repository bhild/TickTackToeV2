package com.example.tictacktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button gameButton;
    private Button infoButton;
    private Button singlePlayerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameButton = (Button) findViewById(R.id.gameButton);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameActivty();
            }
        });
        singlePlayerButton = (Button) findViewById(R.id.gameButton2);
        singlePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSinglePlayerActivty();
            }
        });

        infoButton = (Button) findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });



    }

    public void openGameActivty() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
    public void openSinglePlayerActivty() {
        Intent intent = new Intent(this, OnePlayerMode.class);
        startActivity(intent);
    }
    public void openInfoActivity() {
        Intent intent2 = new Intent(this, InfoActivity.class);
        startActivity(intent2);
    }
}