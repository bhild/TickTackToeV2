package com.example.tictacktoe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testMoveWin001(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,1},{2,0,2},{0,0,0}};//array after move {1,1,1},{2,0,2},{0,0,0}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
}