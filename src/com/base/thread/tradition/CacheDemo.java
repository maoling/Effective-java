package com.base.thread.tradition;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo {

	private Map<String, Object> cache = new HashMap<String, Object>();
	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public  Object getData(String key){
		rwl.readLock().lock();
		Object value = null;
		try{
			value = cache.get(key);
			if(value == null){
				rwl.readLock().unlock();
				rwl.writeLock().lock();
				try{
					if(value==null){
						value = "aaaa";// µº  ß»•queryDB();
					}
				}finally{
					rwl.writeLock().unlock();
				}
				rwl.readLock().lock();
			}
		}finally{
			rwl.readLock().unlock();
		}
		return value;
	}
	
	public Object getData2(String key){
		
		rwl.readLock().lock();
		Object val = null;
		try {
			val = cache.get(key);
			if(val == null){
				rwl.readLock().unlock();
				rwl.writeLock().lock();				
				try {
					if(val == null){
						val = queryDB();
						cache.put(key,val);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}finally{
					rwl.writeLock().unlock();
				}
				rwl.readLock().lock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			rwl.readLock().unlock();
		}
		return val;
	}


	private Object queryDB() {
		// TODO Auto-generated method stub
		return null;
	}
}
