package ex20.omok;

public class Program {

	public static void main(String[] args) {
		System.out.printf("%s", "┌┬┬┬┬┬┬┬┬┐");
		System.out.println();
		for (int j = 0; j < 10; j++) {
			for(int i = 0; i<10; i++) {
				if(i == 0 || i == 9) {
					System.out.printf("%c", '│');
				}else if(i == 4 && j == 3) {
					System.out.printf("%c", '●');
				}else {
					System.out.printf("%c", '+');
				}
			}System.out.println();
		}
		System.out.printf("%s", "└┴┴┴┴┴┴┴┴┘");
	}
}