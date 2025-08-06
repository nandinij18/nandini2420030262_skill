package skill3;
import java.util.Scanner;
public class sumAverage {
	public static void main(String[] args) {
        int[] numbers = {80, 60, 40, 20, 10}; 
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}