 package com.example.tictacktoe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //0 - empty
    //1 - x
    //2 - o

    @Test
    public void testMoveWin001(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,1},{2,0,2},{0,0,0}};//array after move {1,1,1},{2,0,2},{0,0,0}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
    @Test
    public void testMoveWin002(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,0},{0,2,0},{1,0,0}};//array after move {1,0,0},{1,2,0},{1,0,0}
        //tile changed {1,0}
        assertArrayEquals(new int[] {1,0},p.move(board));
    }
    @Test
    public void testMoveWin003(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,1},{1,2,0},{2,0,0}};//array after move {2,0,1},{1,2,0},{2,0,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin004(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,1},{0,2,0},{2,0,0}};//array after move {1,1,1},{0,2,0},{2,0,0}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
    @Test
    public void testMoveWin005(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,2},{0,0,0},{2,0,1}};//array after move {1,2,2},{0,1,0},{2,0,1}
        //tile changed {1,1}
        assertArrayEquals(new int[] {1,1},p.move(board));
    }
    @Test
    public void testMoveWin006(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,1,2},{0,0,0},{2,2,0}};//array after move {0,1,2},{0,0,0},{2,2,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin007(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,1,2},{0,0,0},{2,2,0}};//array after move {0,1,2},{0,0,0},{2,2,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin008(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,1,0},{0,0,2},{0,0,2}};//array after move {0,1,1},{0,0,2},{0,0,2}
        //tile changed {0,2}
        assertArrayEquals(new int[] {0,2},p.move(board));
    }
    @Test
    public void testMoveWin009(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,2},{0,1,1},{2,0,0}};//array after move {2,0,2},{1,1,1},{2,0,0}
        //tile changed {1,0}
        assertArrayEquals(new int[] {1,0},p.move(board));
    }
    @Test
    public void testMoveWin010(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,0},{0,2,1},{0,1,0}};//array after move {2,0,0},{0,2,1},{0,1,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin011(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,2,1},{2,1,0},{0,2,0}};//array after move {0,2,1},{2,1,0},{1,2,0}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin012(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,1,2},{0,1,2},{0,0,1}};//array after move {2,1,2},{0,1,2},{0,1,1}
        //tile changed {2,1}
        assertArrayEquals(new int[] {2,1},p.move(board));
    }
    @Test
    public void testMoveWin013(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,1},{0,1,0},{1,2,0}};//array after move {1,2,1},{1,1,0},{1,2,0}
        //tile changed {1,0}
        assertArrayEquals(new int[] {1,0},p.move(board));
    }
    @Test
    public void testMoveWin014(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,2,1},{1,1,2},{0,0,0}};//array after move {0,2,1},{1,1,2},{1,0,0}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin015(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,1,1},{0,0,2},{1,0,2}};//array after move {2,1,1},{0,1,2},{1,0,2}
        //tile changed {1,1}
        assertArrayEquals(new int[] {1,1},p.move(board));
    }
    @Test
    public void testMoveWin016(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,0},{2,1,1},{1,0,2}};//array after move {1,2,1},{2,1,1},{1,0,2}
        //tile changed {0,2}
        assertArrayEquals(new int[] {0,2},p.move(board));
    }
    @Test
    public void testMoveWin017(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,2},{0,2,0},{0,0,1}};//array after move {1,0,2},{0,2,0},{1,0,1}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin018(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,1},{0,0,2},{2,0,2}};//array after move {1,1,1},{0,0,2},{2,0,2}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
    @Test
    public void testMoveWin019(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,2},{0,1,2},{0,0,1}};//array after move {2,1,2},{0,1,2},{0,0,1}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
    @Test
    public void testMoveWin020(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,2},{0,0,0},{1,0,1}};//array after move {2,0,2},{0,0,0},{1,1,1}
        //tile changed {2,1}
        assertArrayEquals(new int[] {2,1},p.move(board));
    }
    @Test
    public void testMoveWin021(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,1},{2,1,2},{0,0,0}};//array after move {1,2,1},{2,1,2},{1,0,0}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin022(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,0},{0,2,2},{0,1,1}};//array after move {1,0,0},{0,2,2},{1,1,1}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin023(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,1,2},{0,2,0},{0,0,2}};//array after move {1,1,2},{0,2,0},{0,0,2}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin024(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,1,0},{2,2,0},{1,0,0}};//array after move {2,1,0},{2,2,0},{1,0,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board)); // but could also be {1,2}
    }
    @Test
    public void testMoveWin025(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,1},{0,2,0},{2,0,1}}; //array after move {0,0,1},{0,2,1},{2,0,1}
        //tile changed {1,2}
        assertArrayEquals(new int[] {1,2},p.move(board));
    }
    @Test
    public void testMoveWin026(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,1},{0,2,2},{1,1,2}}; //array after move {1,0,1},{0,2,2},{1,1,2}
        //tile changed {0,0}
        assertArrayEquals(new int[] {0,0},p.move(board)); // could also be {0,1)
    }
    @Test
    public void testMoveWin027(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,1},{2,1,1},{0,2,2}}; //array after move {1,2,1},{2,1,1},{1,2,2}
        //tile changed {2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin028(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,1},{2,1,2},{2,1,0}}; //array after move {1,2,1},{2,1,2},{2,1,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin029(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,2},{2,1,0},{0,0,1}}; //array after move {2,1,2},{2,1,0},{0,0,1}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board)); // second choice: {2,0}
    }
    @Test
    public void testMoveWin030(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,0},{2,1,2},{2,1,0}}; //array after move {2,1,2},{2,1,0},{0,0,1}
        //tile changed {0,1}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
    @Test
    public void testMoveWin031(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,1,2},{0,1,2},{1,2,1}}; //array after move {2,1,2},{1,1,2},{1,2,1}
        //tile changed {1,0}
        assertArrayEquals(new int[] {1,0},p.move(board));
    }
    @Test
    public void testMoveWin032(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,1,2},{2,2,1},{1,0,0}}; //array after move {1,1,2},{2,2,1},{1,1,0}
        //tile changed {2,1}
        assertArrayEquals(new int[] {2,1},p.move(board)); // or {2,2} but goes left to right ^
    }
    @Test
    public void testMoveWin033(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,1,1},{0,2,0},{1,2,0}}; //array after move {2,1,1},{0,2,0},{1,2,1}
        //tile changed {2,2}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin034(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,1,0},{1,1,2},{0,2,2}}; //array after move {1,1,1},{1,1,2},{0,2,2}
        //tile changed {0,2}
        assertArrayEquals(new int[] {0,2},p.move(board));
    }
    @Test
    public void testMoveWin035(){//ai makes the move to win
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,1,0},{1,2,0},{0,2,0}}; //array after move {1,1,0},{1,2,0},{1,2,0}
        //tile changed {2,0}
        assertArrayEquals(new int[] {0,2},p.move(board)); // or {2,0}
    }

    // confusion
    @Test
    public void testMoveWin036(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,1,0},{1,1,2},{0,2,2}};
        //array after move {0,1,1},{1,1,2},{0,2,2} or {0,1,0},{1,1,2},{1,2,2}
        //available spaces: {0,0} {0,2} {2,0}
        //should be either {0,2} or {2,0} but -
        assertArrayEquals(new int[] {0,0},p.move(board)); // or {2,0}
    }
}