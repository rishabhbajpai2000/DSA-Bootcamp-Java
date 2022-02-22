package com.kunal;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int val = nums[i];
            if (i == val - 1){
                i++;
            } 
            else{
                if (nums[val-1] == val){
                    return val;
                }
                else{
                    swap(nums, i, val-1);
                }
            }
        }
        return -1;
    }

    
    void swap(int[] arr, int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }
}
