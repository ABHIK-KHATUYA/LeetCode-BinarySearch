class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1] == nums.length-1){
            return (nums.length);
        }
        else{
            for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                    return i;
                }
            }
        }
        return 0;
    }
}