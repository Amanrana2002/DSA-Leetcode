class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] help = new int[nums2.length];
        int[] ans = new int[nums1.length];
        for(int i=nums2.length - 1; i>=0 ; i-- ){
            while(st.size()>0 && nums2[i]>st.peek()){
                st.pop();
            }
            if(st.size()<=0){
                help[i]=-1;
            }else{
                help[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=help[j];
                }
            }
        }
        return ans;
    }
}