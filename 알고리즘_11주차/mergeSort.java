package dkfrh_11;

public class mergeSort {
	public static int[] src;
	public static int[] tmp;
	public static void main(String[] args) {
		src = new int[]{98, 23, 45, 14, 6, 67, 33, 42};
		tmp = new int[src.length]; printArray(src);
		mergeSort(0, src.length-1); printArray(src);
		} 
	public static void mergeSort(int start, int end) {
		if (start<end) {
			int mid = (start+end) / 2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			int p = start;
			int q = mid + 1;
			int idx = p;
			while (p<=mid || q<=end) {
				if (q>end || (p<=mid && src[p]<src[q])) {
					tmp[idx++] = src[p++]; } else { tmp[idx++] = src[q++];
					}
				} 
			for (int i=start;i<=end;i++) {
				src[i]=tmp[i];
				}
			} 
		}
	public static void printArray(int[] a) {
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		}
	}

	