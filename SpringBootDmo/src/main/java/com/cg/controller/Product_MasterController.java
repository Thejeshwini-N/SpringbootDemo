package com.cg.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.cg.entities.Product_Master;
import com.cg.service.Product_MasterService;
@RestController
public class Product_MasterController
{
 @Autowired
 private Product_MasterService service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/products")
 public List<Product_Master> list() 
 {
 return service.listAll();
 }
 @GetMapping("/products/{id}")
 public ResponseEntity<Product_Master> get(@PathVariable Integer id) 
 {
 try
 {
 Product_Master product = service.get(id);
 return new ResponseEntity<Product_Master>(product, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<Product_Master>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/products")
 public void add(@RequestBody Product_Master product) 
 {
 service.save(product);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/products/{id}")
 public ResponseEntity<?> update(@RequestBody Product_Master product, @PathVariable Integer id) 
 {
 try
 {
 Product_Master existProduct = service.get(id);
 service.save(product);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 //@DeleteMapping
 @DeleteMapping("/products/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
 }