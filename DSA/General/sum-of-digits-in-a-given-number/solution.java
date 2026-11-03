class Solution {
    public int Digits(int num) {
        if(num <= 0) return 0;
        return (num%10)+ Digits(num/10);
    }
    public int addDigits(int num){
        int a = Digits(num);
        if(a < 10) return a;
        return addDigits(Digits(num));
    }
}