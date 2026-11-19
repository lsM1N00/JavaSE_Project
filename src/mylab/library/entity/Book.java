package mylab.library.entity;

public class Book extends Object {
	
	private String title;
	private String author;
	private String isbn;
	private int publishYear;
	private String isAvailable;
	
	public Book() {
	}
	
	public Book(String title, String author, String isbn, int publishYear) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishYear = publishYear;
		this.isAvailable = "가능";
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public boolean checkOut() {
		if (this.isAvailable == "가능") {
			this.isAvailable = "불가능";
		}
		return true;
	}
	
	public boolean returnBook() {
		if(this.isAvailable == "불가능") this.isAvailable = "가능";
		
		return true;
	}
	
	@Override
	public String toString() {
		return "책 제목: " + this.title + "   저자: " + this.author + "   ISBN: " + this.isbn
				+ "   출판년도: " + this.publishYear + "   대출 가능 여부: " + this.isAvailable;
	}
	

}
