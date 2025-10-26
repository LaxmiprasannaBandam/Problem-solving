class Solution {
    public boolean isPalindrome(int n) {
        int a =n;
        int rev=0,rem;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n =n/10;
        }
        if(rev==a){
            return true;
        }
        else{
            return false;
        }

    }
}
