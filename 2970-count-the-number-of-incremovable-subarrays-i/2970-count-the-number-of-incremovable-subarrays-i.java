class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        Set<ArrayList> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        int c = 0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length+1;j++){
                ArrayList<Integer> t = new ArrayList<>(l);
               t.subList(i,j).clear();
               int f=0;
               if(t.size()<=1){
                   c++;
                   System.out.println(t);
               }
               else{
                   for(int k=0;k<t.size()-1;k++){
                   if(t.get(k)>=t.get(k+1)){
                       f=1;
                       break;
                   }
                }
                if(f==0){
                    c++;
                    System.out.println("--> "+t);
                }
               }
            }
        }
    return c;
    }
}