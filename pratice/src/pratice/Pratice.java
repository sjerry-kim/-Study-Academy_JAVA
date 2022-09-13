package pratice;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.04.(목)
		int sum; // 변수 선언 = 변수를 사용할 준비가 됨
		sum = 6 + 8; // 14
		sum = 2 + 1; // 3 - 변수는 가장 마지막 값을 가지게 된다
		// 코드는 항상 위에서 아래로 실행된다
		System.out.println(sum);
		String name = "홍길동"; // 변수의 초기화(값을 바로 넣어라)
		// 선언을 먼저 하는 경우
		// for문과 while문과 같은 반복문을 사용할 때 선언을 해줌
		int num;
		num = 0;
		for (int i = 0; i < 5; i++) {
			num = i;
		}
		System.out.println("프로그램이 끝났습니다");

		if (num > 3) { // 조건신을 만들기 위한 규칙
			System.out.println("a값은 3보다 큽니다");
		}
		

		// 통장확인 프로그램
		// 기능을 선택하고 금액을 입력하면
		// 입금, 출금, 송금 하는 프로그램
		// 변수 : 통장 = 이미 가지고 있는 금액
		// 입금 : 통장에 입력한 금액을 추가함 +
		// 아래 기능의 조건 (통장의 금액이 입력한 금액보다 클 때)
		// 출금 : 통장에 입력한 금액을 감소함 -
		// 송금 : 통장에 입력한 금액을 감소함 -
		// + 어디로 보낼 건지를 입력받고, 마지막에 어디로 보내는지 안내함
		// 강사님 해설
		
		// 변수값 초기화
		int account = 1000000;
		int money;
		String bank;
		String adress;
				
		//기능입력안내
		System.out.print("기능을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		bank = input.next();
		
		System.out.print("금액을 입력하세요 : ");
		money = input.nextInt();
		
		if(bank.equals("입금")) {
			account += money;
			System.out.println("현재 잔액 :" + account);
		}
		
		else if(bank.equals("출금")) {
			// account 금액이 money보다 크거나 같다면 실행
			if(account>=money) {
				account -= money; // account = account-money
				System.out.println("현재 잔액 : " + account);
			}
			else{
				System.out.println("출금이 불가능합니다");
			}
		}
		
		else if(bank.equals("송금")) {
			if(account>=money) {
				System.out.print("송금할 주소를 입력하세요 : ");
				adress = input.next();
				account -= money;
				System.out.println("현재 잔액 : " + account );
				System.out.println(adress + "(으)로 송금하였습니다");
			}
			else{
				System.out.println("출금이 불가능합니다");
			}
		}
		System.out.println("프로그램을 종료합니다");
		
		
		/*
		// 강사님 순서도 보고 내가 작성한 코드
		int account = 1000000;
		int money, bank;
		String adress;
		
		System.out.print("기능을 입력하세요 1.입금 2.출금 3.송금: ");
		Scanner input = new Scanner(System.in);
		bank = input.nextInt();
		
		System.out.print("금액을 입력하세요 : ");
		money = input.nextInt();
		
		if (bank==1) {
			account += money;
			System.out.println("현재 잔액 : " + account);
		}
		
		else if (bank==2) {
			if(account>=money) {
				account -= money;
				System.out.println("현재 잔액 : " + account);
			}
			else {
				System.out.println("출금이 불가합니다");
			}
		}
		
		else if(bank==3) {
			if(account>=money) {
				System.out.print("송금할 계좌주를 입력하세요 : ");
				adress = input.next();
				account -= money;
				System.out.println(adress + "님에게 " + money + "원 송금하였습니다");
			}
			else {
				System.out.println("출금이 불가합니다");
			}
		}
		
		System.out.println("종료되었습니다");
		
		*/
		
		/*
		//내가 쓰던 코드
		int moneyA = 1000000;
		Scanner input = new Scanner(System.in);
		System.out.print("기능을 선택하세요 1.입금 2.출금 3.송금: ");
		int a =input.nextInt();
		
		System.out.print("금액을 입력하세요 : ");
		int moneyB = input.nextInt();
		
		if(a == 1) {
			int sum1 = moneyA + moneyB;
			System.out.println(moneyB + "원을 입금하였습니다.");
			System.out.println("잔액 : " + sum1 + "원");
		}
		else if(a == 2){
			int sub1 = moneyA - moneyB;
			System.out.println("출금되었습니다");
			System.out.println("잔액 : " + sub1 + "원");
				
			}
		else if(a == 3) {
			System.out.print("송금할 계좌주 이름을 입력하세요 : ");
			String name1 = input.next();
			int sub1 = moneyA - moneyB;
			System.out.println(name1 + "님께 " + moneyB + "원 송금하였습니다");
			System.out.println("잔액 : " + sub1 + "원");
			}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
