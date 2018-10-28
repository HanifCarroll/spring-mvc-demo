package com.hanifcarroll.mvcdemo.repositories;


import com.hanifcarroll.mvcdemo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
