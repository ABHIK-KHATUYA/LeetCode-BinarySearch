class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=0;
       for(int i=0;i<arr.length-2;i++){
           if(arr[i]<arr[i+1]){
               ans = i+1;
           }else if(arr[i+1]>arr[i+2]){
                continue;
           }else{
               return 0;
           }
           
       }
            return ans;
    }
}