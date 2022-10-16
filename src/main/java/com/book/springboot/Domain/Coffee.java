package com.book.springboot.Domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coffee")
public class Coffee {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;
}
