package com.W11.Tekprog.Repository;

import com.W11.Tekprog.Model.Books;
import org.springframework.stereotype.Repository;
@Repository
public interface BooksRepository extends BookRepository <Books>
{
    
}