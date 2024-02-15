class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[n-1] == n-1){
            return n;
        }
        else{
            for(int i=0;i<n;i++){
            if(nums[i]!=i){
                    return i;
                }
            }
        }
        return 0;
    }
}