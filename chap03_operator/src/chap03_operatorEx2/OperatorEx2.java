package chap03_operatorEx2;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 가로길이를 입력받으면
		// 면적이 1000에 가깝게 하는 세로 길이를 계산해서 출력
		// 면적 = 사각형의 넓이 = 가로(w) x 세로(h)

		Scanner input = new Scanner(System.in);
		System.out.print("가로 길이를 입력하세요(1000을 넘어서는 안됨) : ");
		int width = input.nextInt();
		int height = 1000/width;
		int square = width*height;
		// double doubleHeight = 1000.0/ w;
		// 주의 사항! 실수로 값을 받고 싶을 때 타입을 double로 하더라도
		// 실제 코드에 실수가 최소 1개는 (위의 식에서는 1000.0) 있어야 함
		System.out.println("세로 길이 : " + height);
		//System.out.println("세로 길이 : " + doubleHeight);
		
		/*
		System.out.print("아무값이나 입력해주세요 : ");
		String word = input.next(); // next 값은 띄어쓰기 이후는 출력 안함
		System.out.println(word + 10); //문자끼리의 +는 문자의 연결
		*/
		
		// 이름을 입력받으면 반갑습니다라고 출력하는 코드
		String name = "김진혜";
		System.out.print("이름을 입력하세요 : ");
		name = input.next();
		System.out.println("반갑습니다. " + name + "님");
		
		// 체온을 입력받아 출력하는 코드
		System.out.print("체온을 입력하세요 : ");
		double temp = input.nextDouble(); //double형으로 받기 위해서 넥더 사용
		System.out.print("강의실을 입력하세요 : ");
		String classNum = input.next();
		System.out.print("현재 체온 "+ temp + "도 입니다. ");
		System.out.println(classNum + " 강의실입니다.");
		
		
		// 놀이기구를 타는 사람이 6세 이상인지
		// 키가 140 이상인지
		// 6세 이상(true), 키 140 이상(true) 일 때 놀이기구를 탈 수 있다(true)
		int age = 9;
		int h =140;
		
		System.out.println(age >= 6);
		System.out.println(h >= 140);
		System.out.println(age>=6 && h>=140);
		
	}

}
