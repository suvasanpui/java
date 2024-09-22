public class LlAllfunction {
    Node head;
    
    //create a node structure
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
        
    }

    //print linkedList

    void printLinkedList(){
        if(head==null){
            System.out.print("Empty LinkedList");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void addFrist(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("empty Linked List");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("empty Linked List");
            return;
        }
        Node first=head;
        Node last=head.next;
        if(first.next==null){
            first=null;
        }
        while(last.next!=null){
            first=first.next;
            last=last.next;
        }
        first.next=null;
    }
    public static void main(String []args){
        LlAllfunction obj=new LlAllfunction();
        
        obj.addFrist(10);
        obj.addLast(20);
        obj.addLast(30);
        obj.addLast(40);
        obj.addLast(50);
        obj.deleteLast();
        obj.printLinkedList();
        
    }
}
