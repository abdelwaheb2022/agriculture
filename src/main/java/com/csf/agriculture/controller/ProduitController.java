package com.csf.agriculture.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.csf.agriculture.model.Produit;
import com.csf.agriculture.service.ProduitService;

//mark class as Controller  
@RestController  
public class ProduitController   
{  
	//autowire the produitService class  
	@Autowired  
	ProduitService produitService;  
	//creating a get mapping that retrieves all the Produit detail from the database   
	@GetMapping("/produits")  
	private List<Produit> getAllProduit()   
	{  
		return produitService.getAllProduits();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/produits/{produitid}")  
	private Produit getProduit(@PathVariable("produitid") int produitid)   
	{  
		return produitService.getProduitById(produitid);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/produits/{produitid}")  
	private void deleteBook(@PathVariable("produitid") int bookid)   
	{  
		produitService.delete(bookid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/produits")  
	private int saveBook(@RequestBody Produit Produit)   
	{  
		produitService.saveOrUpdate(Produit);  
		return Produit.getProductid();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/produits")  
	private Produit update(@RequestBody Produit Produit)   
	{  
		produitService.saveOrUpdate(Produit);  
		return Produit;  
	}  
}  