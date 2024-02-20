class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        int t = (int)ans;
        if((ans-t) ==0){
            return true;
        }
        else{
            return false;
        }
    }
}