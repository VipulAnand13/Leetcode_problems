class Solution {
    public boolean isPalindrome(int x) {
        boolean ans= false;
        int temp=0;
        int y=x;
        while(y>0){
            temp= temp*10 + y%10;
            y=y/10;
        }
        System.out.println(temp);
        if(temp==x) ans= true;
        
        return ans;
    }
}