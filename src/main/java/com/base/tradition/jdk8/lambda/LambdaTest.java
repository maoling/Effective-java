package com.base.tradition.jdk8.lambda;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaTest {

    public static void runThreadUseLambda() {       
        new Thread(() -> System.out.println("lambdaʵ�ֵ��߳�")).start();
        Runnable noArguments = () -> System.out.println("Hello World");
        ActionListener oneArgument = event -> System.out.println("button clicked");
        Runnable multiStatement = () -> {        
	        System.out.print("Hello");
	        System.out.println(" World");
	    };
        BinaryOperator<Long> add = (x, y) -> x + y;
    }

    public static void main(String[] args) {
        //LambdaTest.runThreadUseLambda();
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
        		 "Date and Time API");
        //features.forEach(n -> System.out.println(n));
        features.forEach(System.out::println);


    }
}