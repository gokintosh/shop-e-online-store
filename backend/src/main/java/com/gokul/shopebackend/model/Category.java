package com.gokul.shopebackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    long id;
    String name;
}
