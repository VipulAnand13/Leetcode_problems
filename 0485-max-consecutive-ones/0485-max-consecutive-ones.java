class Solution {
     public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int e:nums){
            if(e==0){
                max= Math.max(max,count);
                count=0;
            } 
            else
            count++;
        }
        return Math.max(max,count);
    }
}