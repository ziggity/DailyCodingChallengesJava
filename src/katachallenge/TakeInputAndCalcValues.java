package katachallenge;
import java.util.Scanner;
public class TakeInputAndCalcValues {
public static void main(String[] args) {
		System.out.println(getNumers());

       // System.out.println(Arrays.toString(array));
       // int[] arr = {5, 8, 11, 2, 10};
    }

private static int getNumers() {
    Scanner scanner = new Scanner(System.in);
	int arraySize = scanner.nextInt(); // size of the array
	int[] array = new int[arraySize]; // elements of the array
	int n = scanner. // number n
	int sum = 0; 
	System.out.println("as " + arraySize);
	System.out.println("array " + array);
	System.out.println("n " + n);

for (int i = 0; i < arraySize; i++) {
    array[i] = scanner.nextInt();
    for (int in : array) {
        if (in > n) {
            sum = sum + in;
            System.out.println("for loop " + in);
            break;
        } else { System.out.println("hi break final"); break;}
    }

	System.out.println(sum);
}
return sum;

}
}
