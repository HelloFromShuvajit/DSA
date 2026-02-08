public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Reverse {
        private static ListNode reverseList(ListNode head) {
            ListNode current= head;
            ListNode prevNode=null;
            while (current!=null) {
                    ListNode next=current.next;
                    current.next=prevNode;
                    prevNode=current;
                    current=next;
                }
                return prevNode;
        }

        private static void printList(ListNode head) {
            ListNode current = head;
            while (current!=null) {
                System.out.println(current.val);
                current= current.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(66);
        head.next = new ListNode(54);
        head.next.next = new ListNode(87);
        head.next.next.next = new ListNode(82);

        System.out.println("Original list:");
        Reverse.printList(head);

        ListNode reversedHead = Reverse.reverseList(head);

        System.out.println("Reversed list:");
        Reverse.printList(reversedHead);
    }
}
