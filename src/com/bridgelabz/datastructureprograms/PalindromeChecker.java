package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.linkedlist.Deque;

public class PalindromeChecker {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String string = sc.nextLine();
			char[] array = string.toCharArray();
			Deque<Character> myDeque = new Deque<Character>();
			for(char ch : array) {
				myDeque.addRear(ch);
			}
			int flag=1;
			while(myDeque.size()>1) {
				if(myDeque.size() == 2) {
					if(myDeque.removeFront() == myDeque.removeFront()) 
					{
						flag=1;
					}
					else 
					{
						flag=0;
						break;	
					}		
				}
				if(myDeque.removeFront() != myDeque.removeRear()) {
					flag=0;
					break;
				}	
			}
			if(flag==1) {
				System.out.println("The String "+string+" Is palindorme");
			}
			else {System.out.println("The String "+string+" Is not palindorme");}
			sc.close();
		}
	}

