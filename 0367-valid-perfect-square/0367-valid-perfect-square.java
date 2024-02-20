class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        
        if(ans-(int)ans ==0){
            return true;
        }
        else{
            return false;
        }
    }
}