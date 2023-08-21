package com.example.demo.com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
	/*
	 * @GetMapping public List<Product> getAllProducts() { // TODO: implement code
	 * to fetch all products from a database or other data source }
	 * 
	 * @PostMapping public Product createProduct(@RequestBody Product product) { //
	 * TODO: implement code to create a new product }
	 */
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return new Product(Long.parseLong(id),"Mobile",299L);
    }
    
	/*
	 * @PutMapping("/{id}") public Product updateProduct(@PathVariable Long
	 * id, @RequestBody Product product) { // TODO: implement code to update a
	 * product by its ID }
	 * 
	 * @DeleteMapping("/{id}") public void deleteProduct(@PathVariable Long id) { //
	 * TODO: implement code to delete a product by its ID }
	 */
}
