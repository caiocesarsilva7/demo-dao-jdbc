package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ====");
		Department newDepartment = new Department(null, "Marketing");
		department.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== TEST 2: department update ====");
		Department dep = department.findById(3);
		System.out.println(dep);
		
		
		System.out.println("\n=== TEST 3: seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		department.deleteById(id);
		System.out.println("Delete completed");
		
		
		System.out.println("\n=== TEST 3: seller findAll ====");
		List<Department> list  = department.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
}
