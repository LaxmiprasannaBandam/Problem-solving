class Solution {
    public boolean isArmstrong(int n) {
        int a=0;
        int org = n;
        int rem;
        while(n>0){
            rem = n%10;
            a += rem*rem*rem;
            n = n/10;

        }
        if(org==a){
            return true;
        }
        else{
            false;
        }


    }
}
