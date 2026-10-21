class Solution {
    public void pattern19(int n) {
        for(int i = n ; i > 0 ; i--){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat((n-i)*2));
            System.out.println("*".repeat(i));
        }
        for(int i = 1 ; i <= n ; i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat((n-i)*2));
            System.out.println("*".repeat(i));
        }
    }
}