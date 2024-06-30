package DSA;

public class reverse_linked_list {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
        this.data = data;
        this.next = null;
        }
    }

    public void displayNew(){

        ListNode current = head;
        while(current != head){
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
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
        reverse_linked_list reverse = new reverse_linked_list();
        reverse.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        
        reverse.head.next = second;
        second.next = third;
        third.next = fourth;

        
        reverse.displayNew();
        // ListNode reverseHead = reverse.reverseLinkedList(head);
        // reverse.displayNew(reverseHead);
    }
}
