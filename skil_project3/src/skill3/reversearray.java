package skill3;
public class reversearray {
	 public static void main(String[] args) {
	        int[] arr = {0, 7, 3, 4, 9};
	        int n = arr.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[n - 1 - i];
	            arr[n - 1 - i] = temp;
	        }
	        System.out.println("Reversed array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}
