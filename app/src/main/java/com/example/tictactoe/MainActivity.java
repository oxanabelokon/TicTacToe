package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView player1;
    TextView player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = findViewById(R.id.textView_player1Display);
        player2 = findViewById(R.id.textView_player2Display);

        Intent intent = getIntent();

        String pl1= intent.getStringExtra("player1_name");
        String pl2= intent.getStringExtra("player2_name");

        player1.setText(pl1);
        player2.setText(pl2);


    }

    public void setupPlayersClick(View view)
    {
        Intent intent = new Intent(this, PlayerSetup.class);
        startActivity(intent);
    }


}