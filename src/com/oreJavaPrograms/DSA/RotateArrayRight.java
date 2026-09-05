package com.oreJavaPrograms.DSA;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int k = 5;
       int n = nums.length;
        k = k % n; //2

        reverse(nums, 0, n - 1);      
     reverse(nums, 0, k -1);      
        reverse(nums, k, n - 1);      

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
          arr[end] = temp;
            start++;
            end--;
        }
    }
}
