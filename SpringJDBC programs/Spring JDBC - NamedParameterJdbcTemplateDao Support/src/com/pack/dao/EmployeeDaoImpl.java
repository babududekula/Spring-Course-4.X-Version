package com.pack.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.pack.dto.Employee;

public class EmployeeDaoImpl extends NamedParameterJdbcDaoSupport implements EmployeeDao 
{
	private DataSource ds;
	public void setDs(DataSource dataSource) 
	{
		setDataSource(dataSource);
	}
	
	@Override
	public String add(Employee emp) 
	{
		String status = "";
		try 
		{
			Employee emp1 = serach(emp.getEid());
			if(emp1 == null)
			{
				String query = "insert into employee values(:eid , :ename , :eaddr)";
				Map<String, Object> params = new HashMap<String , Object>();
				params.put("eid", emp.getEid());
				params.put("ename", emp.getEname());
				params.put("eaddr", emp.getEaddr());
				int RowCount = getNamedParameterJdbcTemplate().update(query,params);
				if(RowCount == 1)
				{
					status = "Employee Insertion success";
				}
				else
				{
					status = "Employee Insertion Failure";
				}
				
			}
			else
			{
				status = "Employee Existed Already";
			}
		} 
		catch (Exception e) 
		{
			status = "Employee Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee serach(int eid) 
	{
		Employee emp = null;
		try 
		{
			String query = "select * from employee where eid = :eid";
			Map<String, Object> params = new HashMap<String , Object>();
			params.put("eid", eid);
			
			List<Employee> employeeList = getNamedParameterJdbcTemplate().query(query, params,(rs,index)->{
			Employee emp1 = new Employee();
			emp1.setEid(rs.getInt("eid"));
			emp1.setEname(rs.getString("ename"));
			emp1.setEaddr(rs.getString("eaddr"));
				return emp1;
			});
			if(employeeList.isEmpty() == true)
			{
				emp = null;
			}
			else
			{
				emp = employeeList.get(0);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> empsList = null;
		try 
		{
			String query = "select * from employee";
			empsList = getNamedParameterJdbcTemplate().query(query, (rs,index)->{
				Employee emp = new Employee();
				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setEaddr(rs.getString("eaddr"));
				return emp;
				
			});
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return empsList;
	}

	@Override
	public String update(Employee emp) 
	{
		String status = "";
		try 
		{
			Employee emp1 = serach(emp.getEid());
			if(emp1 == null)
			{
				status = "employee Not Existed";
			}
			else
			{
				String query = "update employee set ename = :ename , eaddr =:eaddr where eid=:eid";
				Map<String, Object> params = new HashMap<String , Object>();
				params.put("ename", emp.getEname());
				params.put("eaddr", emp.getEaddr());
				params.put("eid", emp.getEid());
				int RowCount = getNamedParameterJdbcTemplate().update(query, params);
				if(RowCount == 1)
				{
					status = "Employee Updated successfully";
				}
				else
				{
					status = "Employee Updated Failure";
				}
			}
		} 
		catch (Exception e) 
		{
			status ="Employee Updated Failure";
			e.printStackTrace();
		}
	
		return status;
	}

	@Override
	public String delete(int eid) 
	{
		String status = "";
		try 
		{
			Employee emp = serach(eid);
			if(emp == null)
			{
				status = "Employee Not Existed";
			}
			else
			{
				String query = "delete from employee where eid =:eid";
				Map<String, Object> params = new HashMap<String , Object>();
				params.put("eid", eid);
				int RowCount = getNamedParameterJdbcTemplate().update(query, params);
				if(RowCount == 1)
				{
					status = "employee deletion successfully";
				}
				else
				{
					status = "Employee Deletion Failure";
				}
			}
		} 
		catch (Exception e) 
		{
			status = "Employee deletion Failure";
			e.printStackTrace();
		}
		
		return status;
	}

}
