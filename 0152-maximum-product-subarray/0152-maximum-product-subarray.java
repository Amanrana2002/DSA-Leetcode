class Solution {
    public int maxProduct(int[] nums) {
        int maxi =Integer.MIN_VALUE;
        int ans = nums[0];
        int fin = nums[0];

        for(int i=0;i<nums.length;i++){
            int product=nums[i];
            
            for(int j = i+1;j<nums.length;j++){
                if(product==0) break;
                ans=Math.max(ans,product);
                product *= nums[j];
            }
            ans=Math.max(ans,product);
            maxi = Math.max(maxi,ans);
            fin = Math.max(maxi,product);
            
        }
        return fin;
    }
}