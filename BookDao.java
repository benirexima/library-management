package com.book.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.book.model.Book;

@Component
public class BookDao {
	ArrayList<Book> library = new ArrayList<>();
	
	public Book create(Book book) {
		library.add(book);
		return book;
	}
	public ArrayList<Book>getAll(){
		return library;
	}
	public  Book get(int bookName)
	{
//		for(int bookName : library) {
//			
//			System.out.println("bookName=" + bookName);
//			
//		}
		
			
		return library.get(bookName);
	}
	public void delete (int bookName) {
		library.remove(bookName);
	}
public void update(int bookName,Book book) {
	library.set(bookName, book);
}
}
