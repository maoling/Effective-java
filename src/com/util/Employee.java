package com.util;

import java.util.HashSet;
import java.util.Set;

public class Employee
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	/*final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getId();
        return result;*/
    	return getId();
    }
    @Override   //÷ÿ–¥equal∑Ω∑®
    public boolean equals(Object o) {
    	// TODO Auto-generated method stub
    	if(o == null)
    		return false;
    	if( this == o)
    		return true;
    	if(o.getClass() != getClass())
    		return false;
    	Employee e = (Employee) o;
		return (this.getId() == e.getId());
    	
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public static void main(String[] args) {
    	Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(100);
        e2.setId(100);
        //Prints false in console
        System.out.println(e1.equals(e2));
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        //Prints two objects
        System.out.println(employees);
	}
}