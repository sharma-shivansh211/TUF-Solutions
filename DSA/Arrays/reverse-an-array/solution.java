class Solution {
    public void reverse(int[] arr, int n) {
        int[] a = new int[n];
        for(int i = n-1, j = 0; i >= 0 ; i--){
            a[j++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }
}

