package pratice04;

public class Book {
	// 2022.08.16.(화)
	// 팰드
	private String title;
	private String author;
	private int page;
	private boolean checkOut;
	
	// 정적 필드
	private static int bookCount=0;
	
	// 정적 메소드
	public static int getBookCount() {
		return bookCount;
	}
	
	// 생성자
	// 디폴트 생성자
	public Book() {
		title="미정";
		author="미상";
		page=0;
		checkOut = false;
		bookCount ++;
	}
	
	// 매개변수를 갖는 생성자
	public Book(String title, String author, int page) {
		this.title = title;
		this.author  = author;
		this.page = page;
		this.checkOut = false;
		bookCount++;
	}
	
	// 메소드
	public boolean getCheckOut() {
		return checkOut;
	}
	
	// checkOut 값이 true일때,
	// false로 값을 바꾸고, "책을 반납하였습니다" 출력
	// false일 때: true로 바꾸고 "책을 대여했습니다" 출력	
	public void isCheckOut() {
		if(checkOut) {
			checkOut = false;
			System.out.println("책을 반납하였습니다");
		}else {
			checkOut = true;
			System.out.println("책을 대여하였습니다");
		}
	}
	
	// checkOut이 false : "author의 title책이 현재 있습니다"
	// checkOut이 true : "author의 title책이 대여중입니다"
	public void printBook() {
		if(!checkOut) {
			System.out.println(author + "의 " + title + "책이 현재 있습니다");
		}else {
			System.out.println(author + "의 " + title + "책이 대여중입니다");
		}
	}
	/* 내가 장성한 코드
	// 필드
	private String title;
	private String author;
	private int page;
	private boolean checkOut;
	
	// 정적필드
	public static int bookCount = 0;
	
	// 정적메소드
	public static int getBookCount() {
		return bookCount;
	}
	
	// 생성자
	public Book() {
		title = "미정";
		author = "미상";
		page = 0;
		checkOut = false;
		
		bookCount++;
	}
	
	public Book(String title, String author, int page) {
		this.title = title;
		this.author  = author;
		this.page = page;
		
		bookCount++;
	}
	
	public Book( boolean checkOut) {
		this.checkOut = checkOut;
		checkOut = false;
		
		bookCount++;
	}
	
	// 메소드
	public boolean getCheckOut() {
		return checkOut;
	}
	
	public void isCheckOut() {
		if(checkOut) {
			checkOut = false;
			System.out.println("책을 반납하였습니다");
		}else {
			checkOut = true;
			System.out.println("책을 대여하였습니다");
		}
	}
	
	public void printBook() {
		if(!checkOut) {
			System.out.println(author+"의 " + title + "책이 현재 있습니다");
		}else {
			System.out.println(author+"의 " + title + "책이 대여중입니다");
		}
	}
	*/
	
}
