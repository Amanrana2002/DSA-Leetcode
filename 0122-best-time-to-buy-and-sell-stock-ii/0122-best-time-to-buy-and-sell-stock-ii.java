class Solution {
    public int maxProfit(int[] prices) {
          int l= 0;
          int r =1;
          int k=0;
        int p=0;
        int max =0;
      while(r<prices.length){
      if(prices[l]<prices[r] && prices[k]<prices[r]){
       max = Math.max(max,(prices[r]- prices[l]));
       r++;
       k++;
     }
      else{ 
      
         l=r;
          p+=max;
          max =0;
          r++;
          k++;
      }
      
      }
   p+= max;
    return p; }
}