package test01;

public class Student {
	String name;
	int number;
	int score;
	
	Student(){
		this.name = "홍길동";
		this.number = 0;
		this.score = 0;		
	}
	
	Student(String name, int number){
		this.name = name;
		this.number = number;
		this.score = 0;
	}

	void setScore(int score) {
		this.score = score;
	}
	
	int getScore() {
		return this.score;
	}
	
	void printResult() {
		// 60점 이상일때 합격이 출력되고
		// 미만일때 불합격이라고 출력하시오.
		if(this.score>=60) {
			System.out.println(this.name + "님은 합격입니다");
		}else {
			System.out.println(this.name + "님은 불합격입니다");
		}
	}
}
