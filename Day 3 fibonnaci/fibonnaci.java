class Solution {
    public int fib(int n) {
     if(n==0){
        return 0;
     }else if(n==1)
    {return 1;
    }
    int fterm=0,sterm=1 ,sum=0;
    for(int i=1;i<=n;i++){
     sum=fterm+sterm;
     fterm=sterm;
     sterm=sum;
    }
    return fterm;
    
}
}