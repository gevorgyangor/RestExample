package com.example.authorbook;

import com.example.author.model.Book;
import com.example.author.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @DeleteMapping("/book/{id}")
    public void deleteAuthorById(@PathVariable(name = "id") int id) {
        bookRepository.findOne(id);
    }

    @PostMapping()
    public void saveAuthor(@RequestBody Book book) {
        bookRepository.save(book);
    }
}
