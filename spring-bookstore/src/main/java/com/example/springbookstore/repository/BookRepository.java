package com.example.springbookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
