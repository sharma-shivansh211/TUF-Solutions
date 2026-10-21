class Solution {
    public void pattern10(int n) {
        for(int i = 1 ; i <= n ; i++){
            System.out.println("*".repeat(i));
        }
        for(int i = n-1 ; i > 0 ; i--){
            System.out.println("*".repeat(i));
        }
    }
}