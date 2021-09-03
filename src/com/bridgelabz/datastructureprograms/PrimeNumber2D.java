package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;

public class PrimeNumber2D {
	public static void main(String [] args) {
		ArrayList<ArrayList<Integer>> primesArrayList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		int stop=0;
		for(int index=2;index<1000;index++) {
			boolean flag = true;
			for(int k=2;k<=index/2;k++) {
				if(index%k == 0) flag = false; 
			}
			if(stop<100) {
				if(flag) {
					myArrayList.add(index);
					
				}
				stop++;
			}
			else {
				stop=0;
				primesArrayList.add(myArrayList);
				myArrayList = new ArrayList<Integer>();
				myArrayList.add(index);
				stop++;
			}
		}
		System.out.println();
		for(int index=0;index<primesArrayList.size();index++) {
			System.out.println(primesArrayList.get(index)+" ");
		}
	}
}
