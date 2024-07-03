public class middle_node_LL {
    
    private ListNode head;
    public class ListNode{
        private int data;
        private ListNode next;

        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printLinkedList(){
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

    public void insertBegining(int value){
        ListNode first = new ListNode(value);
        first.next = head;
        head = first;
    }

    public ListNode middleNode(){
        if(head == null){
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }


    public static void main(String[] args) {
        middle_node_LL mnll = new middle_node_LL();

        // insert elements
        mnll.insertBegining(11);
        mnll.insertBegining(1);
        mnll.insertBegining(8);
        mnll.insertBegining(10);

        mnll.printLinkedList();
        System.out.println();

        ListNode middleLL = mnll.middleNode();
        System.out.println("Middle Node is - " + middleLL.data);
    }
}

