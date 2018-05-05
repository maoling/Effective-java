package com.base.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * http://ifeve.com/google-guava-eventbus/
 * http://blog.csdn.net/top_code/article/details/51283461
 * @author maoling
 *
 */
public class EventBusDemo {
    public static void main(String[] args) {
    	//Creates a new EventBus with the given identifier.
        EventBus eventBus = new EventBus("ricky");

        //register all subscriber
        /**
         * HelloEventListener和MultiEventListener都订阅了OrderEvent 事件，所以他们都会收到OrderEvent 事件通知。
         * 但是HelloEventListener会第一个收到OrderEvent 事件通知，其次是MultiEventListener
         */
        eventBus.register(new HelloEventListener());
        eventBus.register(new MultiEventListener());
        //publish event 
        //eventBus.post(new OrderEvent("hello"));
        //eventBus.post(new OrderEvent("world"));
        
        eventBus.post("Haha");
	}
}

class HelloEventListener{
    @Subscribe
    public void listen(OrderEvent event) {
        System.out.println("HelloEventListener receive msg: "+ event.getMessage());
    }
}

class MultiEventListener {

    @Subscribe
    public void listen(OrderEvent event) {
        System.out.println("MultiEventListener receive msg:"+event.getMessage());
    }

    @Subscribe
    public void listen(String event) {
        System.out.println("MultiEventListener receive msg:"+event);
    }
}

class OrderEvent {
    private String message;
    public OrderEvent(String message) {        
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}

