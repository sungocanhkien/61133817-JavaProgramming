package TH_lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		
		System.out.println("Nhập hệ số c: ");
		double c = sc.nextDouble();
		
		if(a==0) {
			if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất x = " + x);
            }
		}else {
			double delTa = Math.pow(b, 2) - 4*a*c;
			if(a < 0)
			{
				System.out.println("Phương trình vô nghiệm.");
			}else if(delTa == 0) {
				double x = -b/(2*a);
				System.out.println("Phương trình có nghiệm kép: "+ x);
			}else {
				double x1 = (-b+Math.sqrt(delTa))/(2*a);
				double x2 = (-b+Math.sqrt(delTa))/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt: ");
				System.out.println("Nghiệm 1: "+ x1);
				System.out.println("Nghiệm 2: "+ x2);
			}
		}
	}
}
