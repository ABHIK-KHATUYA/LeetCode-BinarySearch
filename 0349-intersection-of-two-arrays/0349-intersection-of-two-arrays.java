class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> t = new HashSet<>();
        Set<Integer> t1 = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(t.add(nums1[i])){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        l.add(nums1[i]);
                        break;
                    }
            }
            }
            
        }
        int ans[] = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}