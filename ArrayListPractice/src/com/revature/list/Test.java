package com.revature.list;

public class Test {

public static void add(int val) {
		
		int i=0;
		int size=0;
		int length=10;
		int[]arr=new int[length];

		for(i=0;i<length;i++) {			//makes all the elements of the array equal to -1
			arr[i]=-1;
			}
		for(i=0;i<length;i++) { 		// if an element is not equal to -1, it will increase 
			if(arr[i]!=-1) {			// the value of the variable size
				++size;}
			}
		if(size+1>arr.length*3/4) {			// if size+1 is greater than the length*3/4, we will 
				length*=2;					//double the size of the array.
			}
		for(i=0;i<length;i++) {
			arr[size]=val;
		}
		for(i=0;i<length;i++) {
		System.out.println(arr[i]);
		}
}

public static void main(String[] args) {
	add(5);
}
}