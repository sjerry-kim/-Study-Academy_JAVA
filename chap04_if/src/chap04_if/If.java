package chap04_if;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문
		// If문 - 한 줄 일 때 
		// () 안의 조 건이 참(true)일때 실행이 된다
		if (true)
			System.out.println("코드가 실행됩니다");
		// if문 바깥에 있는 코드는 if문의 영향을 받지 않는다
		System.out.println("프로그램이 종료되었습니다");
		
		int age = 9;
		if (age >= 6) {
			System.out.println(age+"세입니다");
			System.out.println("놀이기구를 탈 수 있습니다");
		}
		
		// 실습
		int num = 11;
		if (num > 10) {
			System.out.println("참입니다 : " + num);
			System.out.println("프로그램이 종료되었습니다.");
		}
		
		//실습 If문을 연달아 사용하는 경우
		boolean eat = true;
		if (eat) // 이건 왜지?
			System.out.println("밥을 먹었다");
		
		int time = 9;
		if (time<10)
			System.out.println("택시를 탄다");
		System.out.println("프로그램이 종료되었습니다");
		
		// if-else : 참일 때와 거짓일 때 다른 코드 실행
		if(false)
			System.out.println("참입니다");
		else
			System.out.println("거짓입니다");
		
		//if-else문 조건식과 여러줄 출력
		int age1 = 3;
		if (age1>6) {
			System.out.println("축하합니다");
			System.out.println("놀이기구를 탈 수 있습니다");
		} 
		 else {
			System.out.println("놀이기루를 탈 수 없습니다");
			System.out.println("나중에 또 오세요");
			
		}
		
		// num1의 값을 초기화 하고
		// num1이 0이 아니면, 10을 num1로 나눈값을 출력
		// num1이 0이면(위의 조건과 반대: else), "입력한 값이 0입니다"를 출력
		
		int num1 = 5;
		if (num1 != 0)
			System.out.println(10/num1);
		else 
			System.out.println("입력한 값이 0입니다");
		
		
		// word를 초기화 하고
		// word가 "종료:"와 같다면, "시스템을 종료합니다"라고 출력
		// 아니면, "시스템을 유지합니다"라고 출력
		String word = "종료";
		if (word == "종료")
			System.out.println("시스템을 종료합니다");
		else
			System.out.println("시스템을 유지합니다");
		
		// 삼항 연산자
		// 한 줄에다가 참/거짓을 확인하고 싶을 때 사용함
		// 삼항연산자의 결과값은 조건에 따른 참/거짓값이다
		
		int x = 10;
		int y = 11;
		// 삼항연산자, 연산자의 특징 : 계산을 하고 그 결과값을 출력/ 되돌려줌
		int maxNum = x>y? x:y;
		System.out.println( maxNum);
		
		//실습
		int num3 = 10;
		String state = num3>0? "양수":"음수";
		System.out.println(state);
		
	//22,07.28.(목)	
		// 실습 코드값을 이용한 성별 확인
		// 1,3 들어왔을 때 - 남자입니다
		// 2,4 들어왔을 때 - 여자입니다
		int code = 2;
		if (code == 1 || code == 3) {
		 System.out.println("남자입니다");
		}
		else {
			// (추가!) 중첩 if문 (조건문)
			if (code == 2 || code == 4 ){
			System.out.println("여자입니다");
			}
		} // (추가 전) 그러나 5이상을 입력해도 '여자입니다'가 출력됨..
		  // (추가 전) 이에 if중첩문을 사용해야함
		
		// 연속적인 if - else if -else
		// 위의 주첩 if로 작성한 코드를 연속적인 if로 작성하기
		if (code == 1 || code == 3) {
			System.out.println("남자입니다");}
		// else if를 통해서 다른 조건문을 작성해 줄 수 있다
		else if (code == 2 || code == 4) {
			System.out.println("여자입니다");}
		else {//여기서 else문은 바로 위의 조건들이 거짓(false)일 때 실행
			System.out.println("없는 코드입니다");}
			 
		//실습 연속적 if- else if - else
		//음수, 양수, 0 판별하기
		int num2= 1;
		
		if (num2>0)
			System.out.println("양수입니다");
		else if (num2<0)
			System.out.println("음수입니다");
		else
			System.out.println("0입니다");
		
		
		//실습 switch - 요일 출력
		int date = 7;
		switch (date) {
		case 0:
			System.out.println("월요일입니다");
			break;
		case 1:
			System.out.println("화요일입니다");
			break;
		case 2:
			System.out.println("수요일입니다");
			break;
		case 3:
			System.out.println("목요일입니다");
			break;
		case 4:
			System.out.println("금요일입니다");
			break;
		case 5:
			System.out.println("토요일입니다");
			break;
		case 6:
			System.out.println("일요일입니다");
			break;
		default :
			System.out.println("없는 요일입니다");
			break;
		}
	
		// 실습 switch - 학점출력
		int score = 74;
		int scoreCase = score/10;
		switch (scoreCase){
			case 10:
			case 9:
				System.out.println("A학점입니다");
				break;
			case 8:
				System.out.println("B학점입니다");
				break;
			case 7:
				System.out.println("C학점입니다");
				break;
			default :
				System.out.println("F학점입니다");
				break;
		}
		
	}

}
