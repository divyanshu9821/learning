package com.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxInArrayTesting {
	
	MaxInArray mia = new MaxInArray();
	
	@Test
	public void maxEleTestPositive() {
		int[] arr= {1,2,3,4,4};
		int maxArr = mia.maxEle(arr);
		int[] arr1 = {5,4,3,6,7,8,1};
		int maxArr1 = mia.maxEle(arr1);
		int[] arr2 = {45,3,23,512387,6657,8989,4434};
		int maxArr2 = mia.maxEle(arr2);
		
		assertAll(()->assertEquals(4,maxArr),
				()->assertEquals(8,maxArr1),
				()->assertEquals(512387,maxArr2));
		
	}
	
	@Test
	public void maxEleTestNegative() {
		int[] arr= {134,66,3,61,4};
		int maxArr = mia.maxEle(arr);
		int[] arr1 = {55,489,333,698,7555,809,10};
		int maxArr1 = mia.maxEle(arr1);
		assertAll(()->assertEquals(7,maxArr),()->assertEquals(40,maxArr1));
		
		
	}
	
}
