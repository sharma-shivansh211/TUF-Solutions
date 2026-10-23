class Solution {
    public int primeUptoN(int n) {
        if(n <= 0 || n == 1) return 0;
        int s = 0;
        for(int i = 2 ; i <= n ; i++){
            if( isPrime(i) == true) s++;
        }
        return s;
    }
    public boolean isPrime(int n) {
        if(n <= 0 || n == 1) return false;
        int sum = 0;
        for(int i = 2 ; i <= n/2 ; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}