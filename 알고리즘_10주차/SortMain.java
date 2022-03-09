package dkfrh_10;
import java.util.*;
import java.util.Random;


public class SortMain {
	private static final int MAX = 6000; 
	private static int SIZE = 10000;
	public static void main(String[] args) {
		Random R = new Random();
		int a[] = new int[SIZE];
		int arr1[] = new int[SIZE];
		int arr2[] = new int[SIZE];
		int arr3[] = new int[SIZE];
		int arr4[] = new int[SIZE];
		long start_time, end_time, currentTime;
		
		/*for(int i=0;i<SIZE;i++) {  // 난수형
			a[i] = R.nextInt(MAX);
		}
		*/
		for(int i=SIZE;i>0;i--) {
			a[SIZE-i] = i;
		}
		
		for(int i=0;i<SIZE;i++) {  // 시간비교위해 같은 배열 사용
			arr1[i] = a[i];
			arr2[i] = a[i];
			arr3[i] = a[i];
			arr4[i] = a[i];
		}
		
		start_time = System.currentTimeMillis();
		SortMain.selectionsort(arr1);
		end_time = System.currentTimeMillis();
		currentTime = end_time - start_time;
		System.out.println("선택정렬 걸린시간 : "+currentTime + " (milisec)");
		
		start_time = System.currentTimeMillis();
		insertSort(arr2);
		end_time = System.currentTimeMillis();
		currentTime = end_time - start_time;
		System.out.println("삽입정렬 걸린시간 : "+currentTime + " (milisec)");
		
		start_time = System.currentTimeMillis();
		SortMain.bubbleSort(arr3, SIZE);
		end_time = System.currentTimeMillis();
		currentTime = end_time - start_time;
		System.out.println("버블정렬 걸린시간 : "+currentTime + " (milisec)");
		
		start_time = System.currentTimeMillis();
		SortMain.bubbleSortcheck(arr4, SIZE);
		end_time = System.currentTimeMillis();
		currentTime = end_time - start_time;
		System.out.println("플래그버블정렬 걸린시간 : "+currentTime + " (milisec)");
	}
	
	public static void insertSort(int[] a){
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j;
			
			for(j = i-1; j >= 0 && temp < a[j]; j--)
				a[j+1] = a[j];
			a[j+1] = temp;
		}
	}
	
	public static void selectionsort(int arr[]) { 
		int n = arr.length;
		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) { 
		// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 
		// Swap the found minimum element with the first 
		// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	}
	
	public static void bubbleSort(int arr[], int n) { 
		int i, j, temp; 
		boolean swapped; 
		
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) { 
				if (arr[j] > arr[j + 1]) { 
		// swap arr[j] and arr[j+1] 
					temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
				}
			}
		}
	}
	
	public static void bubbleSortcheck(int arr[], int n) { 
		int i, j, temp; 
		boolean swapped;
		
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) { 
				if (arr[j] > arr[j + 1]) {
		// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) break;
		}
	}
}

