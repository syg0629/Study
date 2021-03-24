package ex21.array;

public class Program3 {
	public static void main(String[] args) {
		int[] nums= {5,2,7,4,6,1,3};
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				System.out.println(i+1);
			}
		}
	}
}
// 자바 코드 연습 기초 #11 - 배열 항목 찾기
// 이건 내가 작성한 코드. 코드의 복잡도가 높아지면 인덱스 값을 저장할 임시변수가 있는 게 좋음

