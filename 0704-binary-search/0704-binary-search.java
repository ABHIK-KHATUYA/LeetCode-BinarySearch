class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1,m=0;
        while(l<=h){
            m = (h+l)/2;
            if(nums[m]==target){
                
                break;
            }
            else if(nums[m]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(nums[m]!=target){
            return -1;
        }else{
            return m;
        }
        
    }
}