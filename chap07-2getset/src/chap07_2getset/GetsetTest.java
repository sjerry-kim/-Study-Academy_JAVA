package chap07_2getset;

public class GetsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.11.(목)
		AnimalCard card1 = new AnimalCard();
		card1.setAnimal("강아지");
		System.out.println(card1.getAnimal());
		System.out.println(card1.getName());
		System.out.println(card1.getMonth());
		
		AnimalCard card2 = new AnimalCard("고양이", "나비", 10); 
		card2.printAnimalCard(); // 메소드로 접근
		card1.printAnimalCard();
		


	}

}
