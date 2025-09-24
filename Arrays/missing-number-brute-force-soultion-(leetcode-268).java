class Solution {
    public int missingNumber(int[] nums) {
        int key = 0;
        int i=0;
        while(true){
            if(i<nums.length&&key == nums[i]){
                key++;
                i=0;
            }
            else if(i<nums.length){
                i++;
            }
            else{
                break;
            }
        }
        return key;
    }
}