class Solution {
    public int countOddDigit(int n) {
        if(n == 0) return 0;
        int s = 0;
        while(n % 5000 != 0){
            if(n%2 != 0) s++;
            n = n/10;
        }
        return s;
    }
}