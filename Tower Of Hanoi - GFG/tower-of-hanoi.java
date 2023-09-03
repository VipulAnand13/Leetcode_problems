//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N==0) return 0;
        if(N==1) {
            System.out.println("move disk 1 from rod 1 to rod 3");
            return 1;
        }
        long count=0;
        long ans= toh( N, from, to, aux,count);
        return ans;
        
    }
    long count=0;
    public long toh(int N, int from, int to, int aux, long count){
        if(N==0) return 0;
        count=toh( N-1, from, aux, to, count++);
        System.out.println("move disk "+N+" from rod "+from+ " to rod "+ to);
        count++;
        count=count+toh( N-1, aux, to, from, count++);
        
        return count;
    }
}
