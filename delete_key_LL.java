public class delete_key_LL {

    private ListNode head;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayList(){
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

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteKeyFromSinglyLL(int value){
        ListNode key = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data != key.data){
            temp = current;
            current = current.next;
        }

        if(current == null){
            return;
        }
        temp.next = current.next;

    }


    public static void main(String[] args) {
        delete_key_LL delete = new delete_key_LL();

        delete.insertFirst(16);
        delete.insertFirst(11);
        delete.insertFirst(10);
        delete.insertFirst(8);
        delete.insertFirst(1);

        delete.displayList();
        System.out.println();

        delete.deleteKeyFromSinglyLL(11);

        delete.displayList();
    }
}
