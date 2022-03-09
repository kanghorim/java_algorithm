package week_1;

class InrerfaceReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A memo; // A인터페이스형 참조 변수 memo 선언
		memo = new C1();
		// 클래스 C1의 객체를 생성하여 memo에 할당
		memo.display("안녕하세요? ");
		memo = new C2();
		memo.display("알기쉽게 해설한 자바.");
		memo = new C3();
		memo.display("자바를 자바봅시다.");
	}
}
	interface A { //A를 사용하여 찍어낼 수 없다.
		void display(String s);
	}
	class C1 implements A {
		public void display(String s) {
			System.out.println("클래스 C1 객체 이용 : " + s);
			}
	}
	class C2 implements A {
		public void display(String s) {
			System.out.println("클래스 C2 객체 이용 : " + s);
		}
	}
	class C3 implements A {
		public void display(String s) {
			System.out.println("클래스 C3 객체 이용 : " + s);
		}
	}

