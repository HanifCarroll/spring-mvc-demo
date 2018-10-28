package com.hanifcarroll.mvcdemo.repositories;

import com.hanifcarroll.mvcdemo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
