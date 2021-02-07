package task1;

public class TaskClass {

	public static void main(String[] args) {
		kuku(4);
	}
	public static void kuku(int input) {
		int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < 9; i++) {
			System.out.println(n[i] * input);
		}
	}
}
