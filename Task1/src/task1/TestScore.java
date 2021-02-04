package task1;

public class TestScore {

	public static void main(String[] args) {
		int japanese = 40;
		int math = 30;
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
