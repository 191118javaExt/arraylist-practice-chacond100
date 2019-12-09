package com.revature.list;

import java.util.Arrays;

public class MyArrayList {

	int i=0;
	int size=0;
	int length=10;
	int[]arr=new int[length];
	
	public void initializing() {
		for(i=0;i<length;i++) {			// makes all the elements of the array equal to -1
			arr[i]=-1;
			}
	}
		
	private void innerSize() {
		for(i=0;i<length;i++) { 		// if an element is not equal to -1, it will increase 
			if(arr[i]!=-1) {			// the value of the variable size
				++size;}
			}
		if(size+1>arr.length*3/4) {		// if size+1 is greater than the length*3/4, we will 
				length=length*2;				//double the size of the array.
			}
	}
	
	public void add(int val) {
			for(i=0;i<length;i++) {
				arr[size]=val;
				innerSize();
			}
		}

	public void set(int index, int val) {
		arr[index]=val;
		innerSize();
	}

	public void remove(int index) {
		arr[index]=-1;
		innerSize();
	}

	public int get(int index) {
		if(index<length+1) {
			return arr[index];
		} 
		innerSize();
		return 0;
	}

	@Override
	public String toString() {
		return "MyArrayList [arr=" + Arrays.toString(arr) + "]";
	}
}
