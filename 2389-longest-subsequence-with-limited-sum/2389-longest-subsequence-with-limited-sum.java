class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(nums);
        for(int i = 0;i<queries.length;i++){
            int c =0;
            for(int j=0;j<nums.length;j++){
                c=c+nums[j];
                if(c>queries[i]){
                    ans[i] = j;
                    break;
                }
                else if(c==queries[i]){
                    ans[i] = j+1;
                    break;
                }
                else if(c<queries[i] && j==nums.length-1){
                    ans[i]=j+1;
                }
                else{
                    ans[i]=0;
                }
            }
        }
        return ans;
    }
}