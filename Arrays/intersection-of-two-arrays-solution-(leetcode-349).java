class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if (list.isEmpty() || list.get(list.size()-1) != nums1[i]){
                list.add(nums1[i]);}
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int nums3[] = new int[list.size()];
        for(int k=0; k<list.size();k++){
            nums3[k] = list.get(k);        }
            return nums3;
    }
}