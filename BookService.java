package com.book.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.dao.BookDao;
import com.book.model.Book;
@Component
public class BookService {
	   
	
	
	@Autowired
	BookDao bookDao;
	
	public Book create(Book book) {
		
		return bookDao.create(book);
	}
	public ArrayList<Book> getAll(){
		return bookDao.getAll();
		
	}
	
	
	public Book get(int bookName) {
		return bookDao.get(bookName);
	}
	
	public void delete(int bookName) {
		bookDao.delete(bookName);
	}
		
	public void update(int bookName,Book book) {
		bookDao.update(bookName,book);
	}

}
