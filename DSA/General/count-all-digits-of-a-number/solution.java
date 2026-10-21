class Solution {
    public int countDigit(int n) {
        int s = 1;
        n = n/10;
        while(n % 5000 != 0){
            s++;
            n = n/10;
        }
        return s;
    }
}