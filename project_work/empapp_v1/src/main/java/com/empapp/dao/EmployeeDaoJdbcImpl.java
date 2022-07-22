package com.empapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.empapp.util.ConnectionFactory;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoJdbcImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAll() {

		List<Employee> employees = new ArrayList<Employee>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}

	@Override
	public Employee getById(int id) {

		Employee employee = null;

		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp where id=?");
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// what i want that i should get auto gen key
		String INSERT_QUERY="insert into emp(name, salary) values(?,?)";
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("insert into emp(name, salary) values(?,?)", 
							Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, employee.getName());
			pstmt.setDouble(2, employee.getSalary());

			pstmt.executeUpdate();
			
			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next()) {
				int no=rs.getInt(1);
				employee.setId(no);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return employee;
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		Employee employee=getById(id);
		try{
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection.prepareStatement("update emp set salary=? where id=?");
			pstmt.setDouble(1, salary);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		employee.setSalary(salary);
		return employee;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee employee=getById(id);
		try{
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection.prepareStatement("delete from emp where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
		return employee;
	}

}











