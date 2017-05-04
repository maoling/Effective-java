package com.base.interview;

import java.util.HashSet;
import java.util.Set;

public class Employee4HashcodeEqual
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
    @Override   //重写equal方法
    public boolean equals(Object o) {
    	// TODO Auto-generated method stub
    	if(o == null)
    		return false;
    	if( this == o)
    		return true;
    	if(o.getClass() != getClass())
    		return false;
    	Employee4HashcodeEqual e = (Employee4HashcodeEqual) o;
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
    //http://www.tuicool.com/articles/ZjqmY3
    public void testTryAndFinally(String name)
    {
   		try
   		{
   			name.length();// NullPointerException
   		}
   		finally
   		{
   			System.out.println("aa");
   		}
    }
    
    public static void main(String[] args) {
    	Employee4HashcodeEqual e1 = new Employee4HashcodeEqual();
        Employee4HashcodeEqual e2 = new Employee4HashcodeEqual();
 
        e1.setId(100);
        e2.setId(100);
        //Prints false in console
        System.out.println(e1.equals(e2));
        
        Set<Employee4HashcodeEqual> employees = new HashSet<Employee4HashcodeEqual>();
        employees.add(e1);
        employees.add(e2);
        //Prints two objects
        System.out.println(employees);
        /**
         * 在Java的try、catch、finally中，try是必须的，catch和finally都不是必须的。
                                  因为捕获异常是必须要有的，而捕获到异常之后，如果不做处理，那就不用写catch，如果需要对捕获到异常之后做处理才需要catch，finally也是一样，可以不用写，也可以加上。
        */
        try {
			int i = 5 / 0;
		} 
        catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
        System.out.println("after finally normal!");
        ExecutorService
	}
}