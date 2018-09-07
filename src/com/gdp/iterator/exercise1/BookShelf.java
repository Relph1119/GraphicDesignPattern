package com.gdp.iterator.exercise1;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
	
	private ArrayList<Book> books;

	public BookShelf(int initialsize) {
		this.books = new ArrayList<Book>(initialsize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	public int getLength() {
		return books.size();
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this); 
	}

}
