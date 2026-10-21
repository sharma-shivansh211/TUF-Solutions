class Solution {
    public void pattern8(int n) {
        for(int i = n ; i > 0 ; i--){
            for(int j = n - i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2 - 1 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}