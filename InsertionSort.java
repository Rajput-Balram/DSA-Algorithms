package sorting_algos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort   {

	public static char[] insertionSort(char[] data) {
		int n =  data.length;
		for(int i=1; i<n; i++) {
			int j = i;
			char cur = data[j];
			while(j > 0 && data[j-1] > cur) {
				data[j] = data[j-1];
				j--;
			}
			data[j] = cur;
		}
		return data;
	} 
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = n > 0 ? n : 0;
		char[] arr = new char[n];
		for(int i=0; i<n; i++) {
			 
			arr[i] = (char) ((char) rand.nextInt(26) + 97);
		}
		 
		System.out.println("original character array:- "+Arrays.toString(arr));
		 
		System.out.println("sorted Array:- "+Arrays.toString(insertionSort(arr)));

	}
}
