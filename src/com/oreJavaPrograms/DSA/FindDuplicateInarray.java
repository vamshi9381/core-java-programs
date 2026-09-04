package com.oreJavaPrograms.DSA;

public class FindDuplicateInarray {
	public static void main(String args[]) {
		int arr[]= {10,20,30,50};
		boolean found =false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;i++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate");
					found =true;
					break;
				}
				
			}
		
			if(found) {
				break;
			}
		}
	
			if(!found) {
				
				System.out.println(" not");
			
		}
		
	}
}

