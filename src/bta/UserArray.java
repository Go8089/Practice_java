package bta;

import java.util.Scanner;

public class UserArray {
int[] arr;
UserArray(int[] arr)
{
	this.arr = arr;
}
public void insert(int size, Scanner scann )
{
	 System.out.println("Set a values:");
	 for(int i = 0; i < size; i++)
	 {
		 this.arr[i] = scann.nextInt();
	 }
}
public int delete(int index)
{
	if(index == this.arr.length-1)
	{
		this.arr[index] = 0;
	}
	return 8;
}
public void replace(Scanner scann)
{
	boolean b = true;
	System.out.println("Enter a value and index:");
	while(true)
	{
		int value = scann.nextInt();
		int index = scann.nextInt();
		this.arr[index] = value;
		System.out.println("For more: type true, otherwise: type false");
		b = scann.nextBoolean();	
	}
}
public void show()
{
	int index = 0;
	for(int i: this.arr)
	{
		System.out.println("arr["+index+"]:" + " " + i);
		index++;
	}
}
 public static void main(String[] args)
 {
	 System.out.println("Enter the size of an array");
	 Scanner scann = new Scanner(System.in);
	 int size = scann.nextInt();
	 UserArray userArray = new UserArray(new int[size]);
	 userArray.insert(size, scann);
	 userArray.show();
	 System.out.println("for replace a value:");
	 userArray.replace(scann);
	// System.out.println("Delete a value please provide index number:");
	// int index = scann.nextInt();
	
	
 }
}
