package task4;

public class SampleClass {

	public static void main(String[] args) {
//		System.out.print(bmi(1.80, 50.9));
		String bmi = bmi(1.80, 50.9);
	}
	
	public static String bmi(double height, double weight) {
			
	    double bmi = weight / (height * height);
		
	    String bmi1 ;
		if (bmi < 18.5) {
		   bmi1 = "低体重";
		} else if (bmi < 24.9) {
		   bmi1 = "標準";
		} else {
		   bmi1 = "肥満";
		}
		
		return(bmi1);
	
	}
}