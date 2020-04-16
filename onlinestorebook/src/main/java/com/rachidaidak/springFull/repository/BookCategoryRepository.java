package com.rachidaidak.springFull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rachidaidak.springFull.enty.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
