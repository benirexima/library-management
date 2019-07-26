package com.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.BookService;

@RequestMapping("library")
@RestController

public class BookController {
	

	
	@Autowired
	BookService bookservice;
	
	@PostMapping("create")
	private Book create(@RequestBody Book book) {
		
		return bookservice.create(book);
		
	}

	@GetMapping("get/{bookName}")
	private Book get(@PathVariable("bookName")int bookName ) {
		return bookservice.get(bookName);
	}

	
	@GetMapping("getall")
	private ArrayList<Book>getAll(){
		return bookservice.getAll();
	}

	@PostMapping("update/{bookName}")
	private void update(@PathVariable("bookName")int bookName,@RequestBody Book book) {
		bookservice.update(bookName,book);
	}
	
	
	@DeleteMapping("delete/{bookName}")
	private void delete(@PathVariable("bookName")int bookName) {
		bookservice.delete(bookName);
	} 
	

}
