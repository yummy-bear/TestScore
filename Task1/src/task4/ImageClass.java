package task4;

public class ImageClass {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" □ ");
                                   
            }
            for(int k = 1; k < (i+1)*2-2; k++) {
            	System.out.print(" ■ ");
            }
            
            for(int j = 5; j <= 9-i; j++){
                System.out.print(" □ ");                                   
            }
          System.out.println("");
        }
		
		for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(" □ ");
                                   
            }
            for(int k = 1; k < (5-i)*2; k++) {
            	System.out.print(" ■ ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" □ ");                                   
            }
          System.out.println("");
        }
		
	}

}
