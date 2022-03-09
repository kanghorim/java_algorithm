
class treearray {
	
	static int pancestor(char tree[],int i) {
			System.out.print(tree[i]+" ");
			if(i==1) {return 0;}
			else {
				i=i/2;
				pancestor(tree,i);
			}
			return 0;
	}
	static int pdescendant(char tree[],int i) {
			if(tree[i]=='\0') {return 0; }
			else {System.out.print(tree[i]+" ");
				pdescendant(tree,i*2);
			}
			return 0;
			}
	static int inorder(char tree[],int i) {
		if(tree[i*2]!='\0') {
				inorder(tree,i*2);
		}
		System.out.print(tree[i]+" ");
		if(tree[i*2+1]!='\0') {
				inorder(tree,i*2+1);
		}
		return 0;
	}
	static int postorder(char tree[],int i) {
		if(tree[i*2]!='\0') {
			postorder(tree,i*2);
		}
		if(tree[i*2+1]!='\0') {
			postorder(tree,i*2+1);
		}
		System.out.print(tree[i]+" ");
		return 0;
	}
	static int preorder(char tree[],int i){
		if(tree[i*2]!='\0') {
			System.out.print(tree[i]+" ");
			preorder(tree,i*2);
			preorder(tree,i*2+1);
		}
		return 0;
	}
	static void descendents(char T[],int i) {
		if(T[i]=='\0') {return;}
		else {
			System.out.print(T[i]+" ");
			descendents(T,i*2);
			descendents(T,i*2+1);
		}
	}
	
	public static void main(String[] args) {
		char[] tree=new char[50];
		tree[1]='A';
		tree[2]='B';
		tree[3]='C';
		tree[4]='D';
		tree[5]='E';
		tree[6]='F';
		tree[7]='G';
		tree[8]='H';
		tree[12]='k';                   
		pancestor(tree,5);
		pdescendant(tree,3);
		inorder(tree,1);
		preorder(tree,1);
		postorder(tree,1);
	}
}
