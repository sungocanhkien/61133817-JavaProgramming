package TH_lab3;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào N: ");
		int N = sc.nextInt();
		
		boolean ok = true;
		for (int i = 2; i < N; i++) {
			if(N%i==0)
			{
				ok = false;
				break;
			}
		}
		if(ok && N>1)
		{
			System.out.println(N + "là số nguyên tố.");
		}else{
			System.out.println(N + "không phải là số nguyên tố.");
		}
	}
}
