package javapractice;

import java.util.ArrayList;

public class forloopprac {

	public static void main(String [] args) {
		String [] laptop = {"Dell", "Hp", "Mac", "Lenovo"} ;
		for(int i = 0 ; i<laptop.length; i++) {
			System.out.println(laptop[i]);
		}
		for(int i = laptop.length-1; i >=0 ; i--) {
			System.out.println(laptop[i]);
		}
		ArrayList<String>car=new ArrayList<String>();
		car.add("BMW");
		car.add("VW");
		car.add("Tesla");
		
		System.out.println();
		
	}
}
