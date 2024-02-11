package TH_lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số lượng phần tử của mảng: ");
		int n = sc.nextInt();
		int[] mang = new int[n];
		System.out.println("Nhập các phần tử của mảng: ");
		for(int i = 0; i<n; i++)
		{
			mang[i] = sc.nextInt();
		}
		
		Arrays.sort(mang);
		System.out.println("Mảng sau khi sắp xếp: ");
		for(int num: mang)
		{
			System.out.println(num + " ");
		}
		System.out.println();
		
		int min = mang[0];
		for(int i = 1; i < n; i++)
		{
			min = Math.min(min, mang[i]);
		}
		System.out.println("Phần tử nhỏ nhất trong mảng là: "+ min);
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i< n; i++)
		{
			if(mang[i]%3 == 0)
			{
				sum += mang[i];
				count++;
			}
		}
		if(count > 0)
		{
			double average = (double) sum/count;
			System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
		}else
		{
			System.out.println("Không có phần tử nào chia hết cho 3 trong mảng.");
		}
	}
}
