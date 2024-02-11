package TH_lab3;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số lượng sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] name = new String[n];
		double[] score = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Nhập họ tên sinh viên " + (i+1) + ": ");
			name[i] = sc.nextLine();
			System.out.println("Nhập điểm của sinh viên " + (i+1) + ": ");
			score[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Thông tin sinh viên và học lực: ");
		for(int i = 0; i< n; i++)
		{
			String grade;
			if(score[i] < 5)
			{
				grade = "Yếu";
			}else if(score[i]< 6.5)
			{
				grade = "Trung bình";
			}else if(score[i]< 7.5)
			{
				grade = "Khá";
			}else if(score[i] < 9)
			{
				grade = "Giỏi";
			}else
			{
				grade = "Xuất sắc";
			}
			System.out.println("Họ tên: "+ name[i]);
			System.out.println("Điểm: "+ score[i]);
			System.out.println("Học lực: "+ grade);
		}
		for(int i = 0; i< n - 1; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				if(score[j] > score[j+1])
				{
					double tam = score[j];
					score[j] = score[j+1];
					score[j+1] = tam;
					
					String tamName = name[j];
					name[j] = name[j+1];
					name[j+1] = tamName;
				}
			}
		}
		System.out.println("Danh sách sinh viên sau khi sắp xếp tăng dần: ");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i]+ ": " + score[i]);
			
		}
	}
}
