package com;

public class RangeSumofBST {
	static TreeNode root;
	static int sum=0;
	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int val)
		{
			this.val=val;
		}
	}

	public static void main(String[] args) {
		root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.right=new TreeNode(15);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(7);
		root.right.right=new TreeNode(18);
		System.out.println(rangeSumBST(root, 7, 15));
		
	}
	public static int rangeSumBST(TreeNode root, int L, int R) {
	        
		if(root==null)
			return sum;
		
		if(root.val>=L && root.val<=R)
		{
			sum=sum+root.val;
		}
		rangeSumBST(root.left, L, R);
		rangeSumBST(root.right, L, R);
		
		return sum;
	    }
}
