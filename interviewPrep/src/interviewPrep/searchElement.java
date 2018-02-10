package interviewPrep;

import java.util.Scanner;

/**
 * @author Tina
 * Created on: 3/8/17
 * File name: searchElement
 *  
 */

class searchElement{
	
	/**
	 *  The function findElementifExists is to search for an element and return its index 
	 *  if it exists in the array and return -1 if it does not exist.
	 *  It takes 2 arguments, the array to search upon, and the number to be searched for.
	 */
	public static int findElementifExists(int[] arr, int num){
		int low = 0;
		int high = arr.length -1; 
		
		while(low <= high){
			int mid = (high + low)/2;
			if(arr[mid] < num) 
				low = mid +1;
			else if(arr[mid] > num) 
				high = mid -1;
			else return mid;
		}
		return -1;	
	}
	
	public static void main(String[] args){
		int arr[] = {-5, -2, 1, 5, 10, 20};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to search in the array: ");
		int num = in.nextInt();
		int index = findElementifExists(arr, num);
		System.out.print(index);
	}
}
