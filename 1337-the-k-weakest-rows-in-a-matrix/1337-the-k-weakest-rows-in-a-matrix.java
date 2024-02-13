class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[] = new int[k];
        int arr[] = new int[mat.length];
        List<Integer> temp = new ArrayList<>(); 
        for(int i=0;i<mat.length;i++){
            int s =0;
            for(int j=0;j<mat[i].length;j++){
                s = s + mat[i][j];
            }
            arr[i] = s;
            temp.add(s);
        }
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            ans[i] = temp.indexOf(arr[i]);
            temp.set(ans[i],arr[mat.length-1]+1);
        }
        return ans;
    }
}