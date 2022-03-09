package week_1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0; // 첫번쨰 sum
		int sum2 = 0; // 두번쨰 sum
		int sum3 = 0; // 세번쨰 sum
		int n = 100;
		
		sum1 = n*(n+1)/2; //첫번쨰 방법
		
		for(int i = 1; i<=n; i++) { // 두번쨰 방법
			sum2=sum2+i;
		}
		
		for(int i=1; i<=n; i++) { // 세번쨰 방법
			for(int j = 1; j<=i; j++) {
				sum3 = sum3+1;
			}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}

}
