package com.base.tradition.jdk8.lambda;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest2 {

	public static void main(String[] args) {
		Predicate<Integer> atLeast5 = x -> x > 5;
		BinaryOperator<Long> addLongs = (x, y) -> x + y;
		
		//例3-3　使用内部迭代计算来自伦敦的艺术家人数
		List<Artist> allArtists = new ArrayList<>();
		allArtists.add(new Artist("maoling", "yangzhou"));
		allArtists.add(new Artist("bob", "London"));
		allArtists.add(new Artist("xijiping", "beijing"));
		List<Artist> filteredArtists = allArtists.stream().filter(artist -> artist.isFrom("London")).collect(Collectors.toList());
		filteredArtists.forEach(item -> 
			System.out.println(item.name)
		);
		List<String> collected = Stream.of("a", "b", "hello")
									   .map(str -> str.toUpperCase())
									   .collect(Collectors.toList());
		
		List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 8))
									   .flatMap(num -> num.stream()).collect(Collectors.toList());
		
		System.out.println(together.toString());
		List<Track> tracks = Arrays.asList(new Track("Bakaioooooooooooooooox", 524),
				new Track("Violets for Your Furs", 378),
				new Track("Time Was", 451));
		Track track = tracks.stream().min(Comparator.comparing(t -> t.getLen()))
					   .get();
		System.out.println("min:" + track.name);
	}
}

class Artist {
	String name;
	String country;
	public Artist(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public boolean isFrom(String country) {
		return this.country.equals(country);
	}
}

interface Predicate<T> {
	boolean test(T t);
}