// package DSA;

public class reverse_linked_list {
    
    private static ListNode head;
    public class ListNode{
        private int data;
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayAll(ListNode head){
        if(head == null){
            System.out.println("null");
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertInTheStart(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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
        reverse_linked_list rll = new reverse_linked_list();

        rll.insertInTheStart(10);
        rll.insertInTheStart(1);
        rll.insertInTheStart(12);
        rll.insertInTheStart(8);

        rll.displayAll(head);

        System.out.println();

        ListNode reverseNode = rll.reverseLinkedList(head);
        rll.displayAll(reverseNode);
        // rll.reverseLinkedList(fourth);

    }
}
