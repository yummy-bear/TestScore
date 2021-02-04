package task1;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		
		System.out.println("国語の点数を入力: ");
        Scanner sc1 = new Scanner(System.in);
        int japanese = sc1.nextInt();
        System.out.println("数学の点数を入力: ");
        Scanner sc2 = new Scanner(System.in);
        int math = sc2.nextInt();
        
		int sum = japanese + math;
		
		if (japanese < 40 || math < 40 || sum <100) {
			System.out.println("追試");
		} else if (sum >= 160) {
			System.out.println("優");
		} else if (sum >= 140) {
			System.out.println("良");
		} else if (sum >= 100) {
			System.out.println("可");
		}	

	}

}
