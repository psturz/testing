package ch.psturz.gen;


import java.util.ArrayList;
import java.util.List;

public class GenericTypeMissmatch {
	List<String> ls = new ArrayList<String>(); // 
	// List<Object> lo = ls; // type missmatch cannot convert from List<String> to List<Object>
	
	/*
	 * aliased ls and lo. Accessing ls, a list of String, through the alias lo, we 
	 * can insert arbitrary objects into it. As a result ls does not hold just Strings anymore,
	 *  and when we try and get something out of it, we get a rude surprise.
	 */
	
	// lo.add(new Object()); // 3
	String s = ls.get(0); // 4: Attempts to assign an Object to a String!
	
}
