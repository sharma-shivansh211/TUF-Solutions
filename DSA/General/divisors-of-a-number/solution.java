class Solution {
    public int[] divisors(int n) {
        if(n == 1) return new int[]{1};
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i = 2; i <= n/2 ;i++){
            if(n % i == 0) arr.add(i); 
        }
        arr.add(n);
        int[] array = new int[arr.size()];
        for(int i  = 0 ; i < arr.size() ; i++)  array[i] = arr.get(i);
        return array;
    }
}