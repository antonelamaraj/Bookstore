package com.bookstore.service;

import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository myBook;

    public void saveMyBook(MyBookList book){
        myBook.save(book);
    }
    public List<MyBookList> getAllMyBooks(){
       return myBook.findAll();
    }

    public void deleteById(int id){
        myBook.deleteById(id);
    }
}
