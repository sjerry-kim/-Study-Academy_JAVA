package chap09_interface;

public class DisplayTV implements DisplayInterface{

	@Override
	public void onDisplay() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void offDisplay() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
	}

}
