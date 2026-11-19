package mylab.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library{
	
	private String name;
	private List<Book> books = new ArrayList<>();
	private int AllCount = 0;
	private int AvailableBookCount = 0;
	private int UnBookCount = 0;
	
	
	public Library() {
		
	}
	
	public Library(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	
	public Book findBookByTitle(String title) {
		for(Book b : books) {
			if(b.getTitle().equals(title)) {
				return b;
			}
		}
		return null;
		
	}
	public List<Book> findBooksByAuthor(String author) {
		
		List<Book> AuthorBookList = new ArrayList<>();
		
		for(Book b : books) {
			if(b.getAuthor().equals(author)) {
				AuthorBookList.add(b);
			}
		}
		return AuthorBookList;
	}
	public Book findBookByISBN(String isbn) {
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				return b;
			}
		}
		return null;
	}
	
	
	public boolean checkOutBook(String isbn) {
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				return b.checkOut();
			}
		}
		return false;
		
	}
	public boolean returnBook(String isbn) {
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				return b.returnBook();
			}
		}
		return false;
	}
	
	
	public List<Book> getAvailableBooks() {
		List<Book> AvailableBookList = new ArrayList<>();
		for(Book b : books) {
			if(b.getIsAvailable().equals("가능")) {
				AvailableBookList.add(b);
			}
		}
		return AvailableBookList;
		
	}
	public void getAllBooks() {
		for(Book b : books) {
			b.toString();
		}
		
	}
	
	public int getTotalBooks() {
		
		this.AllCount = 0;
		
		for (Book b : books) {
			this.AllCount += 1;
		}
		return this.AllCount;
	}
	public int getAvailableBooksCount() {
		
		this.AvailableBookCount = 0;
		
		for(Book b : books) {
			if(b.getIsAvailable().equals("가능")) {
				this.AvailableBookCount += 1;
			}
		}
		return this.AvailableBookCount;
	}
	public int getBorrowedBooksCount() {
		
		this.UnBookCount = 0;
		
		for(Book b : books) {
			if(b.getIsAvailable().equals("불가능")) {
				this.UnBookCount += 1;
			}
		}
		return this.UnBookCount;
	}

}
