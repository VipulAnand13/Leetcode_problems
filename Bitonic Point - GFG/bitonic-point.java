//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
       int ans= findMaximum(arr, 0,n-1,n);
       return ans;
        
    }
    
    static int findMaximum(int[] arr, int i, int j, int n){
      
        while(i<j){
        int k=(i+j)/2;
        if(arr[k]>arr[k-1] && arr[k]>arr[k+1]) return arr[k];
        
        if(arr[k]>arr[k+1]) j=k;
        else i=k+1;
        
        }
        
        return arr[n-1];
    }
}