package pratice02;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.03.(수)
		// 연습문제
		// 배열 - 연습문제1
		int[] x = new int[10];

		// 배열 - 연습문제2
		String[] y = { "가", "나", "다", "라", "마" };

		// 배열 = 연습문제3
		int[] numbers = new int[5];
		System.out.println(numbers);
		System.out.println(numbers[0]);

		// 배열 초기화 - 연습문제1
		int[] scores = { 88, 58, 47, 69, 50, 72, 87, 90, 84, 95 };

		// 배열 초기화 - 연습문제2
		String[] names = { "홍길동", "흥부", "놀부", "콩쥐", "팥쥐", "장화", "홍련", "심청", "춘향", "이순신" };

		// 배열 초기화 - 연습문제3
		boolean[] passes = { false, true, true, false, true, false, false, false, false, false };

		// 배열의 요소 값 수정 - 연습문제1
		scores[0] = 99;

		// 배열의 요소 값 수정 - 연습문제2
		names[9] = "몽룡";

		// 배열의 요소 값 수정 - 연습문제3
		passes[1] = false;

		// 배열과 for-each문 - 연습문제1
		for (int score : scores) {
			System.out.println(score + "점");
		}

		// 배열과 for-each문 - 연습문제2
		for (String name : names) {
			System.out.println(name + "님");
		}

		// 배열과 for문 i - 연습문제1
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + 5);
		}
		/* 강사님 해설
		for (int i = 0; i < scores.length; i++) {
			score += 5;
			System.out.println(scores[i]);
		}
		 */

		// 배열과 for문 i - 연습문제2
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 배열과 for문 i - 연습문제3
		for (int i = 0; i < passes.length; i++) {
			System.out.println(!(passes[i]));
		}
		
		/* 강사님 해설
		for (int i = 0; i < passes.length; i++) {
			pass[i] = !pass[i]; // '='대입연산자는 오른쪽 값 먼저 계산한 후 왼쪽으로 반환시키기 때문에
			System.out.println(passes[i]);
		}
		 */

		// 배열과 반복문과 조건문 - 연습문제1
		// 강사님 해설
		int sumAll = 0;
		int avrg = 0;
		for(int score: scores) {
			sumAll += score;
			System.out.println(score);
		}
		
		avrg = sumAll/scores.length;
		System.out.println("평균 : " + avrg);
		
		int sumPass = 0;
		int avrgPass = 0;
		int countPass =0; // 평균을 구할 때, 합격자의 수를 알아야하기 때문.. 같이 카운트해서 올린다..
		for(int score : scores) {
			if(score>60) {
				sumPass += score;
				countPass++; // continue 사용 가능..?
			}
		}
		avrgPass = sumPass/countPass;
		System.out.println("합격자 평균 : " + avrgPass);
		
		/*
		 int sum = 0; 
		 int count = 0; 
		 int[] scores = {88, 58, 47, 69, 50, 72, 87, 90, 84, 95}; 
		 scores[0]=99;
		  
		 for(int score: scores) { 
		 	if(score>=60) {
		  	count++; 
		  	sum += score; 
		  	} 
		 }
		 System.out.println(sum/count);
		*/

		// 배열과 반복문과 조건문 - 연습문제2
		// 연습문제2
		// 강사님 해설
		for(String name : names) {
			if(name.equals("콩쥐")) {
				System.out.println("콩쥐가 있습니다.");
			}
		}
		
		
		/* 내가 쓴 코드
		 String[] names = {"홍길동", "흥부", "콩쥐", "놀부", "팥쥐", "장화", "홍련", "심청", "춘향","이순신"}; 
		 names[9]="몽룡"; 
		 for(String name : names) { 
		 	if(name.equals("콩쥐")) {
		 		System.out.println(name); 
		 	} 
		 }
		 */

		
		
		// 배열과 반복문과 조건문 - 연습문제
		// 강사님 해설
		int count1 = 0;
		for(int i=0; i<passes.length; i++) {
			if(passes[i]) {
				count1++;
			}
		}
		System.out.println("합격자 수 : " + count1);
		
		/*
		 boolean[] passes = {false, true, true, false, true, false, false, false, false, false}; 
		 passes[1]=false; 
		 int count1 = 0; 
		 for(int i=0; i<passes.length;i++) { 
		 	if(passes[i]==true) {
		  		count1++; 
		  	} 
		 }
		 System.out.println(count1);
		 */

	}

}
