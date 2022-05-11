package com.W11.Tekprog.Service;

import java.util.List;
import com.W11.Tekprog.Repository.BookRepository;
import com.W11.Tekprog.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;  

public class GenericService_imp<T extends Book> implements GenericService<T>{
    @Autowired
    protected BookRepository<T> genericRepository;
    @Override
    public List<T> findAll() throws Exception {
        try {
            return (List<T>) genericRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    public T save(T entity) throws Exception {
        try {
            return genericRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    public void delete(Long id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}