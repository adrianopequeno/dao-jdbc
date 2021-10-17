package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 2: findById ===");
		Department dep = departmentDao.findById(6);
		System.out.println(dep);

		System.out.println("\n=== TEST 3: delete department ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deletById(id);
		System.out.println("Deleted ok!");
		
		System.out.println("\n=== TEST 4: update department ===");
		dep = departmentDao.findById(2);
		dep.setName("Shoes");
		departmentDao.update(dep);
		System.out.println("Update Ok!");
		
		
		sc.close();
	}

}
