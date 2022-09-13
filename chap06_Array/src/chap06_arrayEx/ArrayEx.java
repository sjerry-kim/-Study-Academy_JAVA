package chap06_arrayEx;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.02.(화)
		// 실습 : double 배열 초기화
		// 37 이상은 (위험)과 함께 출력
		// 배열에 Scanner를 통해 체온을 저장
		// 값을 5개를 갖는 double 배열을 선언한 후
		// for문과 Scanner를 통해 값을 받아 각 배열에 저장 후 출력

		/*
		Scanner input = new Scanner(System.in);
		double[] temperatures = new double[3];

		for (int i = 0; i < temperatures.length; i++) {
			System.out.print("체온을 입력하세요: ");
			temperatures[i] = input.nextDouble();
		}
		// for-each사용
		for (double temperature : temperatures) {
			if (temperature >= 37) {
				System.out.print("(위험)");
			}
			System.out.println(temperature);
		}*/

		Scanner input = new Scanner(System.in);
		double[] temperatures = new double[3];

		for (int i = 0; i < temperatures.length; i++) {
			System.out.print("체온을 입력하세요: ");
			temperatures[i] = input.nextDouble();
		}
		// for-each사용
		for (double temperature : temperatures) {
			if (temperature >= 37) {
				System.out.println("(위험)" + temperature);
			} else {
				System.out.println(temperature);
			}
		}

		// 실습
		String[] fruits = { "바나나", "딸기", "포도", "사과", "키위" };
		System.out.print("과일 이름을 입력해주세요 : ");
		String fruitInput = input.next();

		for (int i = 0; i < fruits.length; i++) {
			// 입력받은 값과 for문으로 배열을 하나씩 비교
			if (fruitInput.equals(fruits[i])) {
				System.out.println(fruitInput + "가(이) 있습니다.");
			}
		}

		/*
		 * // 있는지 없는지를 확인하는 for문 - 있는지 없는지를 확인할 때는 보통 for문을 사용한다. boolean isFruit =
		 * false; for (int i = 0; i<fruits.length; i++) { // 입력받은 값과 for문으로 배열을 하나씩 비교
		 * if(fruitInput.equals(fruits[i])) { isFruit = true; break; } } if (isFruit) {
		 * System.out.println(fruitInput + "가(이) 있습니다."); }else {
		 * System.out.println("없습니다."); }
		 */

		/*
		 * 내 코드 Scanner input = new Scanner(System.in); String[] fruits = {"바나나", "딸기",
		 * "포도", "사과", "키위"}; System.out.println("과일 이름을 입력하세요 : "); String fruit =
		 * input.next(); if(fruit.equals(fruits[0]) System.out.println(fruit +
		 * "이 있습니다.");
		 */
		
		
		

		
		// 22.08.03.(수)
		// 실습
		// 학생 수를 입력받고, 점수배열을 만든 후 성적 입력하기.
		
		System.out.print("학생 수를 입력하세요 : ");
		int num = input.nextInt();
		
		int[] students = new int[num]; //배열크기 입력
		for(int i=0; i<students.length; i++) {
			System.out.print( (i+1) + "번째 점수를 입력하세요 : "); 
			// 배열 요소에 인덱스를 통하여 직접 접근하여 값 할당
			students[i] = input.nextInt();
		}
		for(int score : students) {
			if(score>=60) {
				System.out.println(score);
			}
		}
					
		
		
		
		
	}

}
