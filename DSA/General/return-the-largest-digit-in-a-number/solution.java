class Solution {
    public int largestDigit(int n) {
        if(n == 0) return 0;
        int lar = 0;
        while(n > 0){
            if(n%10 > lar) lar = n%10;
            n = n/10;
        }
        return lar;
    }
}