package week_1;

class Avg{ 
	double avg;
	Avg(){} 
	Avg(double avg){
		this.avg = avg;
		} 
	void average(int sum) {
		avg = (double)sum / 2;
		System.out.println("Æò±Õ : " + avg);
		}
}
class Total extends Avg{
	int total;
	int math;
	int eng;
	Total(int math, int eng) {
		this.math = math;
		this.eng = eng;
		this.total = this.math + this.eng;
		System.out.println("ÃÑÁ¡ : " + this.total); 
		average(this.total);
		}
	}

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total t1 = new Total(100, 200);
	}

}
