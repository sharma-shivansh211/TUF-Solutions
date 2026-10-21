class Solution {
    public void pattern20(int n) {
        
        for(int i = 1 ; i <= n ; i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat((n-i)*2));
            System.out.println("*".repeat(i));
        }
        for(int i = n-1 ; i > 0 ; i--){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat((n-i)*2));
            System.out.println("*".repeat(i));
        }
    }
}