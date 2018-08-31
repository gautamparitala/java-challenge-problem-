package doublylinkedlist;

public class Node {

	  int data;
	 private Node prev ;
	 private Node next ;
	 
	 public Node(int data) {
		  this.data = data ;
		  prev = null;
		  next = null;
	 }
      public Node(Node prev , int data , Node next) {
	       this.prev = prev;
	       this.next = next;
	       this.data = data;
      
   }
		  
	 
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	 
}
