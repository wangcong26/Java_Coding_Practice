/**
 * Definition for a binary tree node.
 * public class TreeNode 
 {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 

// Given a binary tree, return the preorder traversal of its nodes' values.

class Solution 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
     	// Make a list of integer
	    List<Integer> myList =  new LinkedList<Integer>();
		
	// If the root is null, return myList.
        if(root==null)
            return myList;
			
	// Add the integer to myList
        myList.add(root.val);
		
	// Below is recursive way to add all the integers.
        myList.addAll(preorderTraversal(root.left));
        myList.addAll(preorderTraversal(root.right));
        return myList;
    }
}
