package chap09_interface;
// 2022.08.17.(수)
// interface 키워드를 통해서 인터페이스 생성
public interface CarInterface {
	// 인터페이스 구성요소의 특징
	// 1. 추상메소드로만 이루어져있다
	// 1-1. 안에 실행코드가 필요한 경우 default 키워드 사용
	// 2. 필드값은 사용할 수 없고 상수(final)로만 사용 가능
	// 3. 정적메소드 사용가능
	/* 인터페이스는 기복적으로 추상메소드로 이루어져 있다 */
	
	// 필드값 대신 상수 사용 가능
	final int NUMBER = 0;
	
	// 정적메소드 사용가능
	public static void printCarNumber() {
		System.out.println("인터페이스의 정적메소드입니다 : " + NUMBER);
	}
	
	// 추상메소드 - 추상메소드의 형태가 곧 기본 메소드 (abstract이라는 키워드가 없어도 됨)
	public void printCar();
	
	// 블록이 있는 기본 메소드를 사용할 때 default 키워드를 사용
	default public void move() {
		System.out.println("내용을 추가하기 위해서는 default 키워드 사용");
	};
	
	// 2022.08.18.(목)
	// public void carDrive(); // 이미 사용하고 있는 인터페이스에 새로운 메소드를 추가하면 알 수 없는 에러들이 나타난다
	// 따라서 새로운 인터페이스를 하나 더 만들어서 상속하는 게 보편적이다.

}
