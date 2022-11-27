package com.bookmanagement.booklendingsystem.controllers;

import com.bookmanagement.booklendingsystem.Services.BorrowBookService;
import com.bookmanagement.booklendingsystem.entities.BorrowBook;
import com.bookmanagement.booklendingsystem.requests.BorrowBookRequest;
import com.bookmanagement.booklendingsystem.requests.BorrowBookUpdateRequest;
import com.bookmanagement.booklendingsystem.responses.BorrowBookResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api/borrowBooks")
public class BorrowBookController {
    private BorrowBookService borrowBookService;

    public BorrowBookController(BorrowBookService borrowBookService) {
        this.borrowBookService = borrowBookService;
    }
    @GetMapping
    public List<BorrowBookResponse> getAllBorrowBooks(@RequestParam Optional<Long> personId, @RequestParam Optional<Long> bookId){
        return borrowBookService.getAllBorrowList(personId,bookId);
    }

    @PostMapping("/addBorrowBook")
    public BorrowBook lendBook(@RequestBody BorrowBookRequest newBorrowBookRequest){
        return borrowBookService.saveBorrowBook(newBorrowBookRequest);
    }

    @PutMapping("/update/{borrowBookId}")
    public BorrowBook updateBorrowBook(@PathVariable Long borrowBookId, @RequestBody BorrowBookUpdateRequest borrowBookUpdateRequest){
        return borrowBookService.updateBorrowBookById(borrowBookId,borrowBookUpdateRequest);

    }

    @DeleteMapping("/returnBook/{borrowBookId}")
    public void deleteOneBorrowBook(@PathVariable Long borrowBookId) {
        borrowBookService.deleteBorrowBookById(borrowBookId);
    }

    @GetMapping("/blackList")
    public List<BorrowBook> blackList(){
        return null;
    }

}
