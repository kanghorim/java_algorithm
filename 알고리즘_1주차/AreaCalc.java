package week_1;

public class AreaCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(30, 15);
		t1.getArea();
		System.out.println("�ﰢ���� ���� = " + t1.area);
		Rectangle r1 = new Rectangle(30, 15);
		r1.getArea();
		System.out.println("�簢���� ���� = " + r1.area);
	}
}
	interface Shape{
		void getArea();
	}
	class Triangle implements Shape{
		int x, y;
		double area;
		Triangle(int x, int y){
			this.x = x;
			this.y = y;
		}
		public void getArea(){
			this.area = (this.x * this.y)/2; //�� �κ��� ä����
		}
	}
	class Rectangle implements Shape{
		int x, y;
		double area;
		Rectangle(int x, int y){
			this.x = x;
			this.y = y;
		}
		public void getArea(){
			this.area = this.x * this.y;
		}
	}
