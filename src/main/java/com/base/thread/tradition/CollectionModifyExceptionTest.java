package com.base.thread.tradition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class CollectionModifyExceptionTest {
	public static void main(String[] args) {
		Collection userslist = 			 //new CopyOnWriteArrayList();	
		new ArrayList();
		userslist.add(new User("����",28));	
		userslist.add(new User("����",25));			
		userslist.add(new User("����",31));	
		
		Iterator itrUsers = userslist.iterator();
		while(itrUsers.hasNext()){
			System.out.println("aaaa");
			User user = (User)itrUsers.next();
			if("����".equals(user.getName())){
				userslist.remove(user);
				//itrUsers.remove();
			} else {
				System.out.println(user);				
			}
		}
	}
}	 
