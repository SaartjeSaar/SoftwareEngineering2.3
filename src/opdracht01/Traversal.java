package opdracht01;

public class Traversal{
	TreeNode root;
	
	
	public void addNode(int key, String name){
		TreeNode t = new TreeNode(key, name);
		
		if(root==null){
			root = t;
		}else{
			TreeNode focusNode = root;
			TreeNode parent;
			
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.left;
					if (focusNode == null){
						parent.left = t;
						return;
					}
				}else{
					focusNode = focusNode.right;
					if(focusNode == null){
						parent.right = t;
						return;
					}
				}
			}
		}
	}
	
	public static void main(String[] args){
		t.addNode(50, "Person");
		t.addNode(51, "Employee");
		t.addNode(52, "Engineer");
		t.addNode(56, "Local_Customer");
		t.addNode(58, "US_Customer");
		t.addNode(59, "Regional_Customer");
		t.addNode(60, "Customer");
		t.addNode(100, "Non_US_Customer");
		
	}
}
