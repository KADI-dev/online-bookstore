package com.rachidaidak.springFull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rachidaidak.springFull.enty.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
