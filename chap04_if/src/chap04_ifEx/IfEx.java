package chap04_ifEx;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값을 입력 받아서 10보다 크고, 20보다 작다면, 변수 num을 출력
		// 10보다 크다 : num >10, 20보다 작다 : num < 20
		// 둘 다 참일 때 변수 num을 출력 : &&
		Scanner input = new Scanner(System.in); //여러번 사용 가능
		System.out.print("10보다 크고 20보다 작은 수를 입력하면 출력됩니다 : ");
		int num = input.nextInt();	
		if (num>10&&num<20) {
			System.out.println(num);
			System.out.println("프로그램이 종료되었습니다.");
			
		}
		
		//실습 문자열 비교
		//변수 안에 값을 할당하고 비교할 때는 == 연산자 사용 가능
		/*
		String name = "김진혜";
		if (name == "김진혜")
			System.out.println("본인이 맞습니다");
		System.out.println("프로그램이 종료되었습니다.");
		*/
		
		// 문자열값을 받아와서 비교할 때는 .equals(비교열 문자열) 사용
		System.out.print("이름을 입력하세요 : ");
		String name = input.next();
		if (name.equals("김진혜")) // 결과값이 true, false를 가짐
			System.out.println("본인이 맞습니다.");
		System.out.println("프로그램이 종료되었습니다."); // false인 경우 확인하기 위해
		
		// 점수를 입력받고
		// 점수가 60보다 크면, 합격
		// 아니면 불합격
		// if-else 문이 끝나면 수고하셨습니다 출력
		System.out.print("점수를 입력하세요 : ");
		int score = input.nextInt();
		if(score>60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		System.out.println("수고하셨습니다:)");
		
		
		//실습
		System.out.print("키를 입력하세요 : ");
		int tall = input.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = input. nextInt();
		
		if(tall>140&&age>10)
			System.out.println("놀이기구를 탈 수 있습니다");
		else
			System.out.println("놀이기구를 탈 수 없습니다");
		
		//실습
		boolean check = false;
		if (check)
			System.out.println("확인했습니다");
		else
			System.out.println("다시 확인하세요");
		
		//22.07.28(목)
		//실습 - 중첩 If
		// 홀수짝수/ 음수양수 판단
		System.out.print("숫자를 입력하세요(0 제외) :");
		int num1 = input.nextInt();
		
		if (num1%2 == 1 || num1%2 == -1) { //중괄호
			System.out.println("홀수입니다");
			if(num1>0) { //중괄호
				System.out.println("양수입니다");
			}
			else { //중괄호
				System.out.println("음수입니다");
			}
		}
		else {
			//System.out.println(num1&2);
			System.out.println("짝수입니다");
			if(num1>0) {
				System.out.println("양수입니다");
			}
			else {
				System.out.println("음수입니다");
			}
		}
		
		
		
		//실습 중첩 If
		// 3개의 정수를 받고 최대값 출력하기
		int a, b, c, max;
		
		System.out.print("숫자 세 개를 입력하시오 : ");
		a = input.nextInt(); //1
		b = input.nextInt(); //2
		c = input.nextInt(); //3
		
		if(a>b) {
			// a가 크므로 max값
			max = a; //max에 a값 할당
			if(a>c) { // 조건문을 (max>c)
				System.out.println("최대값 : " + a); //max
			}
			else {
				// c가 max값 보다 크므로 max값에 할당
				max=c;
				System.out.println("최댓값 : " + c);//max
			}}
			
			else {
				if(b>c) {
					System.out.println("최댓값 : " + b);
				}
				else {
					System.out.println("최댓값 : " + c);
				}
				
		}// 최소값은 부등호만 반대로 하면 됨
		
		/* max로 바꾼 코드
		  int a =1;
	      int b =2;
	      int c =3;
	      int  max;
	      
	      if(a>b) {
	         // a 크므로 max값
	         max = a; // max에 a값 할당
	         if(a>c) { // 조건문을 (max>c)
	            System.out.println("최대값: " +max); //max
	         }
	         else {
	            // c가 max값 보다 크므로 max값에 할당
	            max = c;
	            System.out.println("최대값: " +max); // max
	         }
	      }
	      else {
	         if(b>c) {
	            max = b;
	            System.out.println("최대값: "+max);
	         }
	         else {
	            max=c;
	            System.out.println("최대값: "+max);
	         }
	      }
	      */

		
		
		
		// 실습 연속적 if -else if- else
		// 학점계산
		System.out.print("점수를 입력하세요 : ");
		int score1 = input.nextInt();
		
		if (score1>=90) {
			System.out.println("A학점입니다");
		}
		else if (score1>=80) {
			System.out.println("B학점입니다");
		}
		else if (score1>=70) {
			System.out.println("C학점입니다");
		}
		else {
			System.out.println("F학점입니다");
		}
		
		// 실습
		// 미세먼지 판별기
		// 0~30 좋음, 31~80 보통, 81~150 나쁨, 151~ 매우 나쁨
		int dust = 112;
		
		if(dust>150) {
			System.out.println("미세먼지 수치 : 매우 나쁨");
		}
		else if(dust>80) {
			System.out.println("미세먼지 수치 : 나쁨");
		}
		else if(dust>30) {
			System.out.println("미세먼지 수치 : 보통");
		}
		else {
			System.out.println("미세먼지 수치 : 좋음");
		}
		
		/* 강사님 답안지
		if(dust >= 0 && dust <=30) {
			System.out.println("좋음");
		}
		else if (dust <= 80) {
			System.out.println("보통");
		}
		else if (dust <= 150) {
			System.out.println("나쁨");
		}
		else {
			System.out.println("매우 나쁨");
		}
		*/
		
		//switch문
		int number = 1;
		// ()안에 비교할 값을 넣는다
		// 비교할 값(number와 case 뒤의 값0,1,...)을 동일한 자료형으로 넣어주어야 한다
		switch (number) {
		case 0: // case 뒤가 원하는 값일 경우 출력할 값을 넣는다.
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default :
			System.out.println("많음");
			break;
		}		
		
		
	}

}
