package chap07_2_Array;

import java.util.Scanner;

import chap07_2getset.AnimalCard;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2022.08.11.(목)
		// 직접 작성한 클래스를 배열에 넣어서 사용 가능
		// 지금 작성하는 객체는 배열의 객체
		AnimalCard[] cards = new AnimalCard[10];
		
		// 배열 안의 객체는 따로 생성해야함
		// 직접 작성한 클래스를 배열로 만들어서 쓸 때 new를 2번 사용
		// 1. 배열생성 2. 배열 안의 각각의 클래스객체 생성
		cards[0] = new AnimalCard();
		System.out.println(cards[0].getMonth());
		
		// 클래스객체의 배열의 경우 for문을 이용하여 한 번에 여러개의 클래스 객체를 생성할 수 있음
		for (int i=0; i<cards.length; i++) { // 배열 안의 클래스를 하나하나 생성하는 것은 비효율 적임 > for문 사용
			cards[i] = new AnimalCard(); // 각각의 인덱스 안에 새로운 객체를 생성
		}
		cards[0].setAnimal("강아지");
		cards[0].printAnimalCard();
		
		// 콘솔에서 값 입력받아서 넣어주기
		Scanner input = new Scanner(System.in);
		System.out.print("동물의 종류와 이름과 개월을 띄워쓰기로 작성하세요 : ");
		String animal = input.next();
		String name = input.next();
		int month = input.nextInt();
		
		cards[1].setAnimal(animal);
		cards[1].setName(name);
		cards[1].setMonth(month);
		cards[1].printAnimalCard();
		
		System.out.println();
		// AnimalCard클래스의 객체 배열을 만들고, 그 안에 값을 넣으세요
		// 배열의 길이는 3
		// 값은 아무 값으로 넣우주시면 됩니다
		// 내용 확인 printAnimalCard()
		
		AnimalCard[] animalCards = new AnimalCard[3];
		
		for(int i=0; i<animalCards.length; i++) {
			animalCards[i] = new AnimalCard();
		}
		
		animalCards[0].setAnimal(animal);
		animalCards[0].setName(name);
		animalCards[0].setMonth(month); // 이 값이 왜 앞에서 scacnner로 받은 값이 나오는 거지...?🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔
		
		animalCards[1] = new AnimalCard("강아지", "백구", 26);
		animalCards[2] = new AnimalCard("햄스터", "햄찌", 26);
		
		// 내용 출력을 위한 for-each문
		for (AnimalCard card : animalCards) {
			card.printAnimalCard();
		}
		
		/* 내가 쓴 코드
		animalCards[0].setAnimal("갱얼쥐");
		animalCards[0].setName("쿵이");
		animalCards[0].setMonth(10);
		animalCards[0].pirntAnimalCard();
		
		animalCards[1].setAnimal("고양이");
		animalCards[1].setName("점프");
		animalCards[1].setMonth(12);
		animalCards[1].pirntAnimalCard();
		
		animalCards[2].setAnimal("고양이");
		animalCards[2].setName("병철이");
		animalCards[2].setMonth(15);
		animalCards[2].pirntAnimalCard();
		*/
		
		// 정적 변수, 메소드 출력
		System.out.println(AnimalCard.getCardCount());
		
	}
}
