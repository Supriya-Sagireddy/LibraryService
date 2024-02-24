package com.libraryService.libraryServiceFeignClient.Service;

import com.libraryService.libraryServiceFeignClient.Model.Book;
import com.libraryService.libraryServiceFeignClient.Repository.LibraryBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LibraryBookService {
    @Autowired
    LibraryBookRepo libraryBookRepo;
    public List<Book>getAllBooks(){
        return libraryBookRepo.getAllBooks();
    }
    public Book getBookById(int id){
        return libraryBookRepo.getBook(id);

    }
    public String addBook(Book book){
        libraryBookRepo.addBook(book);
        return "Book Added Successfully";
    }
    public String delBook(int id){
        libraryBookRepo.deleteBook(id);
        return "Book Delted Successfully";
    }
    public String updateBook(int id, Book book){
        libraryBookRepo.updateBook(book, id);
        return "Book Updated Successfully";
    }

}
