package ex21.array;

public class Program4 {
	public static void main(String[] args) {
		int[] nums= {5,2,7,4,6,1,3};
		int temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
// ## 자바 코드 연습 기초 #12 - 배열 값 교환하기
