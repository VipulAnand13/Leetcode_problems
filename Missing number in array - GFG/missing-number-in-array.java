//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Sum of N natural numbers is N*(N+1)/2.
        // If we take the sum of elements in array and subtract it 
        //from Sum of n natural nos, we get answer
        int sumOfNnaturalNum= n*(n+1)/2;
        int sumOfArray=0;
        for(int e: array){
            sumOfArray += e;
        }
        
        return sumOfNnaturalNum-sumOfArray;
    }
}