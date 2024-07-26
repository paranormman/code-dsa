public class merge_Two_LL {
    
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void displayList() {
        if(head == null) {
            System.out.println("null");
        }

        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;

    }

    public static ListNode merge(ListNode a, ListNode b) {
        //a --> 1 --> 3 --> 5 --> null
        //b --> 2 --> 4 --> 6 --> null
        //result --> 1 --> 2 --> 3 --> 4 --> 5 --> null
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null) {
            if(a.data <= b.data) {
                tail.next = a;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a == null) {
            tail.next = b;            
        } else {
            tail.next = a;
        }

        return dummy.next;
    }
        

    

    public static void main(String[] args) {
        merge_Two_LL a = new merge_Two_LL();

        a.insertFirst(8);
        a.insertFirst(4);
        a.insertFirst(1);

        merge_Two_LL b = new merge_Two_LL();

        b.insertFirst(18);
        b.insertFirst(14);
        b.insertFirst(9);
        b.insertFirst(8);
        b.insertFirst(5);
        b.insertFirst(3);

        a.displayList();
        System.out.println();
        b.displayList();

        merge_Two_LL result = new merge_Two_LL();
        result.head = merge(a.head, b.head);
        System.out.println();
        result.displayList();

    }

}

