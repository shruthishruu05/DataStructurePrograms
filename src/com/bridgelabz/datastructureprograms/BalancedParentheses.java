package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.linkedlist.MyStack;


public class BalancedParentheses {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an expression");
		String expression =sc.nextLine();
		MyStack<Character> stack = new MyStack();
		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='(')
			{
				stack.push('(');
			}
			else if(expression.charAt(i)==')')
			{
				int res = stack.pop();
				if (res==-1)
				{
					System.out.println("not balanced");
				}
			}
			
		}
		if(!(stack.isEmpty()))
		{
			System.out.println("not balanced");
		}
		else
		{
			System.out.println("is balanced");
		}
	}

}
