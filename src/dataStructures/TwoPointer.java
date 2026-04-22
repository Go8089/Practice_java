package dataStructures;

import java.util.Arrays;
import java.util.HashMap;

public class TwoPointer {
public int[] moveZerosToEnd(int[] arr) {
	int left = 0;
	for(int right = 0; right < arr.length; right++) {
		if(arr[right] != 0) {
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
		}
	}
	return arr;
}
public int containerWithMostWater(int[] arr) {
	int left = 0;
	int right = arr.length -1;
	int max = 0;
	while(left < right) {
		int width = right - left;
		int minheight = Math.min(left, right);
		int area = minheight * width;
		max = Math.max(max, area);
		if(arr[left] < arr[right])
		{
			left++;
		}
		else
		{
			right--;
		}
	}
	return max;
}
public String longestPalindromeSubString(String s) {
	String result = "";
	int maxlen = 0;
	for(int i = 0; i < s.length() - 1; i++) {
		String addlongestpalin = "";
		for(int j = i; j < s.length(); j++) {
			addlongestpalin += s.charAt(j);
			if(palindrome(addlongestpalin)) {
				if(s.length() > maxlen) {
					maxlen = s.length();
					result = addlongestpalin;
				}
			}
		}
	}
	return s;
}
public boolean palindrome(String s) {
	int left = 0;
	int right = 0;
	if(s.charAt(left) != s.charAt(right)) {
		return false;
	}
	else {
		left++;
		right--;
	}
	return true;
}

public int[] twoSum(int[] arr, int target) {
 Arrays.sort(arr);
 int left = 0;
 int right = 0;
 while(left < right) {
	 int sum = arr[left] + arr[right];
	 if(sum == target) 
		 return new int[]{left, right};
	 else if(sum < target) 
		 left++;
	 else
		 right--;
 }
 return new int[] {0,0};
}
 
}

