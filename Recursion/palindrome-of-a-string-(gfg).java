class Solution {
     int i=0;
    boolean isPalindrome(String s) {
        // code here
        int n = s.length();
        if(i >= n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1))  return false;
        i++;
        return isPalindrome(s);
    }
}