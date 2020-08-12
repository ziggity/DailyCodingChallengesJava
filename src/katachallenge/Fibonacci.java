package katachallenge;
import java.util.*; 
public class Fibonacci {
	      
	    static int MAX = 1000; 
	    static int f[]; 
	      static int count = 0;
	    // Returns n'th fibonacci number using  
	    // table f[] 
	    public static int fib(int n) 
	    { 
	        // Base cases 
	        if (n == 0) 
	            return 0; 
	              
	        if (n == 1 || n == 2) 
	            return (f[n] = 1); 
	       
	        // If fib(n) is already computed 
	        if (f[n] != 0) 
	            return f[n]; 
	       
	        int k = (n & 1) == 1? (n + 1) / 2 
	                            : n / 2; 
	       
	        // Applying above formula [Note value 
	        // n&1 is 1 if n is odd, else 0. 
	        f[n] = (n & 1) == 1? (fib(k) * fib(k) +  
	                        fib(k - 1) * fib(k - 1)) 
	                       : (2 * fib(k - 1) + fib(k))  
	                       * fib(k); 
	       
	        return f[n]; 
	    } 
	      
	    /* Driver program to test above function */
	    public static void main(String[] args)  
	    { 
	        int n = 90; 
	        f= new int[MAX]; 
	        System.out.println(fib(n)); 
	    } 
	} 
