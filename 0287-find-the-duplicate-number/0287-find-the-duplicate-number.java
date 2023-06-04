class Solution {
    public int findDuplicate(int[] nums) {
        int x[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if (x[nums[i]] == 0) {
                x[nums[i]] = nums[i]+1;
            } else {
                return nums[i];
            }
        }
        return 0;
    }
}