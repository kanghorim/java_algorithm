package week_1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0; // ù���� sum
		int sum2 = 0; // �ι��� sum
		int sum3 = 0; // ������ sum
		int n = 100;
		
		sum1 = n*(n+1)/2; //ù���� ���
		
		for(int i = 1; i<=n; i++) { // �ι��� ���
			sum2=sum2+i;
		}
		
		for(int i=1; i<=n; i++) { // ������ ���
			for(int j = 1; j<=i; j++) {
				sum3 = sum3+1;
			}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}

}
