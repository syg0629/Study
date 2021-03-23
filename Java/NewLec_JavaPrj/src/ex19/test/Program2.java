package ex19.test;

public class Program2 {

	public static void main(String[] args) {
		for (int j = 0; j<3; j++) {
			for(int i = 0; i<3; i++) {
				System.out.printf("%d ", 3*j+i+1);
			}
			System.out.println();
		}
	}
}