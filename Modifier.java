package javapractice;

public class Modifier {

	public static void method() {
		System.out.println("This method overloding");
	}
	public static  void method(double a , int b) {
		double add = a+b;
		System.out.println(add);
	
	}
	
	
	public static void main (String [] args) {
		
		
		Modifier.method();
		Modifier.method(45, 450);
		
	
		
		
	}
	
}
