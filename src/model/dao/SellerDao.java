package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); // insere um novo funcionario
	void update(Seller obj);// atualiza dados de um funcionario existent
	void deletById(Integer id);// remove um funcionario existe pelo ID
	Seller findById(Integer id);// detorna um funcionario existente pelo ID
	List<Seller> findAll();// retorna todos os funcionario atraves de uma lista
	List<Seller> findByDepartment(Department department); // busca os funcionarios pelo departamento
	
}
