package week_1;
import java.util.Scanner;
public class Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		for(int a=1; a<=9; a++) {
			int result = a*t;
			System.out.println(result);
		}
	}

}
