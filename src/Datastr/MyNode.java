package Datastr;

public class MyNode <Ttype>{
	
	private Ttype element; 
	private MyNode rightChildNode = null;
	private MyNode leftChildNode = null;
	private MyNode parentNode = null;
	
	
	public Ttype getElement() {
		return element;
	}
	public MyNode getRightChildNode() {
		return rightChildNode;
	}
	public MyNode getParentNode() {
		return parentNode;
	}
	public MyNode getLeftChildNode() {
		return leftChildNode;
	}
	public void setElement(Ttype element) {
		if(element!=null) {
			this.element = element;
		}
		else {
			this.element= (Ttype) new Object();
		}
	}
	public void setRightChildNode(MyNode rightChildNode) {
		this.rightChildNode = rightChildNode;
	}

	public void setLeftChildNode(MyNode leftChildNode) {
		this.leftChildNode = leftChildNode;
	}

	public void setParentNode(MyNode parentNode) {
		this.parentNode = parentNode;
	}
	public MyNode (Ttype element) {
		setElement(element);
	}
	public String toString() {
		return " "+ element;
	}
	
}
