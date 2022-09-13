package chap09_interface;
// 2022.08.17.(수)
// Implemnets 키워드를 통해서 메소드를 구현
// 인터페이스의 경우 대부분이 추상케소드로 이루어져있기 때문에 실행코드가 필요
// 인터페이스를 구현받은 클래스에서 실행코드 작성
public class Truck extends Car implements CarInterface {
	// 2022.08.18.(목)
	// 상속 받은 필드값으로 메소드 구현
	public void setTruck(String color, int speed) { // 왜 생성자를 안 만들고 set메소드를 쓰는 거지...?
		this.color = color;
		this.speed = speed;
		// Car에서 해도 무방하다...? 는 게 무슨 말이지...?
	}
	
	public String getTruckColor() {
		return color;
	}
	
	public int getTruckSpeed() {
		return speed;
	}

	// 인터페이스로 구현
	@Override
	public void printCar() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스의 내용을 Truck에서 구현했습니다");
	}

}