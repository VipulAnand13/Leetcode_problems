class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        Map<Integer,Integer> numList=  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int checkNumber=target-nums[i];
            if(numList.containsKey(checkNumber)){
                ans[0]= numList.get(checkNumber);
                ans[1]= i;
                return ans;
            }
            else{
                numList.put(nums[i], i);
            }
        }
         return ans;
    }
}