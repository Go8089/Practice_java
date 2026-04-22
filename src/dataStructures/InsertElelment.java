package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertElelment {
	static Scanner scann = new Scanner(System.in);
public static void insertElement() {
	List<Integer> list = new ArrayList<>();
	list.add(5);
	list.add(10);
	list.add(15);
	System.out.println("How many elements you want insert:");
	int num = scann.nextInt();
	for(int i = 0; i < num; i++) {
		System.out.println("Enter POSTION and VALUE:");
		int pos = scann.nextInt();
		int val = scann.nextInt();
		list.add(pos,val);
	}
	list.remove(1);
	for(int i : list) {
		System.out.print(i + " ");
	}
}
public static void  third(int[] arr) {
	Arrays.sort(arr);
	System.out.print(arr[arr.length - 3]);
}
public static void main(String[] args) {
	insertElement();
	//int[] arr = {6,89,34,9,13};
	//third(arr);
}
}
