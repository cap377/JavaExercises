package practice3;

public class Book implements Media {
	
	private String title;
	private String author;
	private String genre;
	
	public Book(String title, String author, String genre) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getGenre() {
		return this.genre;
	}
}
