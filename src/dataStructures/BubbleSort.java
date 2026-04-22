package dataStructures;

import java.util.Scanner;

public class BubbleSort {
private int[] arr;
public void setArray(int[] arr)
{
	this.arr=arr;
}
public void bubbleSort()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter size of an array:");
	int size = scan.nextInt();
	System.out.println("enter an array for bubble sort:");
	int[] arr = null;
	for(int i = 0; i < size; i++ )
	{
		arr[i] = scan.nextInt();
	}
	
	BubbleSort bubble = new BubbleSort();
	bubble.setArray(arr); 
}

}
