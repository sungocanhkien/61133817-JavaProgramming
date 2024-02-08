package GiaiPTBacII;

import java.util.Scanner;

public class PTBacII {
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào a = ");
		a = sc.nextDouble();
		System.out.println("Nhập vào b = ");
		b = sc.nextDouble();
		System.out.println("Nhập vào c = ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		if(delta < 0) 
		{
			// Tình huống delta < 0
			System.out.println("Phương trình vô nghiệm.");
		
			
		}else if(delta == 0){
			// Tình huống delta == 0
			x1 = -b/(2*a);
			System.out.println("Phương trình có nghiệm kép x1=x2="+x1);
			
		}else {
			// Tình huống delta > 0
			x1 = (-b - Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Phương trình có 2 nghiệm: ");
			System.out.println("x1 = "+ x1);
			System.out.println("x2 = "+ x2);
		}
	}
}	
