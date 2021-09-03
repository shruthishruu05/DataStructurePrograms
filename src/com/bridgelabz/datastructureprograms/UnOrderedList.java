package com.bridgelabz.datastructureprograms;
import java.util.Scanner;
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.MyNode;

public class UnOrderedList 
{		
	public static void main(String[] args) 
	{
		LinkedList<String> linkedListObject = new LinkedList<String>();
		System.out.println("Enter any sentence");
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		String[] wordsInput = words.toLowerCase().split(" ");
		for(String wordPresent : wordsInput) 
		{
			MyNode<String> node = new MyNode<String>(wordPresent);
			linkedListObject.append(node);
		}
		for(String i:wordsInput)
			System.out.println(i);
		System.out.println("which word has to be searched ??");
		String wordToBeSearched = scanner.next();
		System.out.println(wordToBeSearched);
		INode<String> newNode = linkedListObject.search(wordToBeSearched);
		if(newNode==null)
		{
			MyNode<String> node = new MyNode<String>(wordToBeSearched);
			linkedListObject.append(node);
			System.out.println(wordToBeSearched+ " Found ");
				
		}
		else 
		{
			linkedListObject.delete(wordToBeSearched);
			System.out.println("The word is deleted");
		}
		linkedListObject.display();
		scanner.close();
	}
}






	
	

	
