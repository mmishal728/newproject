package javapractice;

public class lecoops {
	
	public 	void preriod() {
		System.out.println("This is protected method");
		
	}
	
	
	

int	a = 20;
int 	b =33;
	
double num ;
	public static void main(String[] args) {
		
		lecoops obj = new lecoops();
		double  add = obj.a +obj.b;
		
		obj.num =23.55;
		System.out.println("This is basic oops " + add);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.num);
		
		
	}
}
