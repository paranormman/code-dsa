class test{

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void displayNode(){
        ListNode current = head;
        while(current != head){
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        test tst = new test();
        tst.head = new ListNode(10);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(10);
        
        tst.head.next = second;
        second.next = third;
        third.next = fourth;

        
        tst.displayNode();
    }
}