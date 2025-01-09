//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder

		StringBuilder nums = new StringBuilder();
		for (int i = 0; i < 10; i++) {
		  if (i != 9) {
				nums.append(i + "-");
		} else {
				nums.append(i);
		}
		}
			System.out.println(nums);
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length

		List<String> bands = new ArrayList<String>();
		bands.add("Primus");
		bands.add("Mr. Bungle");
		bands.add("Ween");
		bands.add("Refused");
		bands.add("That Handsome Devil");
		
		System.out.println(bands);
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
				
		System.out.println(findShortest(bands));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched

		System.out.println(swapFirstAndLast(bands));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma

		System.out.println(concatenate(bands));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)

		List<String> searchResults = search(bands, "e");
		for (String result : searchResults) {
			System.out.println(result);
		}
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

		List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("----------------");
		}
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string

		List<Integer> stringsLengths = calculateStringLengths(bands);
		
		for(Integer i : stringsLengths) {
			System.out.println(i);
		}
		
		// 9. Create a set of strings and add 5 values

		Set<String> sports = new HashSet<String>();
		sports.add("Tennis");
		sports.add("Golf");
		sports.add("Bowling");
		sports.add("Hockey");
		sports.add("Curling");
		System.out.println(sports);
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.

		Set<String> startsWithH = findAllThatStartWith(sports, 'H');
		for (String word : startsWithH) {
			System.out.println(word);
		}
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
		List<String> resultList = sameAsSet(sports);
		for (String listString : resultList) {
			System.out.println(listString);
		}

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set

		Set<Integer> numberSet = new HashSet<Integer>();
			numberSet.add(1);
			numberSet.add(2);
			numberSet.add(3);
			numberSet.add(4);
			numberSet.add(5);
			numberSet.add(6);
			numberSet.add(7);
			numberSet.add(8);
			numberSet.add(9);
			numberSet.add(10);
			
		Set<Integer> onlyEvens = onlyEven(numberSet);
		for (Integer i : onlyEvens) {	
		System.out.println(i);
		}
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

		Map<String, String> dictionary = new HashMap<String, String>();
			dictionary.put("Blank", "(of a surface or background) unrelieved by decorative or other features; bare, empty, or plain.");
			dictionary.put("Erase", "rub out or remove (writing or marks)");
			dictionary.put("Create", "bring (something) into existence.");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		String value = lookupValue (dictionary, "Create");
		System.out.println(value);
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
		Map<Character, Integer> counts = characterCount(resultList);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts);
		}

	}
	
	// Method 15:
	
	public static Map<Character, Integer> characterCount(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}
		return results;
	}
	
	// Method 14:
	
	public static String lookupValue(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}
	
	// Method 12:
	
	public static Set<Integer> onlyEven(Set<Integer> numberSet) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer i : numberSet) {
			if (i % 2 == 0) {
				results.add(i);
			}
		}
		return results;
	}
	
	// Method 11:
	
	public static List<String> sameAsSet(Set<String> sports) {
		List<String> results = new ArrayList<String>();
			for (String string : sports) {
				results.add(string);
			}
			return results;
	}

	// Method 10:
	
	public static Set<String> findAllThatStartWith(Set<String> sports, char c) {
		Set<String> results = new HashSet<String>();
			for (String string : sports) {
				if (string.charAt(0) == c) {
					results.add(string);
				}
			}
			return results;
	}
	
	// Method 8:
	
		public static List<Integer> calculateStringLengths(List<String> bands) {
			List<Integer> lengths = new ArrayList<Integer>();
			for (String string : bands) {
				lengths.add(string.length());
			}
			return lengths;
		}
	
	// Method 7:
		
		public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
			List<List<Integer>> results = new ArrayList<List<Integer>>();
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());
			results.add(new ArrayList<Integer>());

			for (Integer number : list) {
				if (number % 2 == 0) {
					results.get(0).add(number);
				}
				if (number % 3 == 0) {
					results.get(1).add(number);
				}
				if (number % 5 == 0) {
					results.get(2).add(number);
				}
				if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
					results.get(3).add(number);
				}
			}

			return results;
		}
	
	// Method 6:
		
		public static List<String> search(List<String> bands, String query) {
			List<String> results = new ArrayList<String>();
			for (String string : bands) {
				if (string.contains(query)) {
					results.add(string);
				}
			}
			return results;
		}
	
	// Method 5:
		
		public static String concatenate(List<String> bands) {
			StringBuilder concat = new StringBuilder();
			for (String string : bands) {
					concat.append(string + ", ");
				}
			return concat.toString();
			}
	
	// Method 4:
		
		public static List<String> swapFirstAndLast(List<String> bands) {
			String placeholder = bands.get(0);
			bands.set(0, bands.get(bands.size() - 1));
			bands.set(bands.size() - 1, placeholder);
			return bands;
		}
	
	// Method 3:
	
		public static String findShortest(List<String> bands) {
			String shortest = bands.get(0);
				for (String string : bands) {
					if (string.length() < shortest.length()) {
						shortest = string;
					}
				}
				return shortest;
		}

}
