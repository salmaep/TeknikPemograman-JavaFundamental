package com.W11.Tekprog.Controller;

import com.W11.Tekprog.Model.Books;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Books")

public class BooksController_imp extends BookController_imp<Books> implements BooksController {
    
}
