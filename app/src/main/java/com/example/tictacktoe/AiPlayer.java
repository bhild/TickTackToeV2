package com.example.tictacktoe;

import androidx.appcompat.app.AppCompatActivity;

public class AiPlayer extends AppCompatActivity {

    public int[] move(int[][] board) {
        boolean bestMove = false;
        int[] pos = {0,0};
        if (isOneMoveWin(board,1)>0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(bestMove) {

                    }else if (board[i][j]==0) {
                        board[i][j] = 1;
                        if (gameWon(board)) {
                            bestMove = true;
                            pos = new int[] {i,j};
                        }else {
                            board[i][j]=0;
                        }
                    }
                }
            }
            if(bestMove) {
                return new int[] {pos[0],pos[1]};
            }
        }else if(isOneMoveWin(board,2)==1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(bestMove) {

                    }else if (board[i][j]==0) {
                        board[i][j] = 1;
                        if (isOneMoveWin(board,2)==0) {
                            bestMove = true;
                            pos = new int[] {i,j};
                        }else {
                            board[i][j]=0;
                        }
                    }
                }
            }
            if(bestMove) {
                return new int[] {pos[0],pos[1]};
            }
        }
        int [] move = bestMove(true,board);
        return new int[] {move[0],move[1]};
    }
    public int isOneMoveWin(int[][] board,int player) {
        int returnState = 0;
        for(int x = 0; x < 3; x++)
        {
            if ((board[x][0] +""+ board[x][1] +""+ board[x][2]).replaceAll("0", "").equals(player+""+player)) {
                returnState++;
            }
        }
        for(int y = 0; y < 3; y++)
        {
            if ((board[0][y] +""+ board[1][y] +""+ board[2][y]).replaceAll("0", "").equals(player+""+player)) {
                returnState++;
            }
        }
        if((board[0][0] +""+ board[1][1] +""+ board[2][2]).replaceAll("0", "").equals(player+""+player))
        {
            returnState++;
        }
        if ((board[0][2] +""+ board[1][1] +""+ board[2][0]).replaceAll("0", "").equals(player+""+player))
        {
            returnState++;
        }
        return returnState;
    }
    private boolean gameWon(int[][] board){
        boolean returnState = false;
        for(int x = 0; x < 3; x++)
        {
            if (board[x][0] == board[x][1] && board[x][1] == board[x][2] && board[x][0] != 0) {
                returnState = true;
            }
        }
        for(int y = 0; y < 3; y++)
        {
            if (board[0][y] == board[1][y] && board[1][y] == board[2][y] && board[0][y] != 0) {
                returnState = true;
            }
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0)
        {
            returnState = true;
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0)
        {
            returnState = true;
        }
        return returnState;
    }
    private int[] bestMove(boolean turn, int[][] board){
        int[] out = {0,0};
        int[] state = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]==0) {
                    board[i][j]=1;
                    int[] tempState = lookAhead(board, !turn);
                    if (state[0]==0&&state[1]==0&&state[2]==0) {
                        state = tempState;
                        out = new int[] {i,j};
                    }else {
                        if (state[0]+state[1]-state[2]-(tempState[0]+tempState[1]-tempState[2])>0) {
                            out = new int[] {i,j};
                        }
                    }
                    board[i][j]=0;

                }
            }
        }
        return out;
    }
    private int[] lookAhead(int[][] board, boolean turn) {
        int[] out = {0,0,0};
        if (!gameWon(board)&&isCatsGame(board)) {
            out[2]++;
        }else if (gameWon(board)&&turn) {
            out[0]++;
        }else if(gameWon(board)&&!turn) {
            out[1]++;
        }
        turn=!turn;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]==0&&!gameWon(board)) {
                    int temp[] = new int[0];
                    if (!turn) {
                        board[i][j] = 1;
                        temp = lookAhead(board, turn);
                        board[i][j] = 0;
                    }else {
                        board[i][j] = 2;
                        temp = lookAhead(board, turn);
                        board[i][j] = 0;
                    }
                    for (int j2 = 0; j2 < out.length; j2++) {
                        out[j2] += temp[j2];
                    }
                }
            }
        }
        return out;
    }
    private boolean isCatsGame(int[][] board){
        boolean returnState = true;
        for (int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                if(board[i][j]==0&&returnState) {
                    returnState = false;
                }
            }
        }
        return returnState;
    }

}
