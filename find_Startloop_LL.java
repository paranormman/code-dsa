<<<<<<< HEAD
public class find_Startloop_LL {
    
=======
import javax.swing.text.html.StyleSheet.ListPainter;

public class find_StartLoop_LL {

>>>>>>> e10e8cbaee720e3b8c47b88292f0dceaf5630752
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

<<<<<<< HEAD
    public boolean detectLoopInALinkedList() {
=======
    public ListNode detectLoopInALinkedList() {
>>>>>>> e10e8cbaee720e3b8c47b88292f0dceaf5630752
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr) {
<<<<<<< HEAD
                // return getStartingNode(slowPtr);
                return true;
            }
        }
        return false;
=======
                return getStartingNode(slowPtr);
                // return true;
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while(temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
>>>>>>> e10e8cbaee720e3b8c47b88292f0dceaf5630752
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

<<<<<<< HEAD

    public static void main(String[] args) {

        find_Startloop_LL start = new find_Startloop_LL();

        start.createALoopInLinkedList();
        System.out.println(start.detectLoopInALinkedList());
=======
    public static void main(String[] args) {
     
        find_StartLoop_LL start = new find_StartLoop_LL();
        start.createALoopInLinkedList();
        System.out.println(start.detectLoopInALinkedList().data);
>>>>>>> e10e8cbaee720e3b8c47b88292f0dceaf5630752
        
    }
}
