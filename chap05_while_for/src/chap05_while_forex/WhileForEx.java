package chap05_while_forex;

import java.util.Scanner;

public class WhileForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2022.07.29.(금)
		//실습1
		//입력받은 모든 수를 더하는 프로그램
		// while문 사용
		// 0을 입력받을 때까지 모든 숫자 더함
		// 조건 : 0을 입력받을 때? 입력중지
		//     : 0이 아닌 다른 숫자를 입력받았을 때? - 숫자를 더하기 위한 반복
		// 반복되는 내용이 무엇인지? - 숫자를 더하는 것
		// 어떻게 숫자를 더할지 - 변수 하나에 숫자를 계속 더해서 저장
		// 풀이 : == 관계연산자를 사용
		// 0이 들어왔을 때(같을 때) : 반복 멈춤
		// 다른 수가 들어왔을 때 : 계속해서 모든 숫자를 더함
		// 반복내용 : 모든 숫자를 더함
		//			sum 변수를 통해서 들어오는 값들을 더하여 저장
		//			값들이 얼마나 입력될 지 모르기 때문에 sum 변수를 만들어서 저장
		Scanner input = new Scanner(System.in);
		System.out.print("더할 수를 입력하세요(0을 넣으면 종료) : ");
		int num = input.nextInt();
		int sum = 0; // 값을 더하기 위한 변수 초기화
		while(num != 0) {//num이 0이 아닐때 반복... while문은 같다 같지않다를 확인할 때 자주 사용함
			// 1. 들어온 값을 더함
			sum += num; // sum = sum+num;
			// 2. 다시 num을 비교하기 위해 input으로 입력 받음
			System.out.print("더할 수를 입력하세요(0을 넣으면 종료) : ");
			num = input.nextInt();
		}
		System.out.println("총 더한 값 :" + sum);
		
		//실습2
		// 구구단 4단 출력
		int num1 = 1 ;
		int dan = 4;
		while(num1<10) { // 9까지 출력하기 위한 조건
			System.out.println(dan + " X " + num1 + " = " + (num1*dan));
			num1++; //num1의 값을 증가시킴
		}
		
		/* -> 내가 짠 코드...ㅋㅋㅋ 오류 찾기
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int sum1 , sum2, sum3;
		sum1 = num3;
		sum2 = num3 + num4;
		sum3 = num3 + num4 + num5;
		
		while (num3 ==0 || num4==0 || num5==0) {
			if(num3==0) {
				sum1 = num3;
			}
			else if (num4 == 0){
				sum2 = num3 + num4;
			}
			else if (num5 == 0) {
				sum3 = num3 + num4 + num5;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		*/
		 
		// 실습
		// 더하기를 몇 회 반복할 지 입력받은 후 : n회
		// 숫자 두 개를 n회 입력받아 각각 더한다
		int b,c,d,sum3;
		
		System.out.print("더하기를 몇번 반복할지 작성하세요 : ");
		d = input.nextInt();
		// 횟수만큼 반복해줄 때는 초기값을 0으로 많이 쓴다 / 숫자를 쓸 때는 1로 많이 쓴당~!
		for(int start = 0; start <d; start++ ) {
			System.out.print("두 수를 띄어서 작성하세요 ");
			b = input.nextInt();
			c = input.nextInt();
			sum3 = b + c;
			System.out.println("결과 : " + sum3);	
		}
		
		// 1, 5, 7, 11, 13, 17, 19
		// 1~20까지의 정수 중 2또는 3의 배수가 아닌 수의 총합.
		int sum9 = 0;
		for (int num9 = 1; num9<=20; num9++) {
			// !(num9 % 2 == 0 || num9 % 3 ==0) <- 아래와 동일한 결과값을 출력함
			if(num9 % 2 != 0 && num9%3 !=0) {
				sum9 += num9;
			}
		}
		// for문의 초기화 값은 for문 안에서만 사용이 가능하다 
		System.out.println(sum9);
		
		for (int i = 0; i<5; i++) {
			System.out.println("반복문입니다"+ i);
		}
		// System.out.println(i); // for문 밖에서는 쓸 수 없다
		// 다른 for문에서 사용한 이름은 다른 for문에서 사용할 수 있다
		for (int i = 0; i<10; i++) {
			System.out.println("새로운 i를 이용한 반복문 입니다");
		}
		
		
	}

}
