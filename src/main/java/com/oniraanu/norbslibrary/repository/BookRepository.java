package com.oniraanu.norbslibrary.repository;

import com.oniraanu.norbslibrary.models.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, String> {

    Book findBookByTitleIsIgnoreCase(String title);

    List <Book> findBookByUploadedBy(String email);

    Page <Book> findAll(Pageable pageable);
}
