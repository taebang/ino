package 가변형인수;

public class ArgsTest {
/*
	가변형 인수 ==> 메서드의 매개변수의 개수가 실행될 때마다 다를 때 사용한다.
	
	- 이 가변형 변수는 메서드 내에서는 배열로 처리된다.
	- 가변형 인수는 한가지 자료형만 사용할 수 있다.
 */
	//정수형 데이터를 여러개 매개변수로 받아서 이들의 합계를 구하는 메서드
	
	//배열을 이용한 메서드
	public int sumArr(int[] data){
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	// 가변형 인수를 이용한 메서드
	public int sumArg(int...data){	//...인 가변형변수를 쓰는 방법
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	
	// 가변형 인수가 포함된 메서드를 작성할 때
	// 가변형 인수로 사용될 매개변수는 제일 뒤에 배치해야한다.
	// 예) 매개변수가 3개라면
	// public int sum(String name, long regNo, int...data){}
	
	
	public static void main(String[] args) {
		ArgsTest at = new ArgsTest();
		
		// 미리 배열을 만들어 계산
		int[] data = {12,23,34};
		System.out.println("배열 합계 1 : " + at.sumArr(data));
		
		// 배열을 직접 매개변수로 넣어 계산
		System.out.println("배열 합계 2 : " + at.sumArr(new int[]{1,2,3,4,5,6,7,8,9}));
		
		
		//가변형인수로 계산
		System.out.println("가변형 합계 1 : " + at.sumArg(111,222,333));
		System.out.println("가변형 합계 2 : " + at.sumArg(111,222,3,3,1,56,43));
		
	}
	
	
}
