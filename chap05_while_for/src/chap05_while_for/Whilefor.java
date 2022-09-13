package chap05_while_for;

import java.util.Scanner;

public class Whilefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.07.27.(목)
		
		// 반복문 while
		// 조건이 참(true)일 때 안의 블록을 반복한다. -? 거짓이 나올 때까지 반복한다?
		// 반복문 while을 쓸 때 주의점
		// 1. 조건문이 true일 때만 안의 내용이 실행
		// 2. 조건문이 항상 true이면 무한반복에 빠져서 프로그램이 끝나지 않는다
		int num = 0;
		while (num < 5 ) {
			System.out.println("반복하고 있습니다 : " + num);
			num++;
		}
		
		//실습1 
		// 10~1까지 카운트다운 출력
		int num1 = 10;
		while (num1 > 0) {
			System.out.println("카운트다운 " + num1);
			num1--;
		}
		
		//실습2
		//1~100까지 전체 합, 짝수의 합, 홀수의 합
		int sum, even, odd; // 사용할 변수들을 미리 선언한다
		int num2 = 1;
		sum = 0;
		even = 0;
		odd = 0;
		
		while (num2 <= 100) {
			//전체합
			sum += num2;
			//짝수의 합
			if(num2%2 == 0) {
			even += num2;
			}
			//홀수의 합
			else {
				odd += num2;
			}
			
			num2++;
		}
		//반복이 끝난 후에 확인을 하려면
		// while문 바깥에 작성
		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);
			
		
		
		// 2022.07.28.(금)
		//do-while : 반복한 내용이 무조건 한 번은 실행되는 조건문
		Scanner input = new Scanner(System.in);
		int num4 = 0;
		int sum4 = 0;
		do {//whie의 뒤에 있던 반복할 내용이 do를 이용해서 앞으로 오게 됨
			System.out.print("더할 값을 입력해주세요(0을 넣으면 멈춤) : ");
			num4 = input.nextInt();
			sum4 += num4;
			}while(num4 != 0); //do를 쓸 땐 ;를 입력한다 
			System.out.println("더한 값 : " + sum4);	
			// 조건이 참이라면 do로 올라가 다시 반복
			
		// 실습1 
		// 1부터 10까지 출력하기
		int num5 = 1;	
		do {
			System.out.println(num5); // 1 출력
			num5++; //num5의 값 증가
		}while(num5<=10);
		
		// 실습2
		// 업다운 게임
		// 반복조건 : 59가 아니면 반복한다.
		// 반복내용 : 입력받은 값을 59와 비교해서 작은지 큰지 알려준다
		int num6;
		do {
			System.out.print("점수를 추측해 보세요 : ");
			num6 = input.nextInt();
			if(num6<59) {
				System.out.println("정답값보다 낮습니다");
				}
			else if (num6>59) {
			System.out.println("정답값보다 높습니다");
				}
		}while(num6 != 59); 
		System.out.println("축하합니다. 정답입니다!" );
				
		
		// for문
		// for(초기화 ; 조건식 ; 증감계산)
		for (int num7 = 1; num7 <=10; num7++) {
			System.out.println(num7);
		}
		
		// 실습
		// for문을 이용한 1~10까지의 합
		int sum8 =0;
		for (int num8 = 1; num8<=10 ; num8++) {
			sum8 += num8;
		}
		System.out.println("1부터 10까지의 정수의 합 : " + sum8);
		
		// 실습 for - 팩토리얼
		long mult = 1;
		for(int num9 = 1; num9<=20; num9++) {
			mult *= num9;
		}
		System.out.println("20! 값 : " + mult);
		
		// 중첩 반복문 : 반복문 안에 반복문이 들어가 있는 형태
		for (int i=0 ; i<2 ; i++) {
			System.out.println("fot문 i에서 반복중입니다");
			for(int j=0; j<2; j++) {
				System.out.println("i : " + i + ", j :" + j);
			}
			System.out.println("내부 for문이 종료되었습니다");
		}
		
		// 실습
		// 중첩 반복문
		// 구구단 2단~9단 출력
		for(int i = 2; i <=9; i++) {
			System.out.println("<"+i+"단>");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " X " + j +" = " + (i*j));
			}
		}
			
		// 실습
		// 
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				// 가로 * 5개 찍어줌
				System.out.print("* ");
			}
			// * 5개가 찍힌 후 줄바꿈
			System.out.println();
		}
		
		// 2022.08.02.(화)
		// 중첩 반복문 조건 확인
		for ( int i =0; i<5; i++) {
			for(int j = 4; j>=0; j--) {
				if(i>=j) {
				System.out.print(i + ","+ j + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
		
		// 실습
		for (int i=0; i<5; i++) {
			for(int j=4; j>=0; j-- ) {
				if(i>=j)
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 실습 중첩반복문과 조건
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<=i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		}
}
