package opdracht01;

public class Traversal {
	
	public void inOrder{
		TreeNode<E> current = root; //Begin bij root
		Stack<TreeNode> pad = new Stack<>();
		  
 		while( current != null || !pad.isEmpty() ){
 			if ( current != null){
 				pad.push(current);
 				current = (Boom)current.getChildAt(Boom.LEFT);
 			}else{
 				current = this.pad.pop();
 				System.out.println(current.toString());
 				current = (Boom) current.getChildAt(Boom.RIGHT);
 			}
 		}
	}
	
	public void preOrder{
		TreeNode<E> current = root; //Begin bij root
		Stack<TreeNode> pad = new Stack<>();
		while(current != null || !pad.isEmpty()){
			if(current != null){
				System.out.println(current.toString());
				pad.push(current);
				current = (Boom) current.getChildAt(Boom.LEFT);
			}else{
				current = (Boom) pad.pop();
				current = (Boom) current.getChildAt(Boom.RIGHT);
			}
		}
	}
	
	public void postOrder{
		TreeNode<E> current = root; //Begin bij root
		Stack<TreeNode> pad = new Stack<>();
		while( current != null || !pad.isEmpty() ){
			if ( current != null){
				pad.push(current);
				current = (Boom) current.getChildAt(Boom.LEFT);
			}else{
				current = this.pad.pop();
				current.visit();
				System.out.println(current.toString());
				
				if( (current = this.pad.pop() ).secondPop()){
					pad.push(current);
					current = null;
				}else{
					current.visit();
					pad.push(current);
					current = (Boom) current.getChildAt(Boom.RIGHT);	
				}
			}
		}
	}
}
