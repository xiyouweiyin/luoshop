package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchServiceController {
    @Autowired
    ProductClient productClient;
    @GetMapping
    public String hello(){
        return "nihao ";
    }
    @RequestMapping(value = "/find/{productId}",method = RequestMethod.GET)
    public Product findProductById(@PathVariable int productId){
        System.out.println("Getting product detai"+productId);
        return productClient.getProductById(productId);
    }
}
