package task4;

public class kuKuClass {

	public static void main(String[] args) {
	  int[] array = kuku(4);
	  for (int j = 0; j < 9; j++) {
		  System.out.println(array[j]);
	  }
	
	}
	public static int[] kuku(int input) {
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array = new int[9] ;
		for (int i = 0; i < 9; i++) {
		   array[i] = (n[i] * input);
		}
		return(array);
	}
}

