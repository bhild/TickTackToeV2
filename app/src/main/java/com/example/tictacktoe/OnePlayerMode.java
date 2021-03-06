
package com.example.tictacktoe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class OnePlayerMode extends AppCompatActivity {

    private Button doneButton;
    int[][] buttonStates = new int[3][3];//creates a 3x3 array
    //0 - empty
    //1 - x
    //2 - o
    boolean xOrO = true;// if the active player is x or O
    //true - O
    //false - x
    private int[] score = new int[2];
    private Button[][] gameButtons = new Button[3][3];
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView view = findViewById(R.id.playerState);
        setContentView(R.layout.activity_game);
        final int[] aiMove = new AiPlayer().move(buttonStates);
        for (int i = 0;i<3;i++){
            for(int j = 0; j<3;j++){
                //String id = "button"+i+j;
                //clerifictation this gets the button i + j and gets its id and stores it here
                int id = getResources().getIdentifier("button"+i+""+j,"id",getPackageName());
                gameButtons[i][j] = (Button) findViewById(id);
                final int finalI = i;
                final int finalJ = j;
                gameButtons[i][j].setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    public void onClick(View v) {
                        buttonStates[finalI][finalJ] = 2;
                        v.setForeground(getDrawable(R.drawable.rioux2));
                        gameButtons[finalI][finalJ].setEnabled(false);
                        gameReseterPlayer();
                        gameReseterAI();
                        Log.i("info",aiMove[0]+","+aiMove[1]);

                    }
                });
            }
        }
        buttonStates[aiMove[0]][aiMove[1]]=1;
        int id = getResources().getIdentifier("button"+aiMove[0]+""+aiMove[1],"id",getPackageName());
        findViewById(id).setForeground(getDrawable(R.drawable.flower));
        doneButton = (Button) findViewById(R.id.doneButton);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoneActivty();
            }
        });
    }
    public void openDoneActivty() {
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }
    private boolean isCatsGame(){
        boolean returnState = true;
        for (int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                if(buttonStates[i][j]==0&&returnState) {
                    returnState = false;
                }
            }
        }
        return returnState&&!gameWon();
    }
    private boolean gameWon(){
        boolean returnState = false;
        for(int x = 0; x < 3; x++)//check for vertical wins
        {
            if (buttonStates[x][0] == buttonStates[x][1] && buttonStates[x][1] == buttonStates[x][2] && buttonStates[x][0] != 0) {
                returnState = true;
            }
        }
        for(int y = 0; y < 3; y++)//check for horizontal wins
        {
            if (buttonStates[0][y] == buttonStates[1][y] && buttonStates[1][y] == buttonStates[2][y] && buttonStates[0][y] != 0) {
                returnState = true;
            }
        }
        //check for diagonal wins
        if(buttonStates[0][0] == buttonStates[1][1] && buttonStates[1][1] == buttonStates[2][2] && buttonStates[0][0] != 0)
        {
            returnState = true;
        }
        else if(buttonStates[0][2] == buttonStates[1][1] && buttonStates[1][1] == buttonStates[2][0] && buttonStates[0][2] != 0)
        {
            returnState = true;

        }
        return returnState;
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void resetBoard(){
        for (int i = 0; i <3;i++){
            for (int j = 0; j<3;j++){
                int id = getResources().getIdentifier("button"+i+""+j,"id",getPackageName());
                Button b = findViewById(id);
                b.setEnabled(true);
                b.setText("");
                buttonStates[i][j]=0;
                gameButtons[i][j].setForeground(null);
                xOrO = false;
            }
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void gameReseterAI(){
        if(gameWon()){
            score[1]++;
            TextView tv1 = findViewById(R.id.p2Text);
            tv1.setText("Player 2: "+score[1]);
            Toast.makeText(getApplicationContext(),"Player 2 wins",Toast.LENGTH_LONG).show();
            resetBoard();
            buttonStates[1][1]=1;
            int id = getResources().getIdentifier("button"+1+""+1,"id",getPackageName());
            findViewById(id).setForeground(getDrawable(R.drawable.flower));
        }
        else if (isCatsGame()){
            Toast.makeText(getApplicationContext(),"No one wins",Toast.LENGTH_LONG).show();
            resetBoard();
            buttonStates[1][1]=1;
            int id = getResources().getIdentifier("button"+1+""+1,"id",getPackageName());
            findViewById(id).setForeground(getDrawable(R.drawable.flower));
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void gameReseterPlayer(){
        if(gameWon()){
            score[0]++;
            TextView tv1 = findViewById(R.id.p1Text);
            tv1.setText("Player 1: "+score[0]);
            Toast.makeText(getApplicationContext(),"Player 1 wins",Toast.LENGTH_LONG).show();
            resetBoard();
            int[] aiMove = new AiPlayer().move(buttonStates);
            buttonStates[aiMove[0]][aiMove[1]] = 1;
            gameButtons[aiMove[0]][aiMove[1]].setForeground(getDrawable(R.drawable.flower));
        }
        else if (isCatsGame()){
            Toast.makeText(getApplicationContext(),"No one wins",Toast.LENGTH_LONG).show();
            resetBoard();
            int[] aiMove = new AiPlayer().move(buttonStates);
            buttonStates[aiMove[0]][aiMove[1]] = 1;
            gameButtons[aiMove[0]][aiMove[1]].setForeground(getDrawable(R.drawable.flower));
        }else{
            int[] aiMove = new AiPlayer().move(buttonStates);
            buttonStates[aiMove[0]][aiMove[1]] = 1;
            gameButtons[aiMove[0]][aiMove[1]].setForeground(getDrawable(R.drawable.flower));
        }
    }
}