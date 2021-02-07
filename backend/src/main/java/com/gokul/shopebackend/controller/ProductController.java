package com.gokul.shopebackend.controller;


import com.gokul.shopebackend.model.Product;
import com.gokul.shopebackend.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServices productServices;

    @RequestMapping("getAll")
    public List<Product> getAllProducts(){
        return productServices.getAllProducts();
    }
}
