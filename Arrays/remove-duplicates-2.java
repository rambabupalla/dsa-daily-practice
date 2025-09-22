class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int add = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[add-2]){
                nums[add] = nums[i];
                add++;
            }
        }
        return add;
    }
}