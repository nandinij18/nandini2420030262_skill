package skil4;
	public class Finalkeyworddemo {
		final int AGE;
		final StringBuilder data= new StringBuilder("ram");
		Finalkeyworddemo(int age)
		{
		  AGE=age;
		}
		final void display()
		{
		  System.out.println("Age:"+AGE);
		  System.out.println("String builder method name:" +data);
		}
		  public static void main(String[] args) {
		    Finalkeyworddemo f=new Finalkeyworddemo(30);
		    f.data.append("raju");
		    f.display();
		  }

		}