/*
insert value in a tail in linked list
STDIN   Function
-----   --------
    4       T = 4
    2       first data = 2
    3       first data = 3
    4       first data = 4
    1       fourth data = 1
Sample Output

    2 3 4 1
 */
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class InsertLl {

    //insert in tail
    public static  Node insert(Node head,int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        
    }
}