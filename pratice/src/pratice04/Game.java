package pratice04;

public class Game {
	// 2022.08.16.(화)
	// 필드
	private String gameTitle;
	
	// 생성자
	// 디폴트 생성자
	public Game() {
		gameTitle = "미정";
	}
	
	// 매개변수가 있는 생성자
	public Game (String gameTitle) {
		this.gameTitle = gameTitle;
	}
	
	// 메소드
	public String getGameTitle() {
		return gameTitle;
	}
	
	public void play() {
		System.out.println(getGameTitle()+"게임을 시작합니다"); // 메소드에서 메소드로 접근 가능
	}
	
	public void stop() {
		System.out.println(getGameTitle()+"게임을 멈춥니다");
	}
	
	public void end() {
		System.out.println(getGameTitle()+"게임을 종료합니다");
	}
	
	/* 내가 작성한 코드
	// 필드
	protected String gameTitle;
	
	// 생성자
	public Game() {
		gameTitle = "미정";
	}
	
	public Game(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	
	// 메소드
	public String getGameTitle() { // 게임타이틀을 들고온다
		return this.gameTitle;
	}
	
	public void play() {
		System.out.println(gameTitle + "게임을 시작합니다");
	}
	
	public void stop() {
		System.out.println(gameTitle +"게임을 멈춥니다");
	}
	
	public void end() {
		System.out.println(gameTitle +"게임을 종료합니다");
	}
	*/
}
