package chap07_Object;

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.05.(금)
		// 객체의 생성
		Box myBox;
		myBox = new Box();
		
		// 객체 = 세상에 있는 객체(오브젝트)를 참고하여 만듦.
		//       ex) 자동차, 상자
		// 자바는 객체지향 언어이다 - 캠슐화
		// 캡슐화의 특징 : 값과 메소드가 함께 들어가 있다
		//              쉽게 바꿀 수 있다
		// 객체를 만들기 위해서 class 사용
		// class는 객체를 만드는 틀
		// 객체는 클래스를 통해 생성된 것
		
		// 미리 작성된 클래스 - String
		String name = new String("홍길동");
		// 객체 name은 .(도트)을 통해 메소드를 사용할 수 있다
		System.out.println(name.equals("홍길동"));
		
		// 직접 만든 클래스의 객체 Box에 접근하기
		// 참조형 변수로 사용, 이름으로 접근 - 주소출력
		System.out.println(myBox);
		// 객체에 접근 하는 방법 : 필드의 값에 접근해서 출력
		System.out.println(myBox.height);
		// 객체에 접근 하는 방법 : 메소드의 계산결과를 출력
		
		System.out.println(myBox.calVoume());
		
		// 만든 클래스의 객체 생성하기
		Student myStudent = new Student();
		System.out.println(myStudent.name);
		// 필드에 직접 접근해서 값 할당 (잘 사용하지 않음)
		myStudent.name = "홍길동";
		System.out.println(myStudent.name);
		myStudent.age = 30;
		System.out.println(myStudent.age);
		myStudent.grade = 3;
		myStudent.printGrade();
		
		// 다른 객체 생성
		Student myStudent1 = new Student();
		System.out.println(myStudent1.name);
		myStudent1.printGrade();
		
		// 변수에 들어가 있는 값 확인
		System.out.println(myStudent);
		System.out.println(myStudent1);
		
		
		// 2022.08.08.(월)
		// new와 생성자를 통해서 객체 생성
		// Box(50) 50의 값을 인수라고 부른다
		Box mybox2 = new Box(50);
		System.out.println(mybox2.calVoume());
		
		// 실습. 생성자 확인
		Student s1 = new Student();
		Student s2 = new Student("흥부"); // 이거 확인하기..! > 클래스의 생성자 중 가장 비슷한 넘을 먼저 찾는다!고 하심
		Student s3 = new Student("놀부",30,5);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name + s3.age + s3.grade);
		
		myBox.setWidth(50);
		myBox.printData();
		
		s1.setGrade(4);
		s1.printGrade();
		s2.printGrade();
					// return 값 30이 들어감
		System.out.println(s3.getAge());
		// 아래와 같이 출력되는 것과 동일
		//System.out.println(30);
		
		s1.printLevel();
		s2.printLevel();
		
		// 클래스를 이용하여 객체 생성
		NumCheck num = new NumCheck();
		
		// 생성된 객체를 통해서 메소드 실행
		// 각각의 메소드에 따라서 인수값 작성
		num.setNum(-10);
		num.checkNum(); // 메소드는 값이 없어도 무조건 ()괄호를 넣어서 '메소드'임을 알려주어야 함
		// 그렇게 하지 않는다면 메소드가 아닌 필드로 접근하게 됨

		
		// Math -  스캐너처럼 값을 가져와줌
		// random의 범위 0< random <1
		System.out.println(Math.random()*10);
		// 다양한 난수의 값을 받아올 수 있음
		
		// 업다운 게임 - 내가 쓴 코드
		RandomUD upDown = new RandomUD();
		upDown.getRandomNum((int) (Math.random()*100)+1);
		upDown.checkUserGuess(68);
		upDown.checkNum();
		
		
		
		// 2022.08.10.(수)
		// random의 범위 0< random() <1
		System.out.println(); //????? 왜 다르지?
		
		// 여기서부터
		// 메소드 매개변수로 전달
		//기초형
		int x=5;
		Box box4 = new Box();
		// 변수 x를 넣어 값이 복사되어 들어가는지 확인
		System.out.println(box4.plus(x));
		// 아래x 값이 바뀌지 않았으면 값이 복사되어 들어간 것.
		System.out.println(x);
		
		// 참조형 - 주소값이 복사되어 들어간다 > 객체에 바로 접근해서 수정
		Box cloneBox = new Box(50);
		System.out.println(cloneBox.calVoume());
		
		box4.cloneBox(cloneBox);
		// 주소값으로 접근했기 때문에, 값이 수정되어 출력
		System.out.println(cloneBox.calVoume());
		
		// 참조형은 수정이 되지만, 기초형은 수정이 되지 않는다...
		
		// 기초형의 값을 넣고 수정해서 사용하고 싶은 경우
		int y = 10;
		// 매소드의 return값을 동일한 변수가 받아와서 저장한다.
		y = box4.plus(y);
		System.out.println(y);
		
		Box box5 = new Box(30);
		System.out.println(box4.equalsBox(cloneBox));
		System.out.println(box4.equalsBox(box5));
		
		if(box4.equalsBox(cloneBox)) {
			System.out.println("크기가 같은 박스입니다");
		}else {
			System.out.println("크기가 다른 박스입니다");
		}
		
		// 정적 변수는 각각의 객체를 통해서 출력할 수 있다
		System.out.println(box4.boxCount);
		System.out.println(box5.boxCount);
		// 정적 변수는 클래스를 통해서 출력할 수 있다
		System.out.println(Box.boxCount);
		
		Box box6 = new Box();
		System.out.println(box4.boxCount);
		
		// 다른 클래스에서 만든 정적 변수(상수)
		System.out.println(Math.PI);
		
		// 실습내용 확인을 위한 정적변수
		System.out.println(Student.numStudent);
		// 정적메소드를 이용한 출력
		System.out.println(Box.getBoxCount());
		
		// Math의 정적 메소드 사용
		// sqrt() 제곱근을 구하는 메소드
		// 객체를 가지고 있지 않기에, 값을 받아와서 계산
		System.out.println(Math.sqrt(16));
		
		System.out.println(Student.getStudentCount());
		
		// 정적 메소드를 가진 클래스 확인.
		
		System.out.println(MathNum.intAdd(10, 4));
		System.out.println(MathNum.intMax(10, 4));
		
		//(4123/134, 6234/231)와 (673/3, 424/2)에서의 각각의 큰 값을...
		int maxA = MathNum.intMax(4123/134, 6234/231);
		int maxB = MathNum.intMax(673/3, 424/2);
		int sum = MathNum.intAdd(maxA, maxB);
		System.out.println(sum);
				
		// 정적변수를 이용한 상수
		// Box.MAX_BOX_LINE=10; >final키워드로 수정할 수 없다
		System.out.println(Box.MAX_BOX_LINE);
	
	}
	
	

}
