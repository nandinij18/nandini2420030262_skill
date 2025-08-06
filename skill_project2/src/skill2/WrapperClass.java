package skill2;

public class WrapperClass {
	public static void main(String[] args) {
	 int a = 10;              
     Integer obj = Integer.valueOf(a); 
     int b = obj.intValue();         
     System.out.println("Primitive: " + a);
     System.out.println("Boxed (Integer): " + obj);
     System.out.println("Unboxed (int): " + b);
 }
}

