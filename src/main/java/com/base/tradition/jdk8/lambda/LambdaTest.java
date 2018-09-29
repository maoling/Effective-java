package com.base.tradition.jdk8.lambda;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Track {
	String name;
	int age;
	Track (String name, int age) {
		this.name = name;
		this.age = age;
	}
	int getLen() {
		return name.length();
	}
}

public class LambdaTest {

    public static void runThreadUseLambda() {       
        //collect(toList())
    	List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
    	//map
    	List<String> collected2 = Stream.of("a", "b", "c").map(str -> str.toUpperCase()).collect(Collectors.toList());
    	System.out.println("collected2:" + collected2);
    	//flatMap
    	List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
    			.flatMap(numbers -> numbers.stream())
    			.collect(Collectors.toList());
    	//
    	List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
    			new Track("Violets for Your Furs", 378),
    			new Track("Time Was", 451));
    	Track shortestTrack = tracks.stream()
    			.min(Comparator.comparing(track -> track.getLen()))
    			.get();

    	
    	new Thread(() -> System.out.println("lambda")).start();
        Runnable noArguments = () -> System.out.println("Hello World");
        ActionListener oneArgument = event -> System.out.println("button clicked");
        Runnable multiStatement = () -> {        
	        System.out.print("Hello");
	        System.out.println(" World");
	    };
        BinaryOperator<Long> add = (x, y) -> x + y;
        Map<String, Integer> diamondWordCounts = new HashMap<>();
        /**
         * long count = allArtists.stream()
			.filter(artist -> artist.isFrom("London"))
			.count();
         */
    }

    public static void main(String[] args) {
        LambdaTest.runThreadUseLambda();
        //List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
        		//"Date and Time API");
        //features.forEach(n -> System.out.println(n));
        //features.forEach(System.out::println);


    }
}