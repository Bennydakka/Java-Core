package com.Learning.core.day3.session3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class scanner {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int N = scanner.nextInt();
	        System.out.println("Enter the elements of the array:");
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        Map<Integer, Integer> map = new HashMap<>();
	        int firstRepeatingIndex = -1;

	        for (int i = 0; i < N; i++) {
	            if (map.containsKey(arr[i])) {
	                firstRepeatingIndex = map.get(arr[i]);
	                break;
	            } else {
	                map.put(arr[i], i);
	            }
	        }

	        System.out.println("Index of the first repeating element: " + firstRepeatingIndex);
	    }
	}
