package model.dao;

import java.util.List;

import model.entities.Department;

//Dao é data acess object, classes que acessam outras classes para manipular seus dados

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteBtId(Integer obj);
	Department findById(Integer id);
	List<Department>findAll();	

}
