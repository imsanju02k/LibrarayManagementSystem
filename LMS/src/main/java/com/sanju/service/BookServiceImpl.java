package com.sanju.service;

import java.util.List;

import com.sanju.dao.BookDaoImpl;
import com.sanju.dao.IBookDao;
import com.sanju.dto.Book;



public class BookServiceImpl implements IBookService {

	IBookDao dao =new BookDaoImpl();

	@Override
	public String addBook(Book book) {
		return dao.addBook(book);
	}

	@Override
	public Book searchBook(Integer bid) {
		// TODO Auto-generated method stub
		return dao.searchBook(bid);
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		return dao.updateBook(book);
	}

	@Override
	public String deleteBook(Integer bid) {
		// TODO Auto-generated method stub
		return dao.deleteBook(bid);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public String autoUpdateBook(String bid) {
		// TODO Auto-generated method stub
		return dao.autoUpdateBook(bid);
	}
	
	
	
	
	
}
