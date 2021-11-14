

public class Node{
   int val;
   Node next=null;
   public Node(int d){this.val=d;}
   public Node(int d,Node node){this.val=d;this.next=node;}


   public void getVal(){System.out.println(val);}
   
}