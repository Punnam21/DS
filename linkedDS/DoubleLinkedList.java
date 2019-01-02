package linkedDS;

public class DoubleLinkedList {
	private DoubleLinkedListNode head;
	
	public void insertAtHead(int data){
		
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);
		newNode.setNextNode(this.head);
		
		if(this.head != null){
			this.head.setPreviousNode(newNode);			
		}
		this.head = newNode;		
		
	}
	
	public void insertAtTail(int data){
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);
		
		DoubleLinkedListNode current = this.head;
		
		while(current != null){
			
			if(current.getNextNode() == null){
				newNode.setPreviousNode(current);
				current.setNextNode(newNode);
				break;
			}
			current = current.getNextNode();
			
		}		
		//this.head = newNode;
		
	}
	
	public int lenght(){
		
		int lenght = 0;		
		DoubleLinkedListNode current = this.head;		
		while(current != null){			
			lenght++;			
			current = current.getNextNode();			
		}		
		return lenght;		
	}
	
	public void insertBySorting(int data)
	{
		DoubleLinkedListNode current = this.head;		
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);		
		if(current == null){
			
			newNode.setNextNode(this.head);			
			if(this.head != null){
				this.head.setPreviousNode(newNode);			
			}
			this.head = newNode;
		}
		
		while(current != null){
			
			if(current.getData() <= data ){
			if(current.getNextNode() == null){				
				newNode.setPreviousNode(current);
				current.setNextNode(newNode);
				
				break;
				}
			
				if(current.getNextNode() != null && current.getNextNode().getData() > data){
					newNode.setNextNode(current.getNextNode());
					newNode.setPreviousNode(current.getNextNode().getPreviousNode());
					current.setNextNode(newNode);
					current.setPreviousNode(newNode.getPreviousNode());
					break;
				}
				
			}
			if(current.getData() > data){
				newNode.setNextNode(this.head);			
				if(this.head != null){
					this.head.setPreviousNode(newNode);			
				}
				this.head = newNode;
				
				break;
			}
			
			current = current.getNextNode();
		}
		
	}
	
	@Override
	public String toString(){
		String result = "{";
		
		DoubleLinkedListNode current = this.head;
		while (current != null){
			result += current.toString() +",";
			current = current.getNextNode();
		}
		return result + "}";
	}
	
}
