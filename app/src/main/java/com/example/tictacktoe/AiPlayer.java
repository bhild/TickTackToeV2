package com.example.tictacktoe;

import androidx.appcompat.app.AppCompatActivity;

public class AiPlayer extends AppCompatActivity {
    //this method returns the move the ai will make
    public int[] move(int[][] board) {
        //this boolean is used to short circuit the for loop later
        boolean bestMove = false;
        int[] pos = {0,0};
        //if the ai can win in one move
        if (isOneMoveWin(board,1)>0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(bestMove) {
                        //this runs if the best move is found
                    }else if (board[i][j]==0) {//this runs if the tile is empty
                        board[i][j] = 1;
                        if (gameWon(board)) {//looks to see if the move wins
                            bestMove = true;
                            pos = new int[] {i,j};
                        }else {//else returns board to previous` state
                            board[i][j]=0;
                        }
                    }
                }
            }
            if(bestMove) {
                return new int[] {pos[0],pos[1]};//returns the best move
            }
        }else if(isOneMoveWin(board,2)==1) {//if the player can win in one move in exactly one way
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(bestMove) {
                        //this runs if the best move is found
                    }else if (board[i][j]==0) {//this runs if the tile is empty
                        board[i][j] = 1;
                        if (isOneMoveWin(board,2)==0) {//sees if move stops the win
                            bestMove = true;
                            pos = new int[] {i,j};
                        }else {//else returns board to previous state
                            board[i][j]=0;
                        }
                    }
                }
            }
            if(bestMove) {
                return new int[] {pos[0],pos[1]};//returns the best move
            }
            else if(isOneMoveWin(board,2)>1){
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(bestMove) {
                            //this runs if the best move is found
                        }else if (board[i][j]==0) {//this runs if the tile is empty
                            return new int[]{i,j};
                        }
                    }
                }
            }
        }
        //runs the other move calculation here
        int [] move = bestMove(true,board);
        return new int[] {move[0],move[1]};
    }
    private int isOneMoveWin(int[][] board,int player) {//takes in a board and player
        int returnState = 0;
        for(int x = 0; x < 3; x++)
        {
            if ((board[x][0] +""+ board[x][1] +""+ board[x][2]).replaceAll("0", "").equals(player+""+player)) {
                returnState++;//this is for rows
            }
        }
        for(int y = 0; y < 3; y++)
        {
            if ((board[0][y] +""+ board[1][y] +""+ board[2][y]).replaceAll("0", "").equals(player+""+player)) {
                returnState++;//this if for columns
            }
        }
        if((board[0][0] +""+ board[1][1] +""+ board[2][2]).replaceAll("0", "").equals(player+""+player))
        {
            returnState++;//diagonal 1
        }
        if ((board[0][2] +""+ board[1][1] +""+ board[2][0]).replaceAll("0", "").equals(player+""+player))
        {
            returnState++;//diagonal 2
        }
        return returnState;//returns how many ways a player can win in one turn on any given board
    }
    private boolean gameWon(int[][] board){//determines if a player wins
        //identical to the one in the game class but adapted to use variable input
        boolean returnState = false;
        for(int x = 0; x < 3; x++)
        {
            if (board[x][0] == board[x][1] && board[x][1] == board[x][2] && board[x][0] != 0) {
                returnState = true;//rows
            }
        }
        for(int y = 0; y < 3; y++)
        {
            if (board[0][y] == board[1][y] && board[1][y] == board[2][y] && board[0][y] != 0) {
                returnState = true;//columns
            }
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0)
        {
            returnState = true;//diagonal
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0)
        {
            returnState = true;//diagonal
        }
        return returnState;//return if a player has won
    }
    private int[] bestMove(boolean turn, int[][] board){//attempts to find the best move
        int[] out = {0,0};//this is the move
        int[] state = new int[3];//wins, draws and looses that originate from a move
        for (int i = 0; i < 3; i++) {//this test all moves
            for (int j = 0; j < 3; j++) {
                if (board[i][j]==0) {
                    board[i][j]=1;
                    int[] tempState = lookAhead(board, !turn);
                    if (state[0]==0&&state[1]==0&&state[2]==0) {//runs only if it is the first iteration
                        state = tempState;//sets the first input set to state
                        out = new int[] {i,j};//sets the first value to output
                    }else {
                        //simple calculation for best move - needs work -
                        if (state[0]+state[1]-state[2]-(tempState[0]+tempState[1]-tempState[2])>0) {
                            out = new int[] {i,j};//set out to new best move
                        }
                    }
                    board[i][j]=0;//reset board state

                }
            }
        }
        return out;//returns best* move
        //*may not be the best move
    }
    private int[] lookAhead(int[][] board, boolean turn) {
        int[] out = {0,0,0};//stores the wins, draws and looses that originate from a board state
        if (!gameWon(board)&&isCatsGame(board)) {
            out[2]++;//stores a cats game
        }else if (gameWon(board)&&turn) {
            out[0]++;//stores a win
        }else if(gameWon(board)&&!turn) {
            out[1]++;//stores a loss
        }
        turn=!turn;//inverts turn
        //recursively playes all games of tick tack toe
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]==0&&!gameWon(board)) {//if the game is won then it does not need to keep recurring
                    //there is no point for cats games as that does not change run time
                    int temp[] = new int[0];
                    if (!turn) {//looks at which players turn it is
                        board[i][j] = 1;//next move in chain
                        temp = lookAhead(board, turn);//recursive call
                        board[i][j] = 0;//resets board state
                    }else {
                        board[i][j] = 2;//next move in chain
                        temp = lookAhead(board, turn);//recursive call
                        board[i][j] = 0;//resets board state
                    }
                    for (int j2 = 0; j2 < out.length; j2++) {
                        out[j2] += temp[j2];//adds stored total to the output
                    }
                }
            }
        }
        return out;//return the wins, draws and looses that originate from a board state
    }
    private boolean isCatsGame(int[][] board){//finds cats games
        boolean returnState = true;
        for (int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                if(board[i][j]==0&&returnState) {//if returnstate is false this doesn't need to run
                    returnState = false;//if a square is empty then it is not a cats game
                }
            }
        }
        return returnState;//returns if a board is a cats game
    }
}
