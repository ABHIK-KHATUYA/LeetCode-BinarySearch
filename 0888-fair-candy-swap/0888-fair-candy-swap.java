class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[] = new int[2];
        int a=0,b=0;
        for(int i:aliceSizes){
            a=a+i;
        }
        for(int i:bobSizes){
            b=b+i;
        }
        int m = (a-b)/2;
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if((m > 0 && aliceSizes[i]-bobSizes[j] == m) || (m<0 && bobSizes[j]-aliceSizes[i] == Math.abs(m))){
                    ans[0]=aliceSizes[i];
                    ans[1]=bobSizes[j];
                   return ans;
                } 
              
            }
        }
        return ans;
    }
}