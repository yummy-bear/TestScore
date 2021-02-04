package task1;

import java.util.Scanner;    

public class NumberClass {

	public static void main(String[] args) {
		System.out.println("数字を入力");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

	}

}
