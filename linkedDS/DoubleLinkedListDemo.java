package linkedDS;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList list = new DoubleLinkedList();
		//list.insertAtHead(10);
		list.insertAtHead(6);
		//list.insertAtHead(11);
		
		System.out.println(list);
		System.out.println(list.lenght());
		 
		list.insertBySorting(8);
		list.insertBySorting(1);
		list.insertBySorting(7);
		list.insertBySorting(4);
		list.insertBySorting(9);
		 
		System.out.println(list.toString());
		
		System.out.println(list.lenght());
		
	}

}
