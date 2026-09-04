package com.oreJavaPrograms.DSA;

public class IntersectionBruteForce {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3};
        int[] B = {2, 2, 4};
boolean visited = false;
        for(int i=0;i<A.length;i++) {
        	boolean visited1 =false;
        
        	for(int j=0;j<i;j++) {
        		if(A[j]==B[i]) {
        	
        		visited1 =true;
        		break;
        	}
        	}
        	if(visited1) {
        		continue;
        	}
        	
        	for(int k=0;i<B.length;k++) {
        		if(A[i]==B[k]) {
        			System.out.println(A[i]);
        			break;
        		}
        	}
        		
        	}
        		
        	}
        }