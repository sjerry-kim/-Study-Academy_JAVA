package chapter08_abstract;

// 2022.08.17.(수)
// abstract을 통해서 추상 클래스 선언
public abstract class Shape {
	// 필드값 사용 가능
	private int x, y;
	
	// 일반 메소드 선언
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드 선언 - 추상 메소드가 하나라도 있으면 추상 클래스라고 일컫는다
	// abstract 키워드를 사용해서 몸체(중괄호) 없이 이름만 작성
	public abstract void draw();
	
	// {} 블록의 내용은 없지만 가져올 매개변수는 지정할 수 있다
	public abstract void print(String word);
}
