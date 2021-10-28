package javapractice;

class mth {
	
 public void method (String email ,String name ) {
	 String Email = email ;
	 String Name =name;
	 System.out.println("This is email and name" + Email + Name);
 }
 
 public void method() {
	 System.out.println("This is password");
 }
	
}


public class oopsmethod extends mth{

	 public static void main (String[] args) {
		 
		 mth obj = new mth();
		 obj.method();
		 obj.method( " TwohidMishal@gmail.com ", "Mishal ");
		 
		 
	 }
}
