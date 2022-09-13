package test0819;

public class Scores {
	// 필드
	private int korean;
	private int math;
	private int english;
	
	// 생성자
	public Scores() {
		korean = 0;
		math = 0;
		english = 0;
	}
	
	public Scores(int korean, int math, int english) {
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	// 메소드
	public int arvg() {
		int arvg = (this.korean + this.math + this.english)/3; 
		return arvg;
		// retrun(korean+math+english)/3; // 강사님 해설
	}

}
