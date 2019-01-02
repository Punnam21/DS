package linkedDS;

public class DoubleLinkedListNode {

	private int data;
	private DoubleLinkedListNode previousNode;
	private DoubleLinkedListNode nextNode;
	
	
	public DoubleLinkedListNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public DoubleLinkedListNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleLinkedListNode previousNode) {
		this.previousNode = previousNode;
	}

	public DoubleLinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleLinkedListNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString(){		
		return "data: "+ this.data;
	}
}
