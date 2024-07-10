class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int d,revnum=0;
        if(n<0){
            return false;
        }
        while(n>0){
            d=n%10;
            revnum=revnum*10+d;
            n=n/10;
        }
        if(revnum==x){
            return true;
        }else
        {
            return false;
        }
    }
}