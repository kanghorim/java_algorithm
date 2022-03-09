package dkfrh_12;
import java.util.Arrays;
import java.util.Random;

public class ArraySort {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ShellSort shell = new ShellSort(); 
		//int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
		int [] array= new int[100000000];	
		int [] temp = new int[100000000];
		int [] temp2 = new int[100000000]; 
		Random R = new Random();
		  for(int i=0; i<array.length; i++)
		  {
			  //a[i]=i;//����
			  array[i]=R.nextInt(100000000);//����
			  temp[i] = array[i];
			  temp2[i]=array[i];
		  }
		
		////////�ڹ� ���� ���� �Լ�//////////////////////////////
		//Array.sort(array, 2,7);		
		try{
			long start = System.currentTimeMillis();
			Arrays.sort(array); //����
			long end = System.currentTimeMillis();
			long diff = end - start; 
			System.out.println("�ڹ� ���� ���� ����ð�:"+diff);			
		}catch(Exception e){System.out.println("���� �߻�");}
		//printArray("Sorted array", array);
		//int index = Arrays.binarySearch(array, 4); //����Ž��
		//System.out.println("Found 4 @"+index);// 4�� ����濡 �ֳ�?
		
		
		
		/////////shellsort/////////
		try{
			long start = System.currentTimeMillis();
			shell.shellSort(temp2);
			long end = System.currentTimeMillis();
			long diff = end - start; 
			System.out.println("shell ����ð�:"+diff);			
		}catch(Exception e){System.out.println("���� �߻�");}		
	}
	private static void printArray(String message, int array[])
	{
		System.out.println(message + ": [length:"+ array.length+"]");
		for(int i=0; i<array.length; i++)
		{
			if(i != 0)
			{
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
		
	}

}
