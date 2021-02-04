package task1;

public class BmiClass {

	public static void main(String[] args) {
		double height = 1.60;
		double weight = 50.9;
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("低体重");
		} else if (bmi < 24.9) {
			System.out.println("標準");
		} else {
			System.out.println("肥満");
		}

	}

}
