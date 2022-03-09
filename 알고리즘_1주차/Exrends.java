package week_1;

public class Exrends {
	class A{
		int i;
		int j;
		
		void setij(int x, int y) {
			i = x;
			j = y;
		}
	}
	class B extends A{
		int total;
		void sum() {
			total = i+j;
		}
	
	}
	class Access{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B subOb = new B();
		subOb.sum();
	}

}
}
