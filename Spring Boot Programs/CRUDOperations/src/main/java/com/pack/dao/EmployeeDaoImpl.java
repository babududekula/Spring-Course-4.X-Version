package com.pack.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.pojo.Employee;


@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public String add(Employee employee) 
	{
		String status = "";
		String query = "select * from employee where ENUMBER = '"+employee.getEnumber()+"'";
		List<Employee> employeeList = jdbcTemplate.query(query, (resultSet , index)->{
			Employee emp = new Employee();
			emp.setEnumber(resultSet.getString("Enumber"));
			emp.setEname(resultSet.getString("Ename"));
			emp.setEpwd(resultSet.getString("Epwd"));
			emp.setEage(resultSet.getInt("Eage"));
			emp.setEmail(resultSet.getString("Email"));
			emp.setEmobile(resultSet.getString("Emobile"));
			return emp;
		});
		if(employeeList.isEmpty() == true)
		{
			String query1 = "insert into employee values('"+employee.getEnumber()+"' , '"+employee.getEname()+"' , '"+employee.getEpwd()+"' , "+employee.getEage()+" , '"+employee.getEmail()+"' , '"+employee.getEmobile()+"') ";
			int RowCount = jdbcTemplate.update(query1);
			if(RowCount == 1)
			{
				status = "success";
			}
			else
			{
				status = "failure";
			}
		}
		else
		{
			status = "existed";
		}
			
		return status;
	}

	@Override
	public Employee search(String enumber) 
	{
		Employee employee = null;
		
			String query = "select * from employee where ENUMBER = '"+enumber+"'";
			List<Employee> employeeList = jdbcTemplate.query(query, (resultSet , index)->{
				Employee emp = new Employee();
				emp.setEnumber(resultSet.getString("enumber"));
				emp.setEname(resultSet.getString("ename"));
				emp.setEpwd(resultSet.getString("epwd"));
				emp.setEage(resultSet.getInt("eage"));
				emp.setEmail(resultSet.getString("email"));
				emp.setEmobile(resultSet.getString("emobile"));
				return emp;
			});
			if(employeeList.isEmpty() == true)
			{
				employee = null;
			}
			else
			{
				employee = employeeList.get(0);
			}
		return employee;
	}

	@Override
	public String update(Employee employee) 
	{
		String status="";
		String query = "select * from employee where enumber = '"+employee.getEnumber()+"' ";
		List<Employee> empList = jdbcTemplate.query(query, (resultSet,index)->{
			Employee employee1 = new Employee();
			employee1.setEnumber(resultSet.getString("enumber"));
			employee1.setEname(resultSet.getString("ename"));
			employee1.setEpwd(resultSet.getString("epwd"));
			employee1.setEage(resultSet.getInt("eage"));
			employee1.setEmail(resultSet.getString("email"));
			employee1.setEmobile(resultSet.getString("emobile"));
			return employee1;
			
		});
		if(empList.isEmpty() == true)
		{
			status = "notexisted";
		}
		else
		{
			String query1 = "update employee set ename='"+employee.getEname()+"' , epwd = '"+employee.getEpwd()+"' , eage ="+employee.getEage()+" , email='"+employee.getEmail()+"' , emobile ='"+employee.getEmobile()+"' where enumber ='"+employee.getEnumber()+"' ";
			int RowCount = jdbcTemplate.update(query1);
			if(RowCount == 0)
			{
				status ="failure";
			}
			else
			{
				status ="success";
			}
		}
		return status;
	}

	@Override
	public String delete(String enumber) 
	{
		String status="";
		String query1 = "select * from employee where enumber = '"+enumber+"' ";
		List<Employee> empList = jdbcTemplate.query(query1, (resultSet , index)->{
			Employee emp = new Employee();
			emp.setEnumber(resultSet.getString("enumber"));
			emp.setEname(resultSet.getString("ename"));
			emp.setEpwd(resultSet.getString("epwd"));
			emp.setEage(resultSet.getInt("eage"));
			emp.setEmail(resultSet.getString("email"));
			emp.setEmobile(resultSet.getString("emobile"));
			return emp;
		});
		
		if(empList.isEmpty() == true)
		{
			status = "notexisted";
		}
		else
		{
			String query = "delete from employee where enumber ='"+enumber+"' ";
			int RowCount = jdbcTemplate.update(query);
			if(RowCount == 0)
			{
				status = "failure";
			}
			else
			{
				status = "success";
			}
		}
		return status;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> list = null;
		try 
		{
			String query = "select * from employee";
			list = jdbcTemplate.query(query, (resultSet , index)->{
				Employee emp = new Employee();
				emp.setEnumber(resultSet.getString("enumber"));
				emp.setEname(resultSet.getString("ename"));
				emp.setEpwd(resultSet.getString("epwd"));
				emp.setEage(resultSet.getInt("eage"));
				emp.setEmail(resultSet.getString("email"));
				emp.setEmobile(resultSet.getString("emobile"));
				return emp;
			});
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}

}
