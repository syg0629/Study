package ex21.array;

public class Program3_1 {
	public static void main(String[] args) {
		int[] nums= {5,2,7,4,6,1,3};

		int index = -1; // 찾지 못했다는 의미. -1으로 쓰는게 바람직. 0도 인덱스 값이 있기 때문

		for (int i = 0; i < 7; i++) {
			if(nums[i]== 1) {
				index = i+1;
				break; // 값을 찾았으면 바로 빠져나오게끔
			}
		}
		System.out.println(index);
	}
}
// 자바 코드 연습 기초 #11 - 배열 항목 찾기
// 선생님 코드
