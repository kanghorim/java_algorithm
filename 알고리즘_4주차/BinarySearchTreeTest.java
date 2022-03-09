package chap2;

class TreeNode {
	String key;
	TreeNode left;
	TreeNode right;
}

class BinarySearchTree {
	private TreeNode rootNode;

	private TreeNode insertKey(TreeNode T, String x) {
		// insert()�޼ҵ忡 ���� ���Ǵ� ���� ��ȯ �޼ҵ�
		if (T == null) {
			TreeNode newNode = new TreeNode();
			newNode.key = x;
			return newNode;
		} else if (x.compareTo(T.key) < 0) {// x<T.key�̸� x��
			T.left = insertKey(T.left, x); // T�� ���ʼ���Ʈ���� ����
			return T;
		} else if (x.compareTo(T.key) > 0) {// x>T.key�̸� x��
			T.right = insertKey(T.right, x); // T�� �����ʼ���Ʈ���� ����
			return T;
		} else { // key�� x�� �̹� T�� �ִ� ���
			return T;
		}
	}// ���Ժ�����

	void insert(String x) {
		rootNode = insertKey(rootNode, x);
	}// ���Գ�

	TreeNode find(String x) { // Ű�� x�� ������ �ִ� TreeNode��
		TreeNode T = rootNode; // �����͸� ��ȯ
		int result;
		while (T != null) {
			if ((result = x.compareTo(T.key)) < 0) {//�������� ����
				T = T.left;//ä����
			} else if (result == 0) { //ã����
				return T;
			} else { // ���������� ����.
				T = T.right;
			}
		}
		return T;
	}// ã�ⳡ

	private void printNode(TreeNode N) {
		// printBST() �޼ҵ忡 ���� ���Ǵ� ��ȯ �޼ҵ�
		if (N != null) {
			System.out.print("(");
			printNode(N.left);
			System.out.print(N.left);//������ȸ������� ���, �� �κ��� ä����
			printNode(N.right);
			System.out.print(")");
		}
	}// ��º�����

	void printBST() {
		// Ʈ���� ��ȣ�� ����Ͽ� ���
		printNode(rootNode);
		System.out.println();
	}// ��³�

	void delete(String x) {
		rootNode = deleteKey(rootNode, x);
	}

	TreeNode deleteKey(TreeNode T, String x) {
		TreeNode p;
		TreeNode parent;
		TreeNode q;
		p = T;
		parent = null;

		while (p != null && p.key != x) {  //�����ϰ����ϴ� Ű Ž��
			parent = p;
			if (( x.compareTo(p.key)) < 0) {
				p = p.left;
			} else {
				p = p.right;
			}
		}// ��Ʈ�κ��� Ž���Ͽ� key���� ���� ��带 ã�� p�� ����
			// parent�� ã�� ��� �������� �����ص�

		if (p == null)
			return null; //������ ���Ұ� ����

		if (p.left == null && p.right == null) { // �ڽ��� ���� ���
			//ä����
			if(parent.left ==p) {
				parent.left = null;
			}else {
				parent.right = null;
			}
		}

		else if (p.left == null || p.right == null) { // �ڽ��� �ϳ� ������
			//ä���� 
		if(p.left!=null) {
			if(parent.left ==p) {
				parent.left = p.left;
			}else {
				parent.right = p.left;
			}
		}else {
			if(parent.left ==p) {
				parent.left = p.right;
			}else {
				parent.right = p.right;
			}
		}}
		else if (p.left != null && p.right != null) {// �ڽ��� �� �� ���� ��
			q = maxNode(p.left);
			p.key = q.key;
			deleteKey(p.left, p.key);
		}// �ڽ��� �Ѵ� �ִ� ���
		return T;
	}

	TreeNode maxNode(TreeNode B) { // ����Ʈ���� �ִ���Ҹ� ����
		TreeNode p;
		p = B;
		if (p == null)
			return p;
		else if (p.right == null)
			return p;
		else {
			while (p.right != null) {
				p = p.right;
			}
			return p;
		}
	}

	
}// BinarySearchTree ��

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree T = new BinarySearchTree();
		T.insert("S");
		T.insert("J");
		T.insert("B");
		T.insert("D");
		T.insert("U");
		T.insert("M");
		T.insert("R");
		T.insert("Q");
		T.insert("A");
		T.insert("G");
		T.insert("E");
		// ���� �����Ͽ� ppt 2���� Ʈ���� ����

		System.out.println("��Ʈ����");
		T.printBST();
		System.out.println("�� ���� ������ �ֽ��ϴ�.");
		// ����� ����Ž��Ʈ�� ���

		System.out.println("���� �˻��մϴ�.");
		String key = "G"; //Ű���� �����ϸ鼭 �׽�Ʈ�غ���
		TreeNode P = T.find(key);
		if (P != null) {
			System.out.println("ã���ô� �� " + key + "�� Ž��������.");
		} else {
			System.out.println("ã���ô� �� " + key + "�� Ž�������Ͽ���.");
		}// key���� Ž���ϰ� ���
		System.out.println();
		
		
		
		System.out.println(key + "���� �����մϴ�.");
		T.delete(key);

		System.out.println("�ٽ� ���� �˻��մϴ�.");
		P = T.find(key);
		if (P != null) {
			System.out.println("ã���ô� �� " + key + "�� Ž��������.");
		} else {
			System.out.println("ã���ô� �� " + key + "�� Ž��������.");
		}
		System.out.println();
		
		
	}// ���� ��
}// BinarySearchTreeTest ��
