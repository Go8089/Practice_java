package dsa;

public class MatrixMultiplication {
	void main()
	{ 
	    int[][] arr = {{0,1},{1,0}};
		int[][] arr1 = {{3,4},{5,6}};
		int[][] arr3 = new int[arr.length][2];
		System.out.println(arr.length);
		System.out.println(arr1.length);
		int size = arr.length* arr[0].length;
		try {
		if(2 == arr.length) {
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length;j++ )
			{
				for(int k = 0; k < arr1.length; k++)
				{
				arr3[i][j] +=arr[i][k] * arr1[k][j];
				}
			}
		}
		}} catch(NullPointerException e)
		{
			
		}
		for(int[] i : arr3)
		{
			for(int j : i)
			{
				System.out.print(j + " ");
			} 
			System.out.println();
		}
		
	}
}
