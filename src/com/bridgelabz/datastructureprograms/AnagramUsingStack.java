package com.bridgelabz.datastructureprograms;
import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.linkedlist.MyStack;
public class AnagramUsingStack {
	private static ArrayList<Integer> printPrimeNumber(int maxLimit) {
		MyStack<Integer> myStack = new MyStack<Integer>();
		
		for(int index=2;index<1000;index++) {
			boolean flag = true;
			for(int k=2;k<=index/2;k++) {
				if(index%k == 0) flag = false; 
			}
			
			if(flag) {
				myStack.push(index);	
			}
				
		}
		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		while(!myStack.isEmpty()) {
			primeNumbers.add(myStack.pop());
		}
		return primeNumbers;
	}
	
	
	private static void anagramChecker(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(isAnagram(list.get(i), list.get(j))) {
					System.out.println("the numbers that are Anagrams "+list.get(i)+"-"+list.get(j));
				}
			}
		}
	}
	
	private static boolean isAnagram(int number1 , int number2) {
			String string1 = String.valueOf(number1);
			String string2 = String.valueOf(number2);
			if(string1.length() != string2.length()) return false;
			char[] array1 = string1.toCharArray();
			char[] array2 = string2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			return Arrays.equals(array1, array2);
	}
	
	public static void main(String[] args) {
		int maxLimit = 1000;
		System.out.println("Prime numbers from 0 to 1000 range");
		ArrayList<Integer> primeObject = printPrimeNumber(maxLimit);
		for(int i=0;i<primeObject.size();i++) {
			System.out.print(primeObject.get(i)+" ");
		}
		anagramChecker(primeObject);
		
	}
}
