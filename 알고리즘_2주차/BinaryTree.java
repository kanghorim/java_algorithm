import java.util.Scanner;

public class BinaryTree{
	private TreeNode root;
	public static int count;
	public static int leafcount;
	public TreeNode makenode(TreeNode leftv,int data,TreeNode rightv){
		root=new TreeNode(data);
		root.left=leftv;
		root.right=rightv;
		return root;
}

public void preOrder(TreeNode root){
	if(root!=null) {
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
public void postOrder(TreeNode root){
	if(root!=null) {
			
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}

public void inOrder(TreeNode root){
	if(root!=null) {
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
}
public int nodecount(TreeNode root){
	if(root!=null){
			this.count++;
			nodecount(root.left);
			nodecount(root.right);
		}
		return this.count;
}

public int leafCount(TreeNode root){
		if(root!=null){
				if((root.left==null)&&(root.right==null)){this.leafcount++;}
				nodecount(root.left);
				nodecount(root.right);
			}
			return this.leafcount;
		
		}

public int depthcount(TreeNode root) {
	if(root==null)
		return 0;
	else
		return(1+Math.max(depthcount(root.left),depthcount(root.right)));
}
}



	      

