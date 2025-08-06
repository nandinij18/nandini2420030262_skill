package skill3;
import java.util.Scanner;
public class maxMinarray {
	public static void main(String[] args) {
        int[] numbers = {5, 10, 45, 8, 0, 30}; // Sample array
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Biggest number: " + max);
    }
}