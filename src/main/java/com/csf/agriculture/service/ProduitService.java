package com.csf.agriculture.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.csf.agriculture.model.Produit;
import com.csf.agriculture.repository.ProduitRepository;

//defining the business logic  
@Service  
public class ProduitService   
{  
	@Autowired  
	ProduitRepository produitRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Produit> getAllProduits()   
	{  
		List<Produit> produits = new ArrayList<Produit>();  
		produitRepository.findAll().forEach(p -> produits.add(p));  
		return produits;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Produit getProduitById(int id)   
	{  
		return produitRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Produit produit)   
	{  
		produitRepository.save(produit);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		produitRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Produit produit, int productid)   
	{  
		produitRepository.save(produit);  
	}  
}  