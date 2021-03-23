package ex19.test;

public class Program {

	public static void main(String[] args) {
		for(int i = 0; i<9; i++) {
			System.out.printf("%d ", i+1);
			if(i%3 == 2){
				System.out.println("");
			}
		}

	}
}