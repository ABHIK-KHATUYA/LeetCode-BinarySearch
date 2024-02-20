class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        
        if(Math.sqrt(num)-(int)ans ==0){
            return true;
        }
        else{
            return false;
        }
    }
}