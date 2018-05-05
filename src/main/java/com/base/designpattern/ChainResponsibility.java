package com.base.designpattern;

/**
 * 模拟实现servlet过滤器中字符和登陆过滤器的实现
   tomcat中责任链的使用
 * @author maoling
 *
 */

abstract class ConsumerHandler {
	private ConsumerHandler nextHandler;
	public abstract void doHandler(String user,double free);
	
	public ConsumerHandler getNextHandler() {
		// TODO Auto-generated constructor stub
		return nextHandler;
	}
	public void setNextHandler(ConsumerHandler nextHadler) {
		this.nextHandler = nextHadler;
	}
}

//项目经理
class ProjectHandler extends ConsumerHandler {

	@Override
	public void doHandler(String user, double free) {
		// TODO Auto-generated method stub
		if (free < 500) {

			if (user.equals("lwx")) {
				System.out.println("给予报销:" + free);
			} else {
				System.out.println("报销不通过");
			}

		} else {
			if (getNextHandler() != null) {
				getNextHandler().doHandler(user, free);
			}
		}
	}
	
}

//部门经理
 class DeptHandler extends ConsumerHandler {    
     @Override
     public void doHandler(String user, double free) {
         if (free < 1000) {
             
             if (user.equals("zy")) {
                 System.out.println("给予报销:" + free);
             } else {
                 System.out.println("报销不通过");
             }
             
         } else {
            if (getNextHandler() != null) {
                 
                 getNextHandler().doHandler(user, free);
             }
         }
         
     }
 }

//总经理
class GeneralHandler extends ConsumerHandler {
     
     @Override
     public void doHandler(String user, double free) {
         if (free >=1000) {
             
             if (user.equals("lwxzy")) {
                 System.out.println("给予报销:" + free);
             } else {
                 System.out.println("报销不通过");
             }
             
         } else {
             if (getNextHandler() != null) {
                 
                 getNextHandler().doHandler(user, free);
             }
         }
         
     }
}

public class ChainResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectHandler projectHandler = new ProjectHandler();
		
		DeptHandler deptHandler = new DeptHandler();
		
		projectHandler.setNextHandler(deptHandler);
		
		GeneralHandler generalHandler =new GeneralHandler();
		
		deptHandler.setNextHandler(generalHandler);
		
		projectHandler.doHandler("lwx", 450);
		projectHandler.doHandler("lwx", 600);
		projectHandler.doHandler("zy", 600);
		projectHandler.doHandler("zy", 1500);
		projectHandler.doHandler("lwxzy", 1500);
	}

}
