package com.base.tradition.jdk8;

/**
 * http://www.tuicool.com/articles/7fAreuJ
 * @author maoling
 *
 */
public abstract class TryWithResourcesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在 try语句中越是最后使用的资源，越是最早被关闭。
		try (ResourceSome some = new ResourceSome(); ResourceOther other = new ResourceOther()) {
			some.doSome();
			other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class ResourceSome implements AutoCloseable {
    void doSome() {
        System.out.println("do something");
    }
    @Override
    public void close() throws Exception {
        System.out.println("some resource is closed");
    }
}

class ResourceOther implements AutoCloseable {
    void doOther() {
        System.out.println("do other things");
    }
    @Override
    public void close() throws Exception {
        System.out.println("other resource is closed");
    }
}
