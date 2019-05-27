// create LinkedList  in java
import java.util.Scanner;
 class Node
{
	 int data;
	 Node next;
    
    public Node(int data)
    {
    	this.data = data ;
    }

}
class LinkedList
{
    private static Node head =null;

    public static  void insert( int data)
    {
        Node newnode = new Node(data);
        if(head==null)
             head = newnode ;
        else {


            Node temp = head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;


        }
    }
     public static void reverse()
     {
         Node prev = null,current = head,nextnode =null;
          while(current!=null)
          {

              nextnode = current.next;
              current.next = prev;
              prev = current;
              current = nextnode;
          }
          head = prev;

     }
     public static void print()
     {
         for(Node temp = head ; temp != null ;temp=temp.next)
             System.out.print(temp.data+" ");
         System.out.println();
     }
     public static void main(String args[])
     {

         Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();

         System.out.println("Enter the list of elements into the LinkedList");

         int arr[] = new int[n] ;

         for(int i=0;i<n;i++)
             insert(scanner.nextInt());
         print();
         reverse();
         print();


     }



}