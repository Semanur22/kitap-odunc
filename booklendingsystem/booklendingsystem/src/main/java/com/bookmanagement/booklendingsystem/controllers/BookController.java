package com.bookmanagement.booklendingsystem.controllers;


import com.bookmanagement.booklendingsystem.Services.BookService;
import com.bookmanagement.booklendingsystem.entities.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return  bookService.getAllBooks();
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book newBook){
        return bookService.save(newBook);
    }

    @GetMapping("/choose")  //kitap arayip secme sayfasi
    public List<Book> search(Book book, Model model, String keyword) {

        if(keyword!=null) {
            List<Book> list = bookService.getByKeyword(keyword);
            model.addAttribute("list", list);
            return list;
        }else {
            List<Book> list = bookService.getAllBooks();
            model.addAttribute("list", list);
            return list;}

    }


}
