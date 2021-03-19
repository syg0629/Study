package ex04.io.printf;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		// avg = (float)(total/3.0); // double보다 float이 작으니까 작은 공간에 큰것을 넣으면 오류가 남
		avg = total/3.0f;


		// 성적 출력 부분
		System.out.print("┌────────────────────────────┐\n");
		System.out.print("│           성적 출력          │\n");
		System.out.print("└────────────────────────────┘\n");

		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %6.2f\n", avg); // 전체 길이 6개 확보 000.00해서 총 6개
		System.out.println("──────────────────────────────");

		// 인덱스를 넣으면 순서를 내가 정할 수 있음
		System.out.printf("%2$d %3$d %1$d \n", 1, 2, 3);
		
		// 지정자에 맞게 수가 와야하는데 인덱스를 넣으면 그렇지 않아도 됨.
		System.out.printf("%1$d %1$d %1$d \n", 1);
		
	}
}
