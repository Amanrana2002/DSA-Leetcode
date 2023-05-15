class Solution {
    public int reverse(int x) {
        int n = 0;
        long count=0;
        while(x != 0){
            n=x%10;
            x=x/10;
            count=count*10+n;
        }
        if(count > Integer.MAX_VALUE || count < Integer.MIN_VALUE) return 0;
        return (int)count;
    }
}
