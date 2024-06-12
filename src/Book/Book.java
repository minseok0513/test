package Book;

public class Book {
	private String title, author;
	private int page;
	Book(){}
	Book(String t, int p, String a){
		title=t;
		page=p;
		author=a;
	}
	public void setBook(String t, int p, String a) {
		title=t;
		page=p;
		author=a;
	}
	public void setTitle(String a) {
		title=a;
	}
	public void setPage(int c) {
		page=c;
	}
	public void setAuthor(String b) {
		author=b;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPage() {
		return page;
	}
	public String getInfo() {
		return title+" "+author+" "+page;
	}
}
