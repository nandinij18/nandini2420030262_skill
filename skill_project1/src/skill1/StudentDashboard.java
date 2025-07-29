package skill1;
public class StudentDashboard {
	    public static void main(String[] args) {
	        long rollNumber = 2025123456L;
	        String name = "Nandini Jarugula";
	        float marks = 95.3f;
	        char gender = 'F';
	        boolean isPass = true;
	        System.out.println("---Student Summary Slip---");
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Name        : " + name);
	        System.out.println("Marks       : " + marks);
	        System.out.println("Gender      : " + gender);
	        System.out.println("Status      : " + (isPass ? "Pass" : "Fail"));
	        System.out.println("---------------------------------------");
	    }
}
