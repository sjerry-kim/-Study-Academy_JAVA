package chap07_Object_String;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.05.(금)
		// 실습 1
		// 문자열을 작성하고, for문을 통해 출력하기
		String date = "2022-08-05";
		// 문자열 메소드는 문자열 값을 직접 바꾸지 않는다.
		for (int i=0; i<date.length();i++) {
			if(date.charAt(i) == '-') { //문자형은 기초형으로 하나의 값이 들어가 있기 때문에
				// 메소드는 필드값이 아니기에
				// 대입연산자를 이용해서 값을 수정할 수 없다
				// date.charAt(i) = '-' - 오류 발생
				System.out.print(".");
				continue;
			}System.out.print(date.charAt(i));
		}
		
		System.out.println();
		
		// 실습 2
		// while문을 이용해 입력 받은 값 뒤에 concat으로 
		// String 변수allWord 변수에 이어붙이기
		Scanner input = new Scanner(System.in);
		String allWord ="";
		String inputWord ="";
		
		while(!(inputWord.equals("종료"))) {
			System.out.print("단어를 입력하세요(반복을 멈추려면 종료) : ");
			inputWord = input.next();
			// allWord = allWord + inputWord와 동일한 결과
			allWord = allWord.concat(inputWord);			
		}
		System.out.println("결과 확인 : " + allWord);
		
		
		/* 내가 쓴 코딩
		Scanner input = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String allWord = input.next();
		
		String word = " 꺼져";
		
		while(!(word.equals("종료"))) {
			System.out.println(allWord.concat(word));
			System.out.print("문자를 입력하세요 : ");
			word = input.next();
		}
		System.out.println("종료되었습니다");
		*/
	
		// 실습 3
		// 이름을 입력받고 이름 가운데 글자를 *로 대치하는 프로그램
		String s = "홍길동";
		System.out.print("이름을 입력하세요 :");
		s = input.next();
		char middle = s.charAt(1);
		System.out.println(middle);
		System.out.println(s.replace(middle, '*')); // '김김김'을 입력했을 때 ***로 나옴
		//System.out.println(s.replace("길", "*"));
	
		
		
		
		/* 내가 쓴 코드
		String s = "홍길동";
		System.out.println(s.replace("길", "*"));
		

		System.out.print("이름을 입력하세요 : ");
		String s = input.next();
		s = s.replace('s.charAt(1)','*'));
		System.out.println(s);
		*/
		
		
		// 실습
		// 래퍼클래스
		// 강사님 해설-1
		String birthday = "0108";
		System.out.println(birthday);
		// 전체를 숫자로 바꿈
		int birthdayNum = Integer.parseInt(birthday);
		System.out.println(birthdayNum);
		
		// 강사님 해설-2
		// 달과 일을 잘라서 숫자로 바꿈
		// substring을 이용하여 글자를 자름
		String month = birthday.substring(0, 2);
		// 자른 글자를 숫자로 바꿔줌
		int birthdayMonth = 
				Integer.parseInt(month);
		System.out.println(birthdayMonth);
		
		// 글자에서 일자의 자리만큼 잘라줌
		String day = birthday.substring(2);
		// 자른 글자를 숫자로 바꿔줌
		int birthdayDay = 
				Integer.parseInt(day);
		System.out.println(birthdayDay);
		
		/* 내가 쓴 코딩
		System.out.print("생일을 입력하세요(띄어쓰기 없이) : ");
		String birthday = input.next();
		
		Integer date1 = Integer.parseInt(birthday);
		System.out.println(date1);
		*/
	}

}
