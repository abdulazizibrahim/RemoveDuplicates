import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set <Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++)
        {
            set.add(nums[i]);
        }  //inside branch
     
      return set.size();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] nums = {0,0,1,11,1,2,2,3,3,4};
        System.out.println(sol.removeDuplicates(nums));
    }
}