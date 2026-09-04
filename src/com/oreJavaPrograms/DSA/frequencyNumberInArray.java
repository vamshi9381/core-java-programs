package com.oreJavaPrograms.DSA;

public class frequencyNumberInArray {
	public static void main(String args[]) {
	int arr[]= {1,2,2,3,1,1};
	int n =arr.length;
	int count=1;
	boolean visited[] =new boolean[n];
	for(int i=0;i<arr.length;i++) {
		if(visited[i]) {
			
			continue;
		}
		count=0;
		for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				visited [j]=true;
				count++;
			}
			
		}
		System.out.println(""+arr[i]+" -> "+count);
		
		
	}


}
}