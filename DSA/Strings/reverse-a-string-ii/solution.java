class Solution {
    public void reverseString(List<Character> s) {
        for(int i = 0 , j = s.size()-1 ; i < j ; i++,j--){
            char a = s.get(i);
            s.set(i,s.get(j));
            s.set(j,a);
        }
    }
}