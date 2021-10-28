package javapractice;

import java.util.ArrayList;
import java.util.HashMap;

public class javalecpac1 {

	public static void main(String [] args) {
		
		double a = 23;
		int b =39;
		
		double addition =  a + b;
		System.out.println(" The toltal" + " " +addition);
		
		double c = 44.5 ;
		int d = 55 ;
		double  sub = c-d;
		System.out.println("The sub is "  +  sub );
		
		double e =55 ;
		double f = 33 ;
		double multification = e * f  ;
		System.out.println("The multification is "  +  multification );
		
		double g = 550 ;
		double h =44;
		
		double devition = g/h;
		System.out.println("The divition is  " + devition);
		
//	The 	Remender
		double num1 = 550; 
		double num2 = 44;
		
		double remainder = num1 % num2;
		System.out.println("The remainder is  " +  remainder );
		
//		increment 
		
		int num = 1;
				num++;
				System.out.println(num);
				
				int num3 = 4  ;
		    	num3+=3;
						
				System.out.println(num3);
				
//				Array
				String [] friuts = {"Apple", "banana", "Orange" };
				for (int i =0 ; i <friuts.length ;i ++){
					System.out.println(friuts[i]);
				}
				System.out.println( friuts[0]);
				
				String[] fruits = {"apple", "orange", "banana", "mango"};
				System.out.println(fruits[0]);
				
				int [] number10 = {10, 34,5,634,56,};
				number10[2] = 23;
				System.out.println(number10[2]);
				
				String[] name = {"Mohammed", "Twohidul", "alam"};
				name[1]="Tohid";
				for (int i =0; i< name.length ; i++){
					System.out.println(name[i]);
				}
				
				ArrayList <String>car = new ArrayList <String>();
				
				car.add("Toyota");
				car.add("BMW");
				car.add("Fort");
				car.add("Honda");
				car.add("Volks Wagan");
				
				
				System.out.println(car);
				ArrayList<String>Name =new ArrayList<String>();
				
				Name.add("Mohammed");
				Name.add("Shakid");
				Name.add("Mahamudullah");
				Name.add("Musi");
				
				Name.set(2,"Afif");
				Name.remove(3);
	
				System.out.println(Name.size()); 
				
				
//				number evenvalue 
				
				ArrayList <Integer> EvenValue = new ArrayList<Integer>();
				for(int i = 0; i<= 10;  i+=2) {
					EvenValue.add(i);
					
				}
				System.out.println(EvenValue);
				
				EvenValue.get(4);
				System.out.println(EvenValue.get(2));
				
//				HashMap
				HashMap <String , String > info = new HashMap<String , String>();
				
				info.put("Mohammed", "Connecticut");
				info.put("Alam", "Florida");
				info.put("Bangladesh", "Chittagong");
				info.put("Dhaka", "Bangladesh");
				System.out.println(info);
				
				
				HashMap<Integer, String>StudentId = new HashMap<Integer , String>();
				
				StudentId.put(1, "M");
				StudentId.put(2, "B");
				StudentId.put(3, "Cl");
				StudentId.put(5, "d");
				StudentId.put(6, "e");
				StudentId.put(7, "F");
				System.out.println(StudentId);
				
				
				HashMap<Integer , String>ID = new HashMap<Integer , String>();
			   ID.put(1, "Ruposi");
			   ID.put(2, "Karim");
			   ID.put(3, "Rohim");
			   ID.put(4, "Jashim");
			   ID.put(5, "Bill");
			   System.out.println(ID);
			   
			  
			   System.out.println( ID.get(5));
			   
				ID.remove(0);
		
				System.out.println(ID.size());
				
				
				
	}
	
}
