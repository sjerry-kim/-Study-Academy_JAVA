package chap09_interface;
//2022.08.17.(수)
public class Taxi extends Car implements CarInterface {
	
	// 2022.08.18.(목)
	// Car의 수퍼클래스의 필드/메소드 사용
	public void setTaxi(String color, int speed) {
		this.color = color; // Car에서 protected로 설정해두어서 접근 가능
		this.speed = speed;
	}
	
	public String getTexiColor() {
		return color;
	}
	
	
	// 인터페이스 구현
	@Override
	public void printCar() { // 메소드의 이름만 받아옴
		// TODO Auto-generated method stub
		System.out.println("인터페이스의 내용을 Taxi에서 구현했습니다");
		
	}

}
