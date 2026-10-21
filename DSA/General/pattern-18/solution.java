class Solution {
    public void pattern18(int n) {
        for(int i = n ; i > 0 ; i--){
            char a = 'A';
            a += i-1;
            for(int j = 0 ; j <= n-i ; j++){
                System.out.printf("%c ",a++);
            }
            System.out.println();
        }
    }
}