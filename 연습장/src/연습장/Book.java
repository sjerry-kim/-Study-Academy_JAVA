package 연습장;

public class Book {
	// 내가 쓴 코드...^^
	//필드
	String title;
	int page;
	
	//생성자
	Book(){
		this.title = "제목미정";
		this.page = 0;
	}
	
	Book(String title, int page){
		this.title = title;
		this.page = page;
	}

	// 메소드
	void setTitle(String title) {
		this.title = title;
		System.out.println(title);
	}
	
	String getTitle() {
		return this.title;
	}
	
	boolean checkPageCount(int page){
		this.page = page;
		if (page==0) {
			System.out.println("false");
		}
		return true;

	}
	
	
	
	
	
	
	
}