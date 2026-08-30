package LinkedList;

//User Defined Data Type
class Node {
    int val;
    Node next; // default value is null

    Node(int val) {
        this.val = val;
    }
}

public class basicsLL {
    public static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayLLRec(Node head) {
        if (head == null) return;
        System.out.print(head.val + " ");
        displayLLRec(head.next);
    }

    //    Getting Val of particular index O(n)
    private static int getVal(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) temp = temp.next;
        return temp.val;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(a.val); // 10
        System.out.println(b.val); // 20
        System.out.println(a.next);

//        Connecting Nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayLL(a);
        displayLLRec(a);
        System.out.println();
        System.out.println(getVal(a, 3));
    }
}