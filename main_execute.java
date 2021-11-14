
public class main_execute {

 

    public static void main(String[] args) {
        Node head=new Node(5);
        Node node2=new Node(8);
        Node node3=new Node(9);
        Node node4=new Node(2);
        Node node5=new Node(238);

      

        head.next=node2;
        node2.next=node3;
        node3.next=node3;
        node4.next=node3;
        node5.next=node3;
        head.getVal();
        
       

        

    }

    
}
