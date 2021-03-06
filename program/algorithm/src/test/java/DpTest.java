import org.junit.jupiter.api.Test;
import pers.vay.Dp;
import pers.vay.structure.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DpTest {

    Dp dp = new Dp();

    @Test
    void minPathSum() {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int[][] grid1 = {{1}};
        int[][] grid2 = {{1,3,1}};
        assertEquals(dp.minPathSum(grid), 7);
        assertEquals(dp.minPathSum(grid1), 1);
        assertEquals(dp.minPathSum(grid2), 5);
    }

    @Test
    void rob() {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,7,9,3,1};
        assertEquals(dp.rob(nums1), 4);
        assertEquals(dp.rob(nums2), 12);
    }

    @Test
    void climbStairs() {
        assertEquals(dp.climbStairs(2), 2);
        assertEquals(dp.climbStairs(3), 3);
    }

    @Test
    void maxProfit() {
        int[] t = {7,1,5,3,6,4};
        int[] t1 = {7,6,4,3,1};
        int[] t2 = {1,2};
        assertEquals(dp.maxProfit(t), 5);
        assertEquals(dp.maxProfit(t1), 0);
        assertEquals(dp.maxProfit(t2), 1);
    }

    @Test
    void maxProfit2() {
        int[] t = {7,1,5,3,6,4};
        int[] t1 = {7,6,4,3,1};
        int[] t2 = {1,2};
        assertEquals(dp.maxProfit2(t), 5);
        assertEquals(dp.maxProfit2(t1), 0);
        assertEquals(dp.maxProfit2(t2), 1);
    }

    @Test
    void divisorGame() {
        assertEquals(dp.divisorGame(2), true);
        assertEquals(dp.divisorGame(3), false);
    }

    @Test
    void minCostClimbingStairs() {
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(dp.minCostClimbingStairs(cost1), 15);
        assertEquals(dp.minCostClimbingStairs(cost2), 6);
    }

    @Test
    void sumRange() {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        Dp.NumArray n = new Dp.NumArray(nums);
        assertEquals(n.sumRange(0, 2), 1);
        assertEquals(n.sumRange(2, 5), -1);
        assertEquals(n.sumRange(0, 5), -3);
    }

    @Test
    void countBits1() {
        int ans0[] = {0};
        int ans3[] = {0,1};
        int ans1[] = {0,1,1};
        int ans2[] = {0,1,1,2,1,2};
        int ans4[] = {0,1,1,2,1,2,2,3,1};
        assertArrayEquals(dp.countBits_1(0), ans0);
        assertArrayEquals(dp.countBits_1(1), ans3);
        assertArrayEquals(dp.countBits_1(2), ans1);
        assertArrayEquals(dp.countBits_1(5), ans2);
        assertArrayEquals(dp.countBits_1(8), ans4);
    }

    @Test
    void countBits2() {
        int ans0[] = {0};
        int ans3[] = {0,1};
        int ans1[] = {0,1,1};
        int ans2[] = {0,1,1,2,1,2};
        int ans4[] = {0,1,1,2,1,2,2,3,1};
        assertArrayEquals(dp.countBits_2(0), ans0);
        assertArrayEquals(dp.countBits_2(1), ans3);
        assertArrayEquals(dp.countBits_2(2), ans1);
        assertArrayEquals(dp.countBits_2(5), ans2);
        assertArrayEquals(dp.countBits_2(8), ans4);
    }

    @Test
    void countBits3() {
        int ans0[] = {0};
        int ans3[] = {0,1};
        int ans1[] = {0,1,1};
        int ans2[] = {0,1,1,2,1,2};
        int ans4[] = {0,1,1,2,1,2,2,3,1};
        assertArrayEquals(dp.countBits_3(0), ans0);
        assertArrayEquals(dp.countBits_3(1), ans3);
        assertArrayEquals(dp.countBits_3(2), ans1);
        assertArrayEquals(dp.countBits_3(5), ans2);
        assertArrayEquals(dp.countBits_3(8), ans4);
    }

    @Test
    void minimumTotal() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        assertEquals(11, dp.minimumTotal(triangle));
    }

    @Test
    void numDecodings() {
        assertEquals(2, dp.numDecodings("12"));
        assertEquals(3, dp.numDecodings("226"));
        assertEquals(3, dp.numDecodings("2261"));
        assertEquals(0, dp.numDecodings("0"));
        assertEquals(1, dp.numDecodings("10"));
        assertEquals(0, dp.numDecodings("00"));
        assertEquals(0, dp.numDecodings("01"));
        assertEquals(0, dp.numDecodings("100"));
        assertEquals(1, dp.numDecodings("101"));
    }

    @Test
    void rob2() {
        int[] t1 = {2,3,2};
        int[] t2 = {1,2,3,1};
        int[] t3 = {1,2,3,1,6};
        int[] t4 = {1,1};
        assertEquals(3, dp.rob2(t1));
        assertEquals(4, dp.rob2(t2));
        assertEquals(9, dp.rob2(t3));
        assertEquals(1, dp.rob2(t4));
    }

    @Test
    void numSquares() {
        assertEquals(dp.numSquares(12), 3);
        assertEquals(dp.numSquares(13), 2);
    }

    @Test
    void isMatch() {
        assertEquals(dp.isMatch("aa", "a"), false);
        assertEquals(dp.isMatch("aa", "a*"), true);
        assertEquals(dp.isMatch("aa", ".*"), true);
        assertEquals(dp.isMatch("aab", "c*a*b*"), true);
        assertEquals(dp.isMatch("mississippi", "mis*is*p*."), false);
    }


    @Test
    void replaceSpace() {
        assertEquals(dp.replaceSpace("We are happy."), "We%20are%20happy.");
    }

    @Test
    void reversePrint() {
        ListNode a1 = new ListNode(1);
        a1.next = new ListNode(3);
        a1.next.next = new ListNode(2);
        int[] res = {2,3,1};
        assertArrayEquals(dp.reversePrint(a1), res);
    }

    @Test
    void fib() {
        assertEquals(dp.fib(2), 1);
        assertEquals(dp.fib(5), 5);
        System.out.println(dp.fib(94));
        System.out.println(dp.fib(95));
//        assertEquals(dp.fib(95), 407059028);
        System.out.println(dp.fib(100));
    }

    @Test
    void reverseLeftWords() {
        assertArrayEquals(dp.reverseLeftWords("abcdefg", 2).toCharArray(), "cdefgab".toCharArray());
    }

    @Test
    void reverseList() {
        ListNode a1 = new ListNode(1);
        a1.next = new ListNode(2);
        a1.next.next = new ListNode(3);
        a1.next.next.next = new ListNode(4);
        a1.next.next.next.next = new ListNode(5);
//        dp.reverseList(a1);
        dp.reverseList(null);
    }

    @Test
    void coinChange() {
        int[] test1 = {1,2,5};
        int[] test2 = {2};
        int[] test3 = {};
        int[] test4 = {2,5,10,1};
        assertEquals(dp.coinChange(test1, 11), 3);
        assertEquals(dp.coinChange(test2, 3), -1);
        assertEquals(dp.coinChange(test3, 3), -1);
        assertEquals(dp.coinChange(test4, 27), 4);
    }

}