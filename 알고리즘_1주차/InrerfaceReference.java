package week_1;

class InrerfaceReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A memo; // A�������̽��� ���� ���� memo ����
		memo = new C1();
		// Ŭ���� C1�� ��ü�� �����Ͽ� memo�� �Ҵ�
		memo.display("�ȳ��ϼ���? ");
		memo = new C2();
		memo.display("�˱⽱�� �ؼ��� �ڹ�.");
		memo = new C3();
		memo.display("�ڹٸ� �ڹٺ��ô�.");
	}
}
	interface A { //A�� ����Ͽ� �� �� ����.
		void display(String s);
	}
	class C1 implements A {
		public void display(String s) {
			System.out.println("Ŭ���� C1 ��ü �̿� : " + s);
			}
	}
	class C2 implements A {
		public void display(String s) {
			System.out.println("Ŭ���� C2 ��ü �̿� : " + s);
		}
	}
	class C3 implements A {
		public void display(String s) {
			System.out.println("Ŭ���� C3 ��ü �̿� : " + s);
		}
	}

