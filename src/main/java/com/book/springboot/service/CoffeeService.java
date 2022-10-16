package com.book.springboot.service;

import com.book.springboot.Domain.Coffee;
import com.book.springboot.dao.CoffeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoffeeService {

    @Autowired
    private CoffeeDao coffeeDao;

    public Iterable<Coffee> findAllCoffee() {
        return coffeeDao.findAll();
    }

    public Optional<Coffee> getCoffeeById(String id) {
        return coffeeDao.findById(id);
    }

    public Coffee createCoffee(Coffee coffee) {
        if (!coffeeDao.existsById(coffee.getId())) {
            coffeeDao.save(coffee);
        }

        return coffee;
    }

    public void deleteCoffee(String id) {
        coffeeDao.deleteById(id);
    }
}
