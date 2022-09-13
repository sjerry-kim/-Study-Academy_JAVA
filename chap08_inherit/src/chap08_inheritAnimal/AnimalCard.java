package chap08_inheritAnimal;

public class AnimalCard {
	// 2022.08.11.(목)
	// 필드
	private String animal;
	private String name;
	private int month;
	
	// 정적 변수 cardCount; - private
	private static int cardCount = 0; // 바로 초기화
	
	// 정적 변수로 만든 상수 MAX_CARD; - public
	public static final int MAX_CARD = 100;
	
	// 정적 메소드 getCardCount - public
	public static int getCardCount() {
		return cardCount;
	}
 	
	// 생성자
	public AnimalCard() {
		this.animal = "";
		this.name = "";
		this.month = 0;
		
		cardCount++;
	}
	
	public AnimalCard(String animal, String name, int month) {
		this.animal = animal;
		this.name = name;
		this.month = month;
		
		cardCount++;
	}
	
	// 접근자와 설정자
	public String getAnimal() {
		return  this.animal;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMonth() {
		return month; // this를 붙여도 되고, 필드이름만 붙여도 잘 실행된다
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	// 즉석 실습, 동물종류와 이름과 개월수를 출력하는 메소드
	// ! get 메소드를 이용해서 이름값을 가져오자
	// 출력내용 : 동물종류 : animal , 이름 : name , month개월
	
	public void printAnimalCard() {
		this.animal = getAnimal();
		this.name = getName();
		this.month = getMonth();
		System.out.println("동물종류 : " + getAnimal() + " , " + "이름 : " 
							+ getName() + " , " + getMonth() + "개월");
	}
	
	
	

}
