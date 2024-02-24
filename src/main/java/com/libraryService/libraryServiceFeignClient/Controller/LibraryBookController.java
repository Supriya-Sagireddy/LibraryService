package com.libraryService.libraryServiceFeignClient.Controller;

import com.libraryService.libraryServiceFeignClient.Model.Book;
import com.libraryService.libraryServiceFeignClient.Service.LibraryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryBookController {
    @Autowired
    LibraryBookService libraryBookService;
    @GetMapping("/books")
    public List<Book> getAllBooks(){
       return libraryBookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(int id){
        return libraryBookService.getBookById(id);
    }
    @PostMapping("/books")
    public String addBook(Book book){
        libraryBookService.addBook(book);
        return "Book Added ";
    }
    @PutMapping("/books/{id}")
    public String updateBook(int id, Book book){
        libraryBookService.updateBook(id,book);
        return "Book Updated";
    }
    @DeleteMapping("/books/{id}")
    public String delBook(int id){
        libraryBookService.delBook(id);
        return "Book Deleted";
    }
}
