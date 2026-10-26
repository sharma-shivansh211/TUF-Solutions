class Solution {   
    public boolean palindromeCheck(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }
}