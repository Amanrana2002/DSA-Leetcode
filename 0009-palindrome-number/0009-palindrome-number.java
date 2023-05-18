class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int n = 0;
        int s = 0;
        while(x>0){
            n=x%10;
            s =(s*10) + n;
            x=x/10;
        }
        if (y==s){
            return true;
        }
        else{
            return false;
        }
    }
}