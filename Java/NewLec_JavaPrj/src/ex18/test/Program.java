package ex18.test;

public class Program {

	public static void main(String[] args) {

		for(int i = 0; i<5; i++) {
			if(i == 4) {
				System.out.printf("%c", 'A'+i);
			}else if((i+1)%2 == 0) {
				System.out.printf("%c, ", ' ');
			}else {
				System.out.printf("%c, ", 'A'+i);
			}
		}
	}

}
