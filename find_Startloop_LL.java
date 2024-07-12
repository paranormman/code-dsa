public class find_Startloop_LL {
    
    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null; 
        }
    }

    public void displayList() {
        if(head == null) {
            return;
        }

        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public boolean detectLoopInALinkedList() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr) {
                // return getStartingNode(slowPtr);
                return true;
            }
        }
        return false;
    }



    public void createALoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }


    public static void main(String[] args) {

        find_Startloop_LL start = new find_Startloop_LL();

        start.createALoopInLinkedList();
        System.out.println(start.detectLoopInALinkedList());
        
    }
}
