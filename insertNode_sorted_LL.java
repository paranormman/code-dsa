public class insertNode_sorted_LL {

    public static ListNode head;
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
            return;
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertInTheStart(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public ListNode insertNewNodeInSortedLL(int value){
        ListNode newListNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newListNode.data){
            temp = current;
            current = current.next;
        }

        newListNode.next = current;
        temp.next = newListNode;
        return head;
    }

    public static void main(String[] args) {
        insertNode_sorted_LL insert = new insertNode_sorted_LL();

        insert.insertInTheStart(16);
        insert.insertInTheStart(10);
        insert.insertInTheStart(8);
        insert.insertInTheStart(1);

        insert.displayList();
        System.out.println();

        // ListNode insertNode = insert.insertNewNodeInSortedLL(11);
        insert.insertNewNodeInSortedLL(11);

        insert.displayList();
    }
}
