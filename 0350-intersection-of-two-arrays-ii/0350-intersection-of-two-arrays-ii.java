class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> check = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(check.add(j)){
                         ans.add(nums1[i]);
                        break;
                    }
                   
                }
            }
        }
        int r[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            r[i] = ans.get(i);
        }
        return r;
    }
}