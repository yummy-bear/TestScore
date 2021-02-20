package task4;

public class MinClass {

	public static void main(String[] args) {
		int [] array =  {3, 5, 6, 9 ,2, 6};
		
		System.out.println(result(array));
	}

	public static int result(int[] array) {
	    int intMin = array[0];

	    for (int i = 0; i < array.length; i++) {
	    	if(intMin > array[i]) {
	            intMin = array[i];
	        }
	    }
	    return(intMin);
	    
	}
}
