package com.Learning.core.day3.session3;

	import java.util.*;

	public class numbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the array:");
	        String arrayString = scanner.nextLine();
	        char[] array = arrayString.toCharArray();

	        System.out.println("Enter the value of k:");
	        int k = scanner.nextInt();

	        List<String> combinations = findCombinations(array, k);
	        
	        System.out.println("Distinct combinations of length " + k + ":");
	        for (String combination : combinations) {
	            System.out.print(combination + " ");
	        }
	    }
	    
	    private static List<String> findCombinations(char[] array, int k) {
	        List<String> result = new ArrayList<>();
	        findCombinationsHelper(array, k, 0, "", result);
	        return result;
	    }
	    
	    private static void findCombinationsHelper(char[] array, int k, int index, String current, List<String> result) {
	        if (k == 0) {
	            result.add(current);
	            return;
	        }
	        
	        for (int i = index; i < array.length; i++) {
	            findCombinationsHelper(array, k - 1, i + 1, current + array[i], result);
	        }
	    }
	}