class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c=1,i=0,j=0;
        while(i<arr.length){
            j++;
            if(c==k && arr[i]!=j){
                return j;
            }
            else if(arr[i]!=j){
                c++;
            }
            else{
                i++;
            }
        }
        return j+(k-c+1);
    }
}