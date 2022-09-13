package chap06_array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.02.(화)-6교시
		// 배열 확인	
		int[] numbers; // 배열의 참조변수 선언
		numbers = new int[6]; //배열의 생성...박스 6개의 배열을 생성함
		int[] numbers2 = new int[6]; // 배열생성
		int[] numbers3 = numbers2; // 배열의 주소
		
		// {} 중괄호를 통해서 값을 바로 입력(초기화)
		int[] scores= {10, 20, 40, 70};
		int index = 0;
		
		// [] 대괄호를 이용하여 배열의 값 접근
		// [] : 인덱스 (0~) : 정수값(변수, 식)
		numbers[0] = 1;
		System.out.println(scores[index+1]); // 
		System.out.println(scores); // 배열 자체로는 그대로 출력되지 않는다. 대신 주소가 출력된다.
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(numbers3); //주소가 같기 때문에
		
		numbers2[0]=5;
		System.out.println(numbers2[0]);
		System.out.println(numbers3[0]);
		
		// for문을 이용한 배열 요소 출력
		// 배열의 길이를 직접입력해 줄 수 있지만 length를 사용해서 쓸 수 있다
		// 배열에 직접 접근하는 방법
		for (int i=0; i<scores.length; i++) { // 인덱스는 정수이기 때문에 int를 사용한다!
			System.out.println(scores[i]);
		}
		// for-each 루프
		// 배열 안에 있는 요소를 score에 담아서 사용할 수 있다
		// 배열 안에 있는 값을 가져오는(받아오는) 것이기 때문에 배열의 값을 수정할 수 없다( 위의 코드와 구별해서 사용)
		for (int score : scores) { 
			score = 10;
			System.out.println(score);
		}
		
		// 실습 : double배열 초기화
		double[] heights = {165.3, 170.2, 158.0, 182.0, 179.3};
		double sum = 0;
		for(int i=0; i<heights.length; i++) { // for each로도 작성 가능함
			System.out.println(heights[i]);
			sum += heights[i];
		}
		System.out.println("학생 키의 평균 : " + sum/heights.length);
		
		
		
		
		// 2022.08.04.(목)
		//2차원 배열
		// 2차원 배열의 선언과 생성
		int[][] numArray = new int[3][5];
		// 내용 확인을 위해 중첩 반복문 사용
		int count = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				numArray[i][j] = count;
				count++;
				System.out.print(numArray[i][j] + " ");
			}
			System.out.println();
		}
		numArray[0][0] = 100; // 인덱스로 값을 바꿔줄 수 있다
		System.out.println("프로그램을 종료합니다");
		
		// 2차원 배열 초기화
		int[][] tableArray 
		= {{10, 20, 30},{40, 50, 60, 65},{70, 80, 90}};
		
		for(int i=0; i<tableArray.length; i++) {
			for(int j=0; j<tableArray[i].length; j++) {
				System.out.print(tableArray[i][j]+" ");
			}
			System.out.println();
		}
		
		// 실습 : 2차원 배열 단어장
		
		String[][] words = {{"chair","의자"},
				{"computer","컴퓨터"},{"integer","정수"}};
		
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length; j++){
				System.out.print(words[i][j] + " ");
			}
			System.out.println();
		}
		
		//선택 정렬 코드
		int[] numberSort = {5, 2, 6, 1};
		int temp, least;
		
		for (int i=0; i<numberSort.length-1; i++) {
			least = i; 
			for(int j=i+1; j<numberSort.length; j++) {
				// 값들을 하나씩 비교하면서 최소값 확인
				if(numberSort[j]<numberSort[least]) {
					least = j; // 현재 값이 더 작다면 인덱스값을 넣어줌
				}
			}
			// 반복문이 끝난 후에 가장 작은 값의 위치를 바꿔줌
			temp = numberSort[i]; //첫번째의 값을 저장
			// 첫번째 자리에 가장 작은 값 할당
			numberSort[i] = numberSort[least]; 
			numberSort[least] = temp;
		}
		
		
		
	}
}
