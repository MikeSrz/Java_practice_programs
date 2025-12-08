import java.util.Objects;


public class Song implements Comparable <Song>{
	String title;
	String author;
	
	//Constructor que recibe título y autor como parámetro
	Song(String title, String author) {
		this.title = title;
		this.author = author;
	}
	Song(){
		this.title= "";
		this.author = "";
	}
	
	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(title, other.title) && author == other.author;
	}
	@Override
	//Orden natural por título
	public int compareTo(Song s) {
		return this.author.compareTo(s.author);
	}
	@Override
	public String toString() {
		return String.format("Song [title=%s, author=%s]", title, author);
	}
	
}
