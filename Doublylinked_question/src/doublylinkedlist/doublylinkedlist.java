package doublylinkedlist;

public class doublylinkedlist {
	
	 Node head;
	 
	 
	 public void addnode(int data) {
		 
            if (head==null) {
            	head = new Node(null,data,null);
            	}
            else {
            	Node newnode1 = new Node( null, data , this.head);
            	head.setPrev(newnode1);
            	head = newnode1;
            	
            }
	 }        
      public void print(){
    	   
    	  
    	  while (head!=null) {
    		   System.out.println(head.data);
    	          head = head.getNext();
    	          
    	          
    	   }
       

}
}
