package chap07_ObjectEx;

import java.util.Scanner;

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.08.(월)
		
		// 실습1-2 : 업다운 게임(강사님 해설)
		// RandomUD 객체확인
		RandomUD randomNum = new RandomUD();
		randomNum.startPlay(); // 캡슐화 - 클래스 안의 내용이 보이지 않는 것..!

		
		
		
		// 실습1-1 : 업다운 게임(강사님 해설)
		// 1. 랜덤한 수가 만들어짐
		// 2. 수를 입력받음
		// 3. 입력받은 수를 랜덤한 수와 비교하고 결과를 알려줌
		// 4. 결과에 따라서 크다, 작다를 알려주고(반복 2~4)
		// 5. 게임을 끝낸다
		
		// 1. 랜덤한 수를 만듦
		int num =(int) (Math.random()*100)+1; // 1~100까지의 수가 num에 랜덤하게 들어감
		System.out.println(num);
		
		// 2. 수를 입력받음
		int usernum;
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.print("숫자를 추측하세요 : ");
		usernum = input.nextInt();
		
		// 3. 입력받은 수를 랜덤한 수와 비교하여 결과를 알려줌
			if(usernum>num) {
				// 4. 결과출력
				System.out.println("정답보다 큽니다");
			}
			else if(usernum<num) {
				System.out.println("정답보다 작습니다");
			}
			else {
				// usernum과 num이 같을 때 while문을 빠져나옴
				break;
			}
		}
				System.out.println("축하합니다! 정답입니다!");
				
	}

}
