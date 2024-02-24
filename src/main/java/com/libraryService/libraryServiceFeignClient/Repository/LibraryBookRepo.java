package com.libraryService.libraryServiceFeignClient.Repository;

import com.libraryService.libraryServiceFeignClient.Model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@ComponentScan
@FeignClient(name="BookService")
public interface LibraryBookRepo {
    @RequestMapping(method= RequestMethod.GET,value="/books")
    public List<Book> getAllBooks();

    @RequestMapping(method = RequestMethod.GET,value="/books/{id}")
    public Book getBook(@PathVariable int id);

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public String addBook(@RequestBody Book book);

    @RequestMapping(method = RequestMethod.PUT,value="/books/{id}")
    public String updateBook(@RequestBody Book book, @PathVariable int id);

    @RequestMapping(method = RequestMethod.DELETE,value = "/books/{id}")
    public String deleteBook(@PathVariable int id);
}
