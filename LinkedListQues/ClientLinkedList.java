package LinkedListQues;

public class ClientLinkedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
//list.AddLast(10);
//list.AddLast(20);
//list.AddLast(30);
//list.AddLast(40);
		list.AddFirst(10);
		list.AddFirst(20);
		list.AddFirst(30);
		list.AddFirst(40);
		list.AddFirst(50);
		list.AddFirst(60);
		list.display();
		System.out.println("first data=" + list.GetFirst());
		System.out.println("last data=" + list.GetLast());
		System.out.println("geta data at index=" + list.GetAt(0));
//System.out.println("get Node at index="+list.GetNodeAt(2));
		list.AddAt(60, 4);
		list.display();
		System.out.println(list.RemoveFirst());
		list.display();
		System.out.println(list.RemoveLast());
		list.display();
		list.ReverseData();
		list.display();
		list.ReversePointer();
		list.display();
		System.out.println(list.Mid());

	}

}
