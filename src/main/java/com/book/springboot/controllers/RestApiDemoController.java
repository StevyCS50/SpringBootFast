package com.book.springboot.controllers;

import com.book.springboot.Domain.Coffee;
import com.book.springboot.dao.CoffeeDao;
import com.book.springboot.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffee")
public class RestApiDemoController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/all")
    public Iterable<Coffee> getCoffees() {
        return coffeeService.findAllCoffee();
    }

    @GetMapping(value = "/{id}")
    public Optional<Coffee> getCoffeeById(@PathVariable String id) {
        return coffeeService.getCoffeeById(id);
    }

    @PostMapping
    public Coffee postCoffee(@RequestBody Coffee coffee) {
        return coffeeService.createCoffee(coffee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
           return new ResponseEntity<>(coffeeService.createCoffee(coffee), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public void deleteCoffee(@PathVariable String id) {
        coffeeService.deleteCoffee(id);
    }
}
