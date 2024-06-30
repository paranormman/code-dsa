package DSA;

public class singly_linked_list {

    private ListNode head;                  //creating an istance head which will store the entire linkedlist
    private static class ListNode{          //creating a class for the Listnode
        private int data;                   //Generic type
        private ListNode next;

        public ListNode(int data){          //creating a constructor to store the data value
            this.data = data;
            this.next = null;
        }
    }

    // Displaying a Singly Linked List
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Insterting a new node in the begining and pointing it to head
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Insterting a new node at the end and pointing it to head
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    // Insterting a new node at any given position
    public void insertAnywhere(int value, int position){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        } 
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    // Find the length of the Singly Linked List.
    public int listLength(){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    // Deleting the first node from the linked list
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode tmp = head;
        head = head.next;
        tmp.next = null;
        return tmp;
    }

    // Deleting the Last node from the linked list
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    // Deleting the node from any given position the linked list
    public void deleteAnyNode(int position){
        if(position == 1){
            head = head.next;
        }
        else{
            int count = 1;
            ListNode previous = head;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    // Search an Element in a Linked List
    public boolean searchElement(int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverseLinkedList(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next; 
        }
        return previous;
    }


    public static void main(String[] args) {
        singly_linked_list sl = new singly_linked_list();
        sl.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        
        //now connecting them together to form a chain

        sl.head.next = second;  //10 --> 1
        second.next = third;    //10 --> 1 --> 8
        third.next = fourth;    //10 --> 1 --> 8 --> 11 --> null

        // sl.display();                    //display data in the Linked List
        // System.out.println("The Length is " + sl.listLength());
        // sl.insertFirst(11);              //Inserting the new node at the begining of the linked list
        // sl.display();
        // System.out.println("The Length is " + sl.listLength());

        // sl.insertLast(11);               //Inserting the new node at the end of the linked list
        // sl.insertLast(10);
        // sl.insertFirst(11);              //Inserting a new node in the begining of the linked list.
        // sl.insertFirst(12);
        // sl.insertFirst(13);
        // sl.insertAnywhere(8, 4);         //Instering a node at any position in a linked list
        // System.out.println(sl.deleteFirst().data);   //deleting the first node in a linked list .data() returns the node that is removed
        // System.out.println(sl.deleteLast().data);    //deleting the las node in a linked list
        sl.display();                       // Displaying all the nodes in a linked list
        // sl.deleteAnyNode(1);             //Delete an element anywhere in a SLL
        // if(sl.searchElement(12)){
        //     System.out.println("Search key found in the List!!!");
        // }
        // else{
        //     System.out.println("Search key not found in the List!!!");
        // }

        sl.reverseLinkedList(fourth);
        System.out.println(sl.reverseLinkedList(fourth).data);


    }
}
