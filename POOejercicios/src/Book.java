
public class Book {
	private String title;
	private String author;
	private String editorial;
	private int releaseYear;
	private String isbn;
	private int numPages;
	private double prize;
	private int amount;
	
	Book(String title, String author, String editorial, int releaseYear, String isbn, int numPages, double prize, int amount) {
		this.title = title;
		this.author = author;
		this.editorial = editorial;
		this.releaseYear = releaseYear;
		this.isbn = isbn;
		this.numPages = numPages;
		this.prize = prize;
		this.amount = amount;
	}
	Book(){
		String DEFLT = "Sin catalogar";
		this.title = DEFLT;
		this.author = DEFLT;
		this.editorial = DEFLT;
		this.releaseYear = 0;
		this.isbn = DEFLT;
		this.numPages = 0;
		this.prize = 0.0;
		this.amount = 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String showInfo() {
		return String.format(
				"Book [title=%s, author=%s, editorial=%s, releaseYear=%s, isbn=%s, numPages=%s, prize=%s, amount=%s]",
				title, author, editorial, releaseYear, isbn, numPages, prize, amount);
	}
	
	
	
}
