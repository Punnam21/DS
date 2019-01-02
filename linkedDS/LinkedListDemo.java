package linkedDS;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
		list.insertAtHeadNode(7);
		list.insertAtHeadNode(4);
		list.insertAtHeadNode(5);
		list.insertAtHeadNode(12);
		list.insertAtHeadNode(56);
		list.insertAtHeadNode(50);
		
		System.out.println(list);
		
		System.out.println("length:"+ list.length());
		
		System.out.println("Delete :"+list.deleteHeadNode());
		
		System.out.println(list);
		
		System.out.println("found: "+list.find(11));

	}

}
