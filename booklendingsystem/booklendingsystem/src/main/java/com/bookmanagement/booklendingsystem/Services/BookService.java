package com.bookmanagement.booklendingsystem.Services;

import com.bookmanagement.booklendingsystem.entities.Book;
import org.springframework.stereotype.Service;
import com.bookmanagement.booklendingsystem.repositories.BookRepository;

import java.util.List;
@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book save(Book newBook){
        return bookRepository.save(newBook);
    }

    public Book findByBookId(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public List<Book> getByKeyword(String keyword){
        return bookRepository.findByKeyword(keyword);
    }
}
