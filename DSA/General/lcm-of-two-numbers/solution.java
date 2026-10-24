class Solution {
    public int LCM(int n1, int n2) {
        int lc = 1;
        int i = 2;
        while(true){
            if(n1 == 1 || n2 == 1){
                lc *= n1*n2;
                break;
            } 
            if(n1%i == 0 && n2 %i == 0){
                lc *= i;
                n1 /= i;
                n2 /= i;
            }else if(n1%i == 0){
                lc *= i;
                n1 /= i;
            }else if(n2%i == 0){
                lc *= i;
                n2 /= i;
            }else{
                i++;
            }
        }
        return lc;
    }
}