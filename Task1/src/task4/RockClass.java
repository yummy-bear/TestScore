package task4;

import java.util.Random;
import java.util.Scanner;

public class RockClass {

		

	public static void main(String[] args) {
		int win = 0;
	    int loose = 0;
	          
	    while (win < 3 && loose < 3) {
	      
		  System.out.println("じゃんけんの手を入力して下さい。(グー=0, チョキ=1, パー=2): ");          
		  Scanner sc = new Scanner(System.in);
          int first = sc.nextInt();
          Random r = new Random();
          int com = r.nextInt(2);
          
          
          
          if ((first == 0 && com == 1)||(first == 1 && com == 2)||(first == 2 && com == 0)){
        	  win ++;
              System.out.println("勝ち");
          }else if ((first == 0 && com == 2)||(first == 1 && com == 0)||(first == 2 && com == 1)) {
        	  loose ++;
          	  System.out.println("負け");

          }else if (first == com) {
        	  System.out.println("あいこ");
          }
          
   
		}
	    if(win == 3) {
	    	System.out.println("あなたの勝ちです");
	    }else {
	    	System.out.println("あなたの負けです");
	    }
	}

}
