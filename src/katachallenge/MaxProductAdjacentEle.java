package katachallenge;
import java.util.Scanner;
import java.util.Arrays;

public class MaxProductAdjacentEle {
		
		    public static void main(String[] args) {
		    System.out.println(maxProduct());
		    }
		    
		        public static int maxProduct() {
		        	
		        	Scanner scanner = new Scanner(System.in);
			        int arrSize = scanner.nextInt();
			        int[] arr = new int[arrSize];

			        for (int i = 0; i < arrSize; i++) {
			            arr[i] = scanner.nextInt();
			        }
			        int maxSeen = 0;
			        int product = 0;
			        for(int i = 0; i<arr.length-1; i++) {
		        		 product = arr[i]*arr[i+1];
		        		if(product > maxSeen) maxSeen = product;
		        }
			        return maxSeen;
			}

				
		        
		    }
		

