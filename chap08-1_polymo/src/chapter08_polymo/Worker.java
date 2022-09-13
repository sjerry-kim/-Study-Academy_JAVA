package chapter08_polymo;

public class Worker extends People {
	// 2022.08.12.(금)
	// 필드
	private String job;
	private int careerMonth;
	
	// 메소드 
	// 실습 - 명시적, 묵시적 호출 확인
	// 디폴트 생성자(매개변수X) 묵시적 호출
	public Worker() {
		this.job ="";
		this.careerMonth = 0;
	}
	
	public Worker(String name, String gender, int age, 
			String job, int careerMonth) {
		super(name,gender, age);
		this.job = job;
		this.careerMonth = careerMonth;
	}
	// 모든 필드갑을 받아오는 생성자 명시적 호출
	

	// 메소드
	public int nextMonth(){	
		this.careerMonth++;
		return careerMonth;
	}
	
	// 슈퍼클래스의 메소드를 사용하는 메소드
	// selfIntro를 가져와서 출력하고, 아래 job입니다라고 함께 출력하는 메소드
	public void intro() {
		super.selfIntro(); // 밑에 골뱅이랑 안 겹치려고 super. 추가
		// 동일한 이름의 메소드가 있으므로 슈퍼클래스에서 받아옴을 명시
		System.out.println(job + "일을 하고 있습니다");
	}
	
	/* 내가 쓴 코드
	public void intro( String job) {
		this.selfIntro();
		this.job = job;
		System.out.println(job + "입니다");
	}
	*/
	
	// 점심시간 이후
	@Override
	public void selfIntro() {
		// name입니다. job 일을 하고 있습니다 를 출력
		System.out.println( name + "입니다 " + job + "일을 하고 있습니다");
	}
	
	// equals 메소드를만들어서 이름, 성별, 나이, 직업, 일한 개월이 같을 때 
	// true를 return하세요. (그 외에는 전부 false return)
	public boolean equals (Worker worker) {
		//
		if (name == worker.name && gender == worker.gender && age == worker.age
				&& job == worker.job && careerMonth == worker.careerMonth) {
			return true;
		}else {
			return false;
		}
	}
	
}
