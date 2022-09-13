package chap07_Object;

public class NumCheck {
	// 2022.08.08.(월)
	// 필드
	// private = 클래스 안에서만 접근 가능
	private int num;
	
	// 메소드 : 접근 제어자를 붙여서 범위를 알려줄 수 있다
	// public = 모든 곳에서 접근 가능
	// 값을 정해주는 setNum, 값을 되돌려주는 getNum, 값을 비교하는 checkNum
	// 숫자값을  설정
	public void setNum(int num) { // 값을 받아오기만 하면 되기 때문에 void 사용(return값 없음)
		this.num = num;
	}
	
	// 숫자값을 되돌려줌
	public int getNum() { // return 값의 자료형이 int 이므로 앞에 int를 붙여줌
		return this.num;
	} // 필드값에 접근하기 위해서! 라고 설명해주심!
	
	// 양수, 음수, 0 비교후 출력 메소드
	// 메소드 안에 다양한 코드를 작성할 수 있다
	public void checkNum() {
		if (this.num >0) {
			System.out.println("양수");
		}
		else if(this.num <0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
	}
	
}
