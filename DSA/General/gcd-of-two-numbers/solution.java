class Solution {
    public int GCD(int n1, int n2) {
        int max = 1;
        for(int i =2 ; i <=n1 && i <=n2 ; i++){
            if(n1%i == 0 && n2%i == 0) max = i;
        }
        return max;
    }
}