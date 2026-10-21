class Solution {
    public void pattern17(int n) {
        for(int i = 0 ; i < n ; i++){
            char a = 'A';
            for(int j = 1 ; j < n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print(a++);
            }
            for(int j = 0 ; j <= i ; j++){
                System.out.print(a--);
            }
            System.out.println();
        }
    }
}