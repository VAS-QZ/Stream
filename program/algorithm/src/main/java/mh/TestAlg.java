package mh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAlg {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        int[] res = new int[2];
        Arrays.sort(temp);
        for(int i = 0, j = temp.length - 1; i < j;) {
            if(temp[i] + temp[j] == target) {
                res[0] = temp[i];
                res[1] = temp[j];
                break;
            }else if(temp[i] + temp[j] > target) {
                j--;
            }else{
                i++;
            }
        }
        int t = 0;
        for(int i = 0; i < nums.length; i++) {
            if(res[0] == nums[i]){
                res[0] = i;
                t++;
                continue;
            }
            if(res[1] == nums[i]){
                res[1] = i;
                t++;
            }
            if(t == 2){
                break;
            }
        }
        return res;
    }

    /**
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = 0 - nums[i];
            for(int p = i + 1, q = nums.length - 1; p < q;) {
                if(nums[p] + nums[q] == target) {
                    List<Integer> ress = new ArrayList<Integer>();
                    ress.add(nums[i]);
                    ress.add(nums[p]);
                    ress.add(nums[q]);
                    res.add(ress);
                    do{
                        p++;
                    }while(p > i + 1 && p < q && nums[p] == nums[p - 1]);
                    do{
                        q--;
                    }while(q < nums.length - 1 && p < q && nums[q] == nums[q + 1]);
                    continue;
                }else if(nums[p] + nums[q] > target) {
                    q--;
                }else{
                    p++;
                }
            }
        }
        return res;
    }
}
