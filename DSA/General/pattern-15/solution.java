class Solution {
    public void pattern15(int n) {
        for(int i = 0 ; i < n ; i++){
            char a = 'A';
            for(int j = 0 ; j < n-i ; j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}