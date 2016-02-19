package leertaak2vraag1;
import java.util.*;

public class inOrder {
	
	TreeNode root;
	Stack <TreeNode> pad;
	
	public inOrder(TreeNode person) {
		// TODO Auto-generated constructor stub
	}

	public void traversal() {
		TreeNode current = this.root;
		
		while( current != null || !pad.isEmpty() ){
			if ( current != null){
				pad.push(current);
				current = current.getChildAt(TreeNode.LEFT);
			}else{
				current = this.pad.pop();
				System.out.println(current.toString());
				current = current.getChildAt(TreeNode.RIGHT);
			}
		}
	}
}
