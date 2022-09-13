package chap07_Object;

public class Student {
	// 2022.08.05.(굼)
	// 필드값
	// 2022.08.08.(월)
	// private은 클래스 안에서만 사용 가능
	// public은 클래스 안에서 뿐만이 아니라 객체를 통해서도 접근 가능
	// 값을 적어주지 않았을 때 package까지 접근 가능
	public String name;
	public int age;
	public int grade;
	
	// 2022.08.10.(수)
	// 정적 변수 - 생성된 학생들의 수를 저장
	// Student 클래스가 없는 경우 
	static int numStudent = 0;
	
	// 2022.08.08.(월)
	// 실습1
	// 매개변수를 갖지 않는 생성자 
	// 이름(홍길동) 나이 학년 초기화
	
	Student(){
		this.name = "홍길동";
		this.age = 0;
		this.grade = 0;
		
		numStudent++;
	}
	
	// name값을 매개변수로 받아오는 생성자
	Student(String name){
		this.name = name;
		this.age = 0;
		this.grade = 0;
		
		numStudent++;
	}
	
	// 매개변수를 여러개 받아와서 사용할 수 있다... 받아올 값이 없다면 매개변수를 입력하지 않아도 된다
	Student(String name, int age, int grade){ // 필드의 이름과 비슷한 이름으로 값을 받아오게 됨...
		this.name = name; // this를 통해서 어디에 잇는 변수인지 확실히 해줘야함
		this.age = age;
		this.grade= grade;
		
		numStudent++;
	}	
	
	// 메소드
	void printGrade() {
		System.out.println(grade);
	}
	
	// 실습
	// return을 통해서 나이값을 돌려주는 메소드
	int getAge() { // int : 반환값과 동일한 자료형을 기입함
		return this.age;
	}
	
	// 매개변수를 통해서 학년을 수정하는 메소드
	void setGrade(int grade) {
		this.grade =grade; // 메인으로 가져갈 내용을 리턴을 통해서 내보낼 수 있다
	}
	
	// if, for, while 사용가능
	void printLevel() {
		// grade에 따라서 고학년 저학년을 나눠서 출력
		// 3학년 초과는 고학년
		// 3학년 이하는 저학년
		if (this.grade >3) {
			System.out.println("고학년입니다");
		}
		else {
			System.out.println("저학년입니다");
		}
	}

	// 정적 메소드 studentCount를 return하는 메소드
	static int getStudentCount() {
		return numStudent;
	}
	

	
	
}
