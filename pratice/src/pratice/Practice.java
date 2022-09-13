package pratice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 22.08.01.(월)		
		// 연습문제 1
		// 비밀번호가 "1111"일 때
		// 참일 때 "비밀번호가 맞습니다"를 출력하고,
		// 거짓일 때 , "비밀번호가 아닙니다"를 출력
		// *문자를 비교할 때 .equals(비교할 문자)를 사용하변 됨
		
		Scanner input = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요 : ");
		String password = input.next();
		if(password.equals("1111")) {
			System.out.println("비밀번호가 맞습니다");
		}
		else {
			System.out.println("비밀번호가 아닙니다");
		}
		
		// 연습문제2
		// 각 달의 숫자를 적었을 때, 달의 일수를 출력하는 프로그램을 작성하세요.
		// 1,3,5,7,8,10,12 : 31일 / 4,6,9,11 : 30일 / 2: 28, 29일
		System.out.println("일수를 알고 싶은 달을 입력하세요 : ");
		int month = input.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8:  case 10: case 12:
			System.out.println("31일입니다");
			break;
		case 4 : case 6: case 9: case 11:
			System.out.println("30일입니다");
			break;
		case 2 : 
			System.out.println("28일 또는 29일입니다");
			break;
		default : 
			System.out.println("입력하신 달은 없습니다");
		}
		
		// 연습문제3
		// “그만”을 입력할 때 까지 입력받은 문자열을 그대로 출력
		System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
		String word = input.next();
		while(!(word.equals("그만"))) { //word.equals(그만)은 word가 그만일 때 참이 됨 그래서 ! 추가
			System.out.println(word);
			System.out.print("그만을 입력하면 멈춥니다. 아무글이나 입력하세요 : ");
			word = input.next();
		} //do while도 해보기
		
		// 연습문제4
		// 구구단 15단 출력
		int dan = 15;
		for (int i=2 ; i <10; i++) {
			System.out.println(dan + "X" + i + "=" + dan*i);
		}
		
		// 연습문제5
		// 지하철 교통카드 시스템 만들기
		
		int card = 3000;
		int pay = 1300;
		
		System.out.print("지하철에 탑승하시겠습니까? 네:1 아니오:0 > ");
		int getSubway = input.nextInt();
		while(getSubway == 1) {
			if(card >= pay) {
				card -= pay;
				System.out.println("탑승하였습니다. 현재 남은 잔액은" + card + "원입니다.");
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			System.out.print("지하철에 탑승하시겠습니까? 네:1 아니오:0 > ");
			getSubway = input.nextInt();
		}
		System.out.println("종료되었습니다.");
		
		
		
		
	}

}
