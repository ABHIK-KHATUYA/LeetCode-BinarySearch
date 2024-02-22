class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    int l=1,h=arr.length-2;
    while(l<=h){
        int m = l+(h-l)/2;
        if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
            return m;
        }
        else if(arr[m]<arr[m+1]){
            l=m+1;
        }else if(arr[m]<arr[m-1]){
            h=m-1;
        }
    }
    return 0;
    }
    
}