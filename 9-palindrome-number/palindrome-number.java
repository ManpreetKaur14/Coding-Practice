class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) 
        {
        return false;
        }

        long r = 0;
        long temp = x;

        while(temp != 0){
            int d = (int) temp % 10;
            r = r * 10 + d;
            temp /= 10;
        }
        return(r == x);
    
    }
}