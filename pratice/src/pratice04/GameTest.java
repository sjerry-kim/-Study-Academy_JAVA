package pratice04;

import java.util.Scanner;

public class GameTest {
	
	// 2022.08.16.(화)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1 = new Game("가위바위보");
		BoardGame boardGame =  new BoardGame("원카드",3);
		
		game1.play();
		game1.end();
		boardGame.play(); // 메소드 오버라이딩으로 바뀌 내용 출력
		boardGame.end(); // 부모클래스의 내용 출력
		
		System.out.println();
		
	}
}
