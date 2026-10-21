class Solution {
    public void pattern16(int n) {
        char a = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
    }
}