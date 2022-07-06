package com.csf.agriculture.repository;
import org.springframework.data.repository.CrudRepository;

import com.csf.agriculture.model.Produit;



//repository that extends CrudRepository  
public interface ProduitRepository extends CrudRepository<Produit, Integer>  
{  
}  
