package com.base.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	BinarySearch binarySearch = new BinarySearch();
	@Test
	public void test() {
		assertTrue(binarySearch.add(1, 2) == 3);
	}

}
