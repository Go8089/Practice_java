 package dataStructures;

import java.util.HashSet;

public class SlidingWindow {
 public int longestSubstringWithOutRepeatingCharacter(String s) {
	 HashSet<Character> h = new HashSet<>();
	 int left = 0;
	 int maxlen = 0;
	 for(int right = 0; right < s.length(); right++) {
		 while(h.contains(s.charAt(right))) {
			 h.remove(s.charAt(left));
			 left++;
		 }
		 h.add(s.charAt(right));
		 maxlen = Math.max(maxlen, right - left + 1);
	 }
	 return maxlen;
 }
 public double MaximumAverageSubarray(int[] nums, int k) {
	 int sum = 0;
	 for(int i = 0; i < k; i++) {
		 sum += nums[i];
	 }
	 
	 int maxsum = sum;
	 
	 for(int i = k; i < nums.length; i++) {
		sum -= nums[i];
		sum += nums[i - k];
		maxsum = Math.max(maxsum, sum);
	 }
	 
	return (double) maxsum / k;
	 
 }
}
