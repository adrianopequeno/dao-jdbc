package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj); // insere um novo departamento
	void update(Department obj);// atualiza um departamento existent
	void deletById(Integer id);// remove um departamento existe pelo ID
	Department findById(Integer id);// retorna um departamento existente pelo ID
	List<Department> findAll();// retorna todos os departamentos atraves de uma lista
}
