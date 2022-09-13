package pratice04;
//2022.08.16.(화)
public class BoardGame extends Game{
	// 필드
	private int peopleNum;
	
	// 생성자
	// 디폴트 생성자
	public BoardGame() {
		peopleNum = 0;
	}
	
	// 매개변수를 갖는 생성자
	public BoardGame(String gameTitle, int peopleNum) {
		super(gameTitle); // 수퍼클래스의 생성자 호출, 매개변수 전달.
		this.peopleNum = peopleNum;
	}
	
	// 메소드
	// 슈퍼클래스와 동일한 메소드임으로 오버라이딩한다
	public void play() {
		System.out.println(peopleNum + "명이서 " 
							+ getGameTitle() + "게임을 시작합니다");
	}
	
	
	/* 내가 작성한 코드
	// 필드
	private int peopleNum;
	
	// 생성자
	public BoardGame() {
		peopleNum = 0;
	}
	
	public BoardGame(String gameTitle, int peopleNum) {
		super.gameTitle = gameTitle;
		this.peopleNum = peopleNum;
	}
	
	// 메소드
	@Override
	public void play() {
		System.out.println(peopleNum + "명이서 " + gameTitle + "게임을 시작합니다");
	}
	*/

}
