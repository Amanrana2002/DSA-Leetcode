class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        // int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) a++;
            if(nums[i]==1) b++;
            // if(nums[i]==2) c++;
        }
        for(int i=0;i<a;i++){
            nums[i]=0;
        }
        for(int i=a;i<a+b;i++){
            nums[i]=1;
        }
        for(int i=a+b;i<nums.length;i++){
            nums[i]=2;
        }
        System.out.print(Arrays.toString(nums));
    }
}