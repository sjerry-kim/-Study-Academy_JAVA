package chap07_Object;

public class RandomUD {
	// 2022.08.08.(월)
	// 실습 - 업다운 게임 - 내가 연습하던 코드...
	// 필드
	public int num, usernum;
	
	//메소드
	void getRandomNum(int num) {
		this.num = num;
		System.out.println(num);
	}
	
	int checkUserGuess(int num1) {
		this.usernum = num1;
		return this.usernum;
	}
	
	void checkNum() {
		if (this.usernum>num) {
			System.out.println("정답보다 큽니다");
		}
		else if(this.usernum<num) {
			System.out.println("정답보다 작습니다");
		}
		else {
			System.out.println("축하합니다 정답입니다");
		}
	}

}
