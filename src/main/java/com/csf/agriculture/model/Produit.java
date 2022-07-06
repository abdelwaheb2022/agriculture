package com.csf.agriculture.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Produit  
{  
//Defining book id as primary key  
@Id  
@Column  
private int productid;  
@Column  
private String designation;  
@Column  
private int qte;  
@Column  
private int prix;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
@Override
public String toString() {
	return "Produit [productid=" + productid + ", designation=" + designation + ", qte=" + qte + ", prix=" + prix + "]";
} 



}
