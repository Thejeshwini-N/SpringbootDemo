package com.cg.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.entities.Product_Master;
import com.cg.repository.Product_MasterRepository;
	@Service
	@Transactional
	public class Product_MasterService 
	{
	 @Autowired
	 private Product_MasterRepository repo;
	 
	 public List<Product_Master> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Product_Master product) 
	 {
	 repo.save(product);
	 }
	 
	 public Product_Master get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	 
	 
	 }

