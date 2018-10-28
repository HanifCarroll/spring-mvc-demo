package com.hanifcarroll.mvcdemo.repositories;

import com.hanifcarroll.mvcdemo.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
