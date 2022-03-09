package dkfrh_12;
import java.util.Arrays;
public class CountingSort {
public static void main(String[] args) {
		
		int[] array = new int[15];		// ������ ���� : 100��
		int[] counting = new int[10];	// ���� ���� : 0 ~ 30
		int[] result = new int[15];	// ���� �� �迭 
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10);	// 0 ~ 30
		}
 
		
		// Counting Sort
		// ���� 1 
		for(int i = 0; i < array.length; i++) {
			// array �� value ���� index �� �ϴ� counting �迭 �� 1 ���� 
			counting[array[i]]++;			
		}
		
		// ���� 2 
		for(int i = 1; i < counting.length; i++) {
			// ���� �� ���ֱ� 
			counting[i] += counting[i - 1];
		}
		
		// ���� 3
		for(int i = array.length - 1; i >= 0; i--) {
			/*
			 *  i ���� ���Ҹ� �ε����� �ϴ� counting �迭�� 1 ���ҽ�Ų �� 
			 *  counting �迭�� ���� �ε����� �Ͽ� result�� value ���� �����Ѵ�.
			 */
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		
		
		/* �� ��� */
		
		// �ʱ� �迭 
		System.out.println("array[]");
		for(int i = 0; i < array.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n\n");
		
		
		// Counting �迭 
		System.out.println("counting[]");
		for(int i = 0; i < counting.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(counting[i] + "\t");
		}
		System.out.println("\n\n");
		
		
		// ���ĵ� �迭
		System.out.println("result[]");
		for(int i = 0; i < result.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(result[i] + "\t");
		}
		System.out.println();
	}
 
}
