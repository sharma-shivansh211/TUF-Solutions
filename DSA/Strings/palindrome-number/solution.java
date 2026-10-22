class Solution {
    public boolean isPalindrome(int n) {
        if(n == 0) return true;
        int orig = n;
        int rev = 0;
        while(orig > 0){
            rev = rev*10 + orig%10;
            orig = orig/10;
        }
        if(rev == n) return true;
        return false;
    }
}