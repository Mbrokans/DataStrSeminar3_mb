package Datastr;


public class MyHeap <Ttype>{
	private MyNode<Ttype> rootNode = null;
	private MyNode<Ttype> lastNode= null;
	private int howManyElements = 0;
	
	public int getHowManyElements() {
		return howManyElements;
	}
	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	public boolean isFull() {
		try {
			new MyNode('a');
			return false;
		} catch (OutOfMemoryError error) {
			return true;
		}

	}
}
