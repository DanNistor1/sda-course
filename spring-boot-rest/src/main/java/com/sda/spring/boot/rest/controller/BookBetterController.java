package com.sda.spring.boot.rest.controller;

import com.sda.spring.boot.rest.dto.BookRequest;
import com.sda.spring.boot.rest.dto.BookResponse;
import com.sda.spring.boot.rest.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping(BookBetterController.API_BOOKS)
@RestController
public class BookBetterController {

    // logger
    private static final Logger log = LoggerFactory.getLogger(BookBetterController.class);
    public static final String API_BOOKS = "/api/books";

    private BookService bookService;

    @Autowired
    public BookBetterController(BookService bookService) {
        this.bookService = bookService;
    }

    // CRUD
    @GetMapping
    public List<BookResponse> getAllBooks() {
        log.info("Get all books...");

        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBook(@PathVariable("id") Long id) {
        log.info("Get book by id = {}", id);

        BookResponse bookResponse = bookService.findById(id);

        return new ResponseEntity<>(bookResponse, HttpStatus.OK);
    }

    @GetMapping("/search")
    public List<BookResponse> getBooksByAuthor(@RequestParam("author") String author) {
        log.info("Get all books by author: {}", author);

        return bookService.findByAuthor(author);
    }

    @PostMapping
    // the created book type - method name - book details
    public BookResponse createBook(@RequestBody BookRequest bookRequest) {
        log.info("Create book: {}", bookRequest);

        return bookService.save(bookRequest);
    }

    @PutMapping("/{id}")
    // method name - id - new book details
    public ResponseEntity<BookResponse> updateBook(@PathVariable("id") Long id, @RequestBody BookRequest bookRequest) {
        log.info("Update book with id: {} and data: {}", id, bookRequest);

        BookResponse updatedBook = bookService.update(bookRequest, id);

        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BookResponse> partialUpdateBook(@PathVariable("id") Long id, @RequestBody Map<String, Object> updateRequest) {
        log.info("Update book with id: {} and data: {}", id, updateRequest);

        BookResponse updatedBook = bookService.partialUpdate(updateRequest, id);

        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
        log.info("Delete book with id: {}", id);
        try {
            bookService.deleteById(id);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to delete book with id: " + id, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>("Book deleted",  HttpStatus.OK); // mesajul "Book deleted", ca parametru al ResponseEntity,
                                                                        // provoaca mesaj de eroare in raspunsul serverului,
                                                                        // daca nu punem parametrul responseType: 'text'
                                                                        // in metoda delete din book.service.ts
    }
}

