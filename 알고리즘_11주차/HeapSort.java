package dkfrh_11;
import java.util.Arrays;
import java.util.Random;

public class HeapSort {
	static final int N = 10;

    public static void main(String[] args) {
        Random random = new Random(); // �����Լ��� �̿�

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(100); // 0 ~ 99
        }

        System.out.println("���� ��: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("���� ��: " + Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;

        // maxHeap�� ����
        // n/2-1 : �θ����� �ε����� �������� ����(i*2+1) ������(i*2+2)
        // �� �ڽĳ�带 ���� ��Ʈ�� �ִ� ��������
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // �Ϲ� �迭�� ������ ����
        }

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0); // ��Ҹ� ������ �� �ٽ� �ִ����� ����
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // ���� �ڽĳ��
        if (l < n && arr[p] < arr[l])
            p = l;
        // ������ �ڽĳ��
        if (r < n && arr[p] < arr[r])
            p = r;

        // �θ��� < �ڽĳ��
        if (i != p) {
            swap(arr, p, i);
            heapify(arr, n, p);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
