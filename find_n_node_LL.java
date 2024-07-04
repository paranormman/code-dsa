// import java.util.List;

public class find_n_node_LL {
    
    public ListNode head;
    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayList(){
        if(head == null){
            System.out.println("null");;
        }

        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public ListNode getNthNodeFromEnd(int n){
        if(head == null){
            return null;
        }
        if(n <= 0){
            throw new IllegalArgumentException("Invalid value n = " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next; 
        }
        return mainPtr;

    }

    public static void main(String[] args) {
        find_n_node_LL nll = new find_n_node_LL();

        nll.insertFirst(10);
        nll.insertFirst(12);
        nll.insertFirst(14);
        nll.insertFirst(1);
        nll.insertFirst(9);

        nll.displayList();
        System.out.println();

        ListNode nthNodeFromEnd = nll.getNthNodeFromEnd(2);

        // System.out.println("The last second node in the Linked List is - " + nll.getNthNodeFromEnd(3).data);
        
        System.out.println("The last second node in the Linked List is - " + nthNodeFromEnd.data);
    }
}
