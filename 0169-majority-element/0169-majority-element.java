class Solution {
       public int majorityElement(int[] nums) {
        //Moore's Algorithm
        int curElement=-1;
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(count==0){
                curElement=nums[i];
                count=1;
            }
            else{
                if(nums[i]== curElement) count++;
                else count--;
            }
        }
        
        return curElement;
    }
}