package chap09_interface;
// 2022.08.18.(목)
public class Bus implements CarOptionInterface {
	// 인터페이스의 추상 메소드를 추가하고싶을 때는 
	// 상속을 통해서 새로운 인터페이스에 추가하는 것이 안전하다
	@Override // CarInterface에 있는 추상 메소드
	public void printCar() {
		// TODO Auto-generated method stub
		System.out.println("carOptionInterface를 Bus에서 구현했습니다");
	}

	@Override // CarOptionInterface에서 작성한 추상 메소드
	public void carDrive() {
		// TODO Auto-generated method stub
		
	}

}
