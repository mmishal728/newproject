package javapractice;

public class childinterface implements  interfacepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childinterface obj = new childinterface();
		obj.method(23, 044);
	}

	public void method(int b, int c) {
		// TODO Auto-generated method stub
		int add = c +b;
		System.out.println(add);
	}

}
