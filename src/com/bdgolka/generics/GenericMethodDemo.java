package com.bdgolka.generics;

//An example of generic method
public class GenericMethodDemo {

	// Determine whether the contents of two arrays are the same
	static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y){
		
		//Arrays have the different sizes can't be the same
		if (x.length != y.length) return false;
		
		for (int i = 0; i < x.length; i++){
			if(!x[i].equals(y[i]))
				return false;//arrays are different
		}
		return true;
	}
	
	public static void main (String[] args) {
		
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5};
		Integer nums3[] = {1, 2, 7, 4, 5};
		Integer nums4[] = {1, 2, 7, 4, 5,6};
		
		if(arrayEqual(nums, nums))
			System.out.println("nums are equivalent nums");
		
		if(arrayEqual(nums, nums2))
			System.out.println("nums are equivalent nums2");
		
		if(arrayEqual(nums, nums3))
			System.out.println("nums are equivalent nums2");
	}
}
