package com.base.puzzle;

public class Client83 {
    enum Season{
    	Spring, Summer, Autumn, Winter;
        public static Season getMostConfortableSeason() {
        	return Spring;
        }
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Season s : Season.values()) {
			System.out.println(s);
		}
		System.out.println(Season.getMostConfortableSeason());
	}

}
