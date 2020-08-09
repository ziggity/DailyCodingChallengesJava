	package katachallenge;
	import java.util.Scanner;
	import java.util.Arrays;
public class CheckIfSorted {
			    public static void main(String[] args) {
			    System.out.println(sortedCheck());
			    }
			    
			        private static boolean sortedCheck() {

						
			        	Scanner scanner = new Scanner(System.in);
				        int arrSize = scanner.nextInt();
				        int[] arr = new int[arrSize];

				        for (int i = 0; i < arrSize; i++) {
				            arr[i] = scanner.nextInt();
				        }
				        
				      int count = 0;
				        for(int i = 0; i<arr.length-1; i++) {
			        		 
			        		if(arr[i]<arr[i+1]) count++;
			        }
				        if (count == arrSize-1)return true;
				        else return false;
				        
			        	
				}

				}

					
			        
			    
			


