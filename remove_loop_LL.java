import java.util.List;

public class remove_loop_LL {

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

    private void removeLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                removeLoop(slowPtr);
                return;
            }
        }
        // return null;
    }

    public void removeLoop(ListNode slowPtr) {
        ListNode temp = head;
        if(temp == slowPtr) {
            while(slowPtr.next != temp) {
                slowPtr = slowPtr.next;
            }
            slowPtr.next = null;
            return;
        }
        while(temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public void createALoopListNode() {
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
        
        remove_loop_LL remove = new remove_loop_LL();

        remove.createALoopListNode();
        remove.removeLoop();
        remove.displayList();
    }
}
