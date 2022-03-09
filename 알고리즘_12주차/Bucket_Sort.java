package dkfrh_12;
import java.util.Arrays;
public class Bucket_Sort {
	public static void sort(int[] a, int maxVal) {
	      int [] bucketArr=new int[maxVal+1];
	 
	      for (int i=0; i<bucketArr.length; i++) {
	         bucketArr[i]=0;
	      }
	 
	      for (int i=0; i<a.length; i++) {
	         bucketArr[a[i]]++;
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucketArr.length; i++) {
	         for (int j=0; j<bucketArr[i]; j++) {
	            a[outPos++]=i;
	         }
	      }
	   } 
	 
	   public static void main(String[] args) {
	      int maxVal=5;
	      int [] myArr= {5,3,0,2,4,1,0,5,2,3,1,4}; 
	 
	      System.out.println("Before: " + Arrays.toString(myArr));
	      sort(myArr,maxVal);
	      System.out.println("After:  " + Arrays.toString(myArr));
	   }
	}