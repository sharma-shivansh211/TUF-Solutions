class Solution {
    public int reverseNumber(int n) {
        if(n == 0) return 0;
        int s = n %10;
        n = n/10;
        while(n % 5000 != 0){
            s = 10*s + (n%10);
            n = n/10;
        }
        return s;
    }
}