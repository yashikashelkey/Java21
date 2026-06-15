package javabasics;

public class Loop {
	public static void fibonacciSeries(int n) {
       
//        int firstNum = 0, secNum = 1;
//        for(int i=1; i<=n; i++) {
//            System.out.print(firstNum + " ");
//
//            int Nsum = firstNum + secNum;
//            firstNum = secNum;
//            secNum = Nsum;
            
            //with while loop
//    		int i = 1;
//    		int firstNum = 0, secNum = 1;
//    		while(i <= n) {
//    		    System.out.print(firstNum + " ");
//    		    
//    		    int sum = firstNum + secNum;
//    		    firstNum = secNum;
//    		    secNum = sum;
//    		    
//    		    i++;  
    		    
    		    //do while loop
    		    int firstNum =0, secNum = 1;
    			int i =1;
    			do {
    			    System.out.print(firstNum + " ");
    			    
    			    int sum = firstNum + secNum;
    			    firstNum = secNum;
    			    secNum = sum;
    			    
    			    i++;
    			    
    			} while(i <= n);  
    			int a = 10;
    			int b = 20;
//    			int temp = a;
//    			 a = b;
//    			 b = temp;
    			a = a+b;
    			b = a-b;
    			a = a-b;
    			 System.out.println("a :" + a);
    			 System.out.println("b :" + b);
    		
    }
	
	public static int linearSearch(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void bubbleSort(int nums[]) {
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void printArray(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	public static void main(String[] args) {
//		fibonacciSeries(5);
		
		//linear search 
		int arr[] = {2, 8, 34, 25, 67, 89, 21, 5, 15};
		int target = 21;
		int ans = linearSearch(arr, target);
		System.out.println("The elment found at index : " + ans );
		
		//bubble sort
		int nums[] = {12, 34, 55, 8, 42, 96, 9};
		bubbleSort(nums);
		printArray(nums);
		
		
	}
}
