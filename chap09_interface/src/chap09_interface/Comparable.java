package chap09_interface;

public interface Comparable {
	// 추상메소드
	// Object는 모든 클래스의 수퍼클래스이므로 모든 객체가 다 들어갈 수 있다
	// (다형성) : 하나의 데이터타입의 참조변수에 여러개의 객체가 들어갈 수 있음
	public int compareTo(Object otherObject); // 어떤 객체가 들어올지 모를때 보편적으로 씀

}
