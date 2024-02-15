class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        //     for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i){
        //             return i;
        //         }
        //     }     
        // return nums.length;    
        int n = nums.length; 
        int esum = n*(n+1)/2;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return esum-sum;
    }
}