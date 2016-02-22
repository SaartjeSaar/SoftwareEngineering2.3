package opdracht01;

import java.util.Enumeration;
import javax.swing.tree.TreeNode;

public class Boom implements TreeNode {

	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	
	private String name;
	
	private TreeNode[] children;
	private TreeNode parent;
	
	private boolean secondPop;
	private int popped;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Boom(String name){
		this.name = name;
		this.secondPop = false;
		this.popped = 0;
		
		children = new TreeNode[2];
	}
	

	@Override
	public String toString(){
		return this.name;
	}
	
	@Override
	public Enumeration<TreeNode> children() {
		throw new UnsupportedOperationException("this has not yet been implemented");
	}

	@Override
	public boolean getAllowsChildren() {
		if(children[LEFT] != null && children[RIGHT] != null){
			return false;
		}else {
			return true;
		}
	}

	@Override
	public int getChildCount() {
		int count = 0;
		
		if(children[LEFT] != null){
			count++;
		}
		
		if(children[RIGHT] != null){
			count++;
		}
		
		return count;
		
	}

	@Override
	public int getIndex(TreeNode node) {
		throw new UnsupportedOperationException("this has not yet been implemented");
	}

	@Override
	public TreeNode getParent() {
		return this.parent;
	}
	
	public void setParent(Boom node){
		this.parent = node;
	}
	
	
	public void addChild(Boom child){
		if(children[LEFT] == null){
			children[LEFT] = child;
		}else if(children[RIGHT] == null){
			children[RIGHT] = child;
		}else{
			throw new IndexOutOfBoundsException("no children allowed");
		}
		
		child.setParent(this);
		
	}

	@Override
	public boolean isLeaf() {
		if(children[LEFT] == null && children[RIGHT] == null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public TreeNode getChildAt(int childIndex) {
		if(childIndex == LEFT || childIndex == RIGHT ){
			return children[childIndex];
		}else{
			throw new IllegalArgumentException("the index provided should be either 1 or 0");
		}
		
	}
	
	public boolean secondPop(){
		return this.secondPop;
	}
	
	public void visit(){
		this.popped++;
		if(this.popped == 1){
			this.secondPop = true;
		}
	}	
}

  
