class Solution {
    int i = 0;
    int temp = 0;
    public void reverseArray(int arr[]) {
        // code here
        if(i>=arr.length/2) return;
        temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        i++;
        reverseArray(arr);
    }
}