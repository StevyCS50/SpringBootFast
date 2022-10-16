package com.book.springboot.dao;

import com.book.springboot.Domain.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeDao extends JpaRepository<Coffee, String> {
}
