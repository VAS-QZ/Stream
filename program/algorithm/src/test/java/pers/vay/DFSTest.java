package pers.vay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DFSTest {

    DFS dfs = new DFS();

    @Test
    void numIslands() {
        char[][] test1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        char[][] test2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        assertEquals(dfs.numIslands(test1), 1);
        assertEquals(dfs.numIslands(test2), 3);
    }

    @Test
    void maxAreaOfIsland() {
        int[][] test1 = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                 {0,0,0,0,0,0,0,1,1,1,0,0,0},
                 {0,1,1,0,1,0,0,0,0,0,0,0,0},
                 {0,1,0,0,1,1,0,0,1,0,1,0,0},
                 {0,1,0,0,1,1,0,0,1,1,1,0,0},
                 {0,0,0,0,0,0,0,0,0,0,1,0,0},
                 {0,0,0,0,0,0,0,1,1,1,0,0,0},
                 {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        assertEquals(dfs.maxAreaOfIsland(test1), 6);
    }

    @Test
    void orangesRotting() {
        int[][] test1 = {{2,1,1},{1,1,0},{0,1,1}};
        int[][] test2 = {{2,1,1},{0,1,1},{1,0,1}};
        int[][] test3 = {{0,2}};
        int[][] test4 = {{1,2}};
        assertEquals(dfs.orangesRotting(test1), 4);
        assertEquals(dfs.orangesRotting(test2), -1);
        assertEquals(dfs.orangesRotting(test3), 0);
        assertEquals(dfs.orangesRotting(test4), 1);
    }


}