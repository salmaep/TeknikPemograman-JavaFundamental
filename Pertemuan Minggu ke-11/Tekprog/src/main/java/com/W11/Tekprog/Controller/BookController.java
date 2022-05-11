package com.W11.Tekprog.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.W11.Tekprog.Model.Book;
public interface BookController<T extends Book> {
    ResponseEntity<Object> save(@RequestBody T entity);
	ResponseEntity<T> findAll();
	ResponseEntity<String> delete(@PathVariable Long id);
}