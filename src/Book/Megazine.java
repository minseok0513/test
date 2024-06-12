package Book;

public class Megazine extends Book{
	private int no;
	Megazine(){}
	Megazine(String title, String author, int page, int n){
		super.setTitle(title);
		super.setAuthor(author);
		super.setPage(page);
		no=n;
	}
	public void setNo(int n) {
		no=n;
	}
	public int getNo() {
		return no;
	}
	public String getInfo() {
		return super.getInfo()+" "+no;
	}
}
