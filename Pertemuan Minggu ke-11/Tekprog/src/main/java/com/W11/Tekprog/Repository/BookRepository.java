package com.W11.Tekprog.Repository;

import com.W11.Tekprog.Model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;  
//repository that extends CrudRepository
@Repository  
public interface BookRepository <T extends Book> extends CrudRepository<T, Long>
{  
}   