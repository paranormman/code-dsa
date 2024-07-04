public class delete_duplicate_LL {

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

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;

    }

    public void deleteDuplicateEntry(){
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }
    
    public static void main(String[] args) {
        delete_duplicate_LL dll = new delete_duplicate_LL();

        dll.insertFirst(3);
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);
        dll.insertFirst(1);

        dll.displayList();

        dll.deleteDuplicateEntry();
        System.out.println();

        dll.displayList();
        
    }
}
