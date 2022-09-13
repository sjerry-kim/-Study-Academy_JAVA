package pratice;

import java.util.Scanner;

public class Test0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 22.08.02.(화) 과제 풀이
		// 값을 입력받고 값이 2~9사이의 수이면 구구단을 출력
		// 2~9 사이의 수가 아니면 '구구단에 등록된 수가 아닙니다' 출력
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int dan = input.nextInt();
		
		if(dan>=2 && dan<=9) {
			for(int i=2; i<10; i++) {
				System.out.println(dan + "X" + i + "=" + dan*i);
			}
			
		}else {
			System.out.println("구구단에 등록된 수가 아닙니다");
		}
		
		
		
		/* 22.08.01.(월) 내가 쓴 답안지 - 과제1
		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int dan = input.nextInt();
		for(int num = 2; num<10; num++) {
			if(dan>1&&dan<10) {
				System.out.println(dan + "X" + num + "=" + dan*num);
			}
			else {
				System.out.println("구구단에 등록된 수가 아닙니다");
				break;
			}
		}
		*/
		
		// 22.08.02.(화) 과제 풀이
		// 메뉴 선택 하는 반복문
		/* while문만 사용하는 해설
		System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
		int num = input.nextInt();
		while (num != 0) {
			if(num==1) {
				System.out.println("짜장을 선택하였습니다");
			}
			else if (num == 2) {
				System.out.println("짬뽕을 선택하였습니다");
			}
			else if (num == 3) {
				System.out.println("탕수육을 선택하였습니다");
			}
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt();
		}
		System.out.println("종료되었습니다");
		*/
		
		// do while을 사용하는 해설
		int num;
		do {
			System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			num = input.nextInt();
			if(num==1) {
				System.out.println("짜장을 선택하였습니다");
			}
			else if (num == 2) {
				System.out.println("짬뽕을 선택하였습니다");
			}
			else if (num == 3) {
				System.out.println("탕수육을 선택하였습니다");
			}			
		}while(num != 0);
		System.out.println("종료되었습니다");
		
		
		/* 22.08.01.(월) 내가 쓴 답안지- 과제2
		int menu;
		do {System.out.print("메뉴를 선택해주세요 1.짜장 2.짬뽕 3.탕수육 0.종료 : ");
			menu = input.nextInt();
				if(menu == 1) {
					System.out.println("짜장을 선택하였습니다.");
				}
				else if(menu == 2) {
					System.out.println("짬뽕을 선택하였습니다.");
				}
				else if(menu == 3) {
					System.out.println("탕수육을 선택하였습니다.");
				}
				else if(menu == 0) {
					System.out.println("종료되었습니다.");
				}
		}while(menu!=0);
		*/
	}
}
