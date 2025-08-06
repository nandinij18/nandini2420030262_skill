package skill2;

public class Operators {
	public static void main(String[] args) {
        int x = 13, y = 5;
        System.out.println("Addition: " + (x + y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("x > y: " + (x > y));
        System.out.println("(x > y) && (x != y): " + ((x > y) && (x != y)));
        x += 3;
        System.out.println("x after += 3: " + x);
    }
}
