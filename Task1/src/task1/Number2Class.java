package task1;

import java.util.Scanner;    

public class Number2Class {

	public static void main(String[] args) {
		System.out.println("数字を入力");
		Scanner sc3 = new Scanner(System.in);
		int number = sc3.nextInt(); 
		
		if (number % 2 == 0 && number >= 0 ) {
			System.out.println("正の偶数");
		} else if (number % 2 == 0 && number < 0 ) {
			System.out.println("負の偶数");
		} else if (number % 2 != 0 && number >= 0 ) {
			System.out.println("正の奇数");
		} else {
			System.out.println("負の奇数");
		}

	}
}