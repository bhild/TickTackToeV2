package com.example.tictacktoe;

import org.junit.Test;

	@@ -266,9 +266,106 @@ public void testMoveWin035(){//ai makes the move to win
    public void testMoveWin036(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,1,0},{1,1,2},{0,2,2}};
        //array after move {0,1,1},{1,1,2},{0,2,2}
        //available spaces: {0,0} {0,2} {2,0}
        assertArrayEquals(new int[] {0,0},p.move(board)); // or {2,0}
    }
    @Test
    public void testMoveWin037(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,0},{0,2,2},{0,1,1}};
        //array after move {0,0,0},{0,2,2},{1,1,1}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin038(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,2},{0,1,2},{0,0,0}};
        //array after move {1,0,2},{0,1,2},{0,0,1}
        assertArrayEquals(new int[] {2,2},p.move(board));
    }
    @Test
    public void testMoveWin039(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,0},{1,2,0},{0,2,0}};
        //array after move {1,0,0},{1,2,0},{1,2,0}
        assertArrayEquals(new int[] {2,0},p.move(board));
    }
    @Test
    public void testMoveWin40(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,1,2},{2,1,0},{0,0,2}};
        //array after move {1,1,2},{2,1,0},{0,1,2}
        assertArrayEquals(new int[] {2,1},p.move(board));
    }
    @Test
    public void testMoveWin41(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,1},{2,0,2},{1,1,2}};
        //array after move {0,0,1},{2,1,2},{1,1,2}
        assertArrayEquals(new int[] {1,1},p.move(board));
    }
    @Test
    public void testMoveWin42(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,2},{1,0,1},{2,2,1}};
        //array after move {0,0,2},{1,1,1},{2,2,1}
        assertArrayEquals(new int[] {1,1},p.move(board));
    }
    @Test
    public void testMoveWin43(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,0,1},{2,2,0},{1,2,0}};
        //array after move {1,1,1},{2,2,0},{1,2,0}
        assertArrayEquals(new int[] {0,1},p.move(board));
    }
    @Test
    public void testMoveWin44(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,0},{2,2,1},{2,1,1}};
        //array after move {1,2,1},{2,2,1},{2,1,1}
        assertArrayEquals(new int[] {0,2},p.move(board));
    }
    @Test
    public void testMoveWin45(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,1,0},{2,2,1},{1,2,2}};
        //array after move {1,1,1},{2,2,1},{1,2,2}
        assertArrayEquals(new int[] {0,2},p.move(board));
    }
    @Test
    public void testMoveWin46(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,0,2},{0,1,1},{2,0,1}};
        //array after move {2,0,2},{1,1,1},{2,0,1}
        assertArrayEquals(new int[] {1,0},p.move(board));
    }
    @Test
    public void testMoveWin47(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{2,1,1},{2,2,0},{1,2,1}};
        //array after move {2,1,1},{2,2,1},{1,2,1}
        assertArrayEquals(new int[] {1,2},p.move(board));
    }
    @Test
    public void testMoveWin48(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{0,0,1},{2,2,0},{2,1,1}};
        //array after move {0,0,1},{2,2,1},{2,1,1}
        assertArrayEquals(new int[] {1,2},p.move(board));
    }
    @Test
    public void testMoveWin49(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,2},{0,1,0},{1,0,2}};
        //array after move {1,2,2},{1,1,0},{1,0,2}
        assertArrayEquals(new int[] {1,0},p.move(board));
    }
    @Test
    public void testMoveWin50(){
        AiPlayer p = new AiPlayer();
        int[][] board = {{1,2,0},{2,1,0},{1,0,2}};
        //array after move {1,2,1},{2,1,0},{1,0,2}
        assertArrayEquals(new int[] {0,2},p.move(board));
    }
}
 
