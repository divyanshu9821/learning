package com.junit;

public class MaxInArray {
	public int maxEle(int[] arr) {
		int maxi = arr[0];
		for(int i = 0;i<arr.length;i++) {
			maxi = (maxi<arr[i])?arr[i]:maxi;
		}
		return maxi;
	}
}
