class Solution {   
    public boolean palindromeCheck(String s) {
        for(int i  = 0, j = s.length()-1 ; i < j ; i++, j-- ){
            if(s.charAt(i) == (s.charAt(j)))
                continue;
            else
                return false;
        }
        return true;
        //String s2 = new StringBuilder(s).reverse().toString();
       // return s.equals(s2);
    }
}