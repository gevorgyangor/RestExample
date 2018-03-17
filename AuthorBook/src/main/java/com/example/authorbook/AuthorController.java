package com.example.authorbook;


import com.example.author.model.Author;
import com.example.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;



    @GetMapping("/authors")
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @DeleteMapping("/authors/{id}")
    public void deleteAuthorById(@PathVariable(name = "id") int id) {
        authorRepository.findOne(id);
    }

    @PostMapping()
    public void saveAuthor(@RequestBody Author author) {
        authorRepository.save(author);
    }
}
