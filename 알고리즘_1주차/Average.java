package week_1;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score;
		score = new int[10];
		score[0] = 78;
		score[1] = 88;
		score[2] = 72;
		score[3] = 98;
		score[4] = 45;
		score[5] = 67;
		score[6] = 71;
		score[7] = 76;
		score[8] = 89;
		score[9] = 100;
		int result = 0;
		int total = 1;
		while(total < 10) {
			
			result += score[total];
			total++;
		}
		
		int Avg = result/10;
		System.out.println("Æò±Õ°ª:"+Avg);
	}

}
