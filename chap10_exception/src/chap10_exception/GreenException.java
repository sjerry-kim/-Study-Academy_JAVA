package chap10_exception;

public class GreenException extends Exception {
	@Override
	public String toString(){
		return "그린에서 만든 예외입니다";
	}
}
