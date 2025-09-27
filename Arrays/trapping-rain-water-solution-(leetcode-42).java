class Solution {
    public int trap(int[] height) {
        int units = 0;
        int leftMax = 0, rightMax = 0;
        int i=0, j=height.length-1;
        while(i<j){

            if (height[i] < height[j]) {
                leftMax = Math.max(leftMax, height[i]);
                units += leftMax - height[i];
                i++;
            } else {
                rightMax = Math.max(rightMax, height[j]);
                units += rightMax - height[j];
                j--;
            }
        }
        return units;
    }
}

