package chapter08_abstract;
// 2022.08.17.(수)
public abstract class Mammal extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("이동한다");
	}
	
	public abstract void sound();

}
