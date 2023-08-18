//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] nums, int N)
    {
        int n=N;
        int[] prefixSum= new int[n];
        prefixSum[0]= nums[0]==0 ? -1 : 1; 
        for(int i=1; i<n; i++){
            prefixSum[i]= nums[i]==0? prefixSum[i-1]-1:prefixSum[i-1]+1;
            }
        
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        int ans=0;
        
        for(int i=0;i<n;i++){
            if(map.containsKey(prefixSum[i]))
                ans= Math.max(ans,i-map.get(prefixSum[i]));
            else if(prefixSum[i]==0)     // if map contains 0 then subarray from 0 index
                ans=Math.max(ans,i-0+1);
            else
                map.put(prefixSum[i],i);
        }
        return ans;
        
    }
}
