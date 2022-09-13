package break_continue;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 안에서 사용할 수 있는 키워드
		// break;
		
		// switch문에서 break;
		int num = 0;
		switch(num) {
		case 0:
			System.out.println("입력된 값은 0입니다");
			break; // break를 사용해서 switch문을 나간다
		default:
			System.out.println("다른 숫자값입니다");
			break;
		}
		
		//반복문(for문)에서 break
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==4) {
				break;
			}
		}
		
		//while문에서 break
		int a =1;
		while(true) { //원래 조건에 true가 들어가면 무한루프에 빠짐. 그러나 break를 사용하면 빠져나올 수 있음
			a++;
			System.out.println(a);
			if(a>10) {
				break;
			}
		}
		
		// 실습 1 : for문에서 break;
		// 1~100까지 출력하는 중 77까지 출력하고 멈추기
		// 
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
			//77을 출력하고 나오기 위해 sysout 뒤에 작성
			if(i==77) {
				break;
			}
			//10의 배수일 때 줄바꿈 추가
			if(i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		// 실습 2 : while문에서 break;
		// while 조건문을 true로 넣은 후(무한루프), 입력 받은 숫자를 술력
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요(0:종료) : ");
			int num1 = input.nextInt();
			if (num1==0) {
				break;
			}
			System.out.println(num1);
		}
		
		// continue 확인
		// 현재의 반복문을 건너뜀
		for (int i=0; i<10; i++) {
			if(i==4) {
				continue; // 유의사항 : 건너 뛰고 싶은 코드 위쪽에 작성해야한다/ 안그러면 하나마나 의미 없음
			} 
			System.out.println(i);
		}
		
		
		// 실습 : continue
		// 1~30까지 출력하는 중 3의 배수는 건너뛰기
		for(int i=1; i<=30; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
