class Solution {
    public int findMaxLength(int[] nums) {
        int n= nums.length;
        int[] prefixSum= new int[n+1];
        prefixSum[0]=0;
        
        for(int i=1; i<=n; i++){
            prefixSum[i]= nums[i-1]==0? prefixSum[i-1]-1:prefixSum[i-1]+1;
            }
        
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        int ans=0;
        
        for(int i=0;i<=n;i++){
            if(map.containsKey(prefixSum[i]))
                ans= Math.max(ans,i-map.get(prefixSum[i]));
            else
                map.put(prefixSum[i],i);
        }
        return ans;
    }
}