package chap07_Object;

public class MathNum {
	// 2022.08.10.(수)
	// 두 수 중 큰 값을 return하는 정적메소드
	static int intMax(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	// 두 수를 더한 값을 return하는 정적메소드
	static int intAdd(int a, int b) {
		return a+b;
	}
	


}
