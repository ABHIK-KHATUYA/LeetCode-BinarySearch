class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int l= 0,h = grid[i].length-1;
            
            while(l<=h && grid[i][h]<0){
                int m = (l+h)/2;
               
                 if(grid[i][m] >= 0 ){
                    l = m+1;
                }
                else if(grid[i][m] <0){
                   
                     count = count + h+1 -m;
                      h=m-1;
                }
            }
        }
        return count;
    }
}