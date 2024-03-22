package model.dao;

import java.util.List;

import model.entities.Seller;

//Dao é data acess object, classes que acessam outras classes para manipular seus dados


public interface SellerDao {
	
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteBtId(Integer obj);
	Seller findById(Integer id);
	List<Seller>findAll();	
	
	

}
