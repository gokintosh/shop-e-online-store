package com.gokul.shopebackend.service;


import com.gokul.shopebackend.model.Product;
import com.gokul.shopebackend.repository.ProductReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductReository productReository;

    public List<Product>getAllProducts(){
        return productReository.findAll();
    }
}
