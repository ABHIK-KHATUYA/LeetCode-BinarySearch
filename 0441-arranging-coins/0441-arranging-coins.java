class Solution {
    public int arrangeCoins(int n) {
        int l=1,h=n,m=0;
        long r=0;
        while(l<=h){
            m = l+(h-l)/2;
            r = (long)m*(m+1)/2;
            if(r==n){
                return m;
            }
            else if(r>n){
                h=m-1;
            }
            else if(r<n){
                l = m+1;
            }
        }
        if(r>n){
            return m-1;
        }else{
            return m;
        }
        
    }
}