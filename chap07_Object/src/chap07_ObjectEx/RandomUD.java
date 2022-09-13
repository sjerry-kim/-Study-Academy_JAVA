package chap07_ObjectEx;

import java.util.Scanner;

public class RandomUD {
	// 필드 - private : 직접 접근해서 값을 수정하는 것을 막기 위해 보편적으로  필드는 private을 사용한다
	private int num; // 랜덤한 수
	private int usernum; // 유저입력 수

	// public - 객체를 통해서 사용되는 메소드
	// private - 클래스 안에서만 사용되는 메소드
	//           내용이 길어지거나, 반복되는 내용을 메소드로 쓰기 위함
	// 매소드 > main에서 작성한 내용을 그대로 들고와서 만드는 법
	
	// 실습 1-1 강사님 해설 1
	public void start() {
		System.out.println("start메소드에서 진행되는 내용입니다");
		// 1. 랜덤한 수를 만듦
		this.num = (int) (Math.random() * 100) + 1; // 1~100까지의 수가 num에 랜덤하게 들어감
		System.out.println(num);

		// 2. 수를 입력받음
		// int usernum; > 바로 필드에 있는 usernum으로 접근(필드에 있기 때문에 다시 선언할 필요 없음)
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 추측하세요 : ");
			usernum = input.nextInt();

			// 3. 입력받은 수를 랜덤한 수와 비교하여 결과를 알려줌
			if (usernum > num) {
				// 4. 결과출력
				System.out.println("정답보다 큽니다");
			} else if (usernum < num) {
				System.out.println("정답보다 작습니다");
			} else {
				// usernum과 num이 같을 때 while문을 빠져나옴
				break;
			}
		}
		System.out.println("축하합니다! 정답입니다!");

	}
	
	// 실습 1-2 강사님 해설 2
	// 랜덤한 숫자값을 할당
	private void getRandomNum() {
		this.num =(int) (Math.random()*100)+1;
	}
	
	private int checkUserGuess() {
		Scanner input = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		this.usernum = input.nextInt();
		return usernum;
	}
	
	// Num 값이 큰지 작은지 같은지 확인.
	private void checkNum(){
		if(usernum>num) {
			System.out.println("입력값이 더 큽니다");
		}else if (usernum<num) {
			System.out.println("입력값이 더 작습니다");
		}
		else {
			System.out.println("같습니다");
		}
	}
	
	// 앞에 만든 메소드들을 조립해서 실행 !! -> 중요!
	public void startPlay() {
		System.out.println("메소드를 조립해서 실행");
		getRandomNum(); // 랜덤한 수를 할당
		while(true){
		this.checkUserGuess(); // 갑승ㄹ 입력받아옴
		checkNum(); // 비교하여 결과를 출력
		if( this.num == this.usernum) {
			break;
		}
		} 
	} 
}
