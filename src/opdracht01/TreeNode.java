package opdracht01;
import java.util.*;


public class TreeNode{
	int value;
	int key;
	String name;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int value, String name){
		this.value = value;
		this.name = name; 
	}
	
	public void Inorder(){
		Stack<TreeNode> pad = new Stack<TreeNode>();
		TreeNode current = this;
		
		while( current != null || !pad.isEmpty() ){
			if (current != null){ 		
				// zelf aanvullen, 2 regels
 				pad.push(current);
 				current = current.left;
 			}else{						
 				// zelf aanvullen, 3 regels
 				current = pad.pop();
 				System.out.print(current.value + ", ");
 				current = current.right;
	}
}
	}
}