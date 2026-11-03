class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        ArrayList<Character> arr = new ArrayList<Character>(s.size());
        for(int j = s.size()-1 ; j >= 0; j--)
            arr.add(s.get(j));
        return arr;
    }
    
}