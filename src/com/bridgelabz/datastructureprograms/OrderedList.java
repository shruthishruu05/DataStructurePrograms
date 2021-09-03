package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.MyNode;


public class OrderedList {
	public static LinkedList<Integer> linkedListObject = new LinkedList<Integer>();
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of number");
		int sizeOfNumbers = scanner.nextInt();
		System.out.println("Enter " +sizeOfNumbers+ " number ");
		int numbers[] = new int[sizeOfNumbers];
		for(int index = 0; index<sizeOfNumbers;index++)
		{
			numbers[index] = scanner.nextInt();
		}
		for(int numberPresent : numbers) 
		{
			MyNode<Integer> node = new MyNode<Integer>(numberPresent);
			linkedListObject.addInOrder(node);
		}
		System.out.println("which number has to be searched ??");
		int numberToBeSearched = scanner.nextInt();
		searchNumber(numbers,numberToBeSearched);
		
		linkedListObject.display();
		scanner.close();
	}

	private static void searchNumber(int[] numbers, int numberToBeSearched) {
		System.out.println(numberToBeSearched);
		INode<Integer> newNode = linkedListObject.search(numberToBeSearched);
		if(newNode==null)
		{
			MyNode<Integer> node = new MyNode<Integer>(numberToBeSearched);
			linkedListObject.append(node);
			System.out.println(numberToBeSearched+ " Found ");
				
		}
		else 
		{
			linkedListObject.delete(numberToBeSearched);
			System.out.println("The number is deleted");
		}
		
	}
}
