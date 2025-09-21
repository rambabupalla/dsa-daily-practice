class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int add = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
            nums[add] = nums[i];
            add++;}
        }
        return add;
    }
}