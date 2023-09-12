//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        // will iterate over the array and keep a variable max that stores max element until k=0
        ArrayList<Integer> ans= new ArrayList<Integer>();

        ArrayDeque<Integer> q= new ArrayDeque<>();
       // q.add(arr[0]);
        int window=0;
        
        for(int i=0,j=0; j<arr.length;j++){
            // To check if the last element inserted is smaller than current element, so that it will be removed.
            while(!q.isEmpty()&& q.peekLast()<arr[j]){
                    //System.out.println("deleted: "+ q.peekLast());
                    q.pollLast();
            }
            // To add cur element in the queue
            q.add(arr[j]);
            //System.out.println("inserted :"+q);
            window=(j-i)+1;
            // To check if window size==k, then add the first element of queue(greatest) into the answer List
            if(window==k){
                ans.add(q.peek());  // added answer to List
                if(arr[i]==q.peek()) // checked if the starting index of sliding window is at the greatest element or peek element of the queue.
                   q.pop();          // in that case we need to pop out that element from queue
                i++;  // move the sliding window
            }
            
        }
        return ans;
    
    }
}