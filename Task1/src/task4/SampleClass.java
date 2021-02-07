package task4;

public class SampleClass {

	public static void main(String[] args) {
		bmi(1.80, 50.9);
	}
	public static void bmi(double height, double weight) {
			
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