package LinkedList;

// Node DataType is already defined in basicsLL.java (in the same package)

import java.util.Scanner;

// User-defined Linked List data structure
class LinkedListDS {
    Node head; // Pointer to the first node
    Node tail; // Pointer to the last node
    int size;  // Size of the linked list

    // Insert a new node at the head of the list
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // Insert a new node at the tail of the list
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // Delete a node from the head of the list
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    // Search for a value in the list, return index or -1 if not found
    int search(int val) {
        if (head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Insert a node at a specific index
    void insert(int val, int idx) {
        if (idx > size || idx < 0) {
            System.out.println("Out of Bound.");
            return;
        } else if (idx == 0) insertAtHead(val);
        else if (idx == size) insertAtTail(val);
        else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) temp = temp.next;
            Node tempVal = new Node(val);
            tempVal.next = temp.next;
            temp.next = tempVal;
            size++;
        }
    }

    // Delete a node at a specific index
    void delete(int idx) {
        if (idx < 0 || idx >= size) System.out.println("Invalid Index!");
        else if (idx == 0) deleteAtHead();
        else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) temp = temp.next;
            temp.next = temp.next.next;

            if (idx == size - 1) tail = temp; // deleting at tail
            size--;
        }
    }

    // Get value of node at a specific index
    int getValueAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) temp = temp.next;
        return temp.val;
    }

    // Display all nodes in the linked list
    void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class linkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListDS ll = new LinkedListDS();

        // Inserting at tail
        ll.insertAtTail(10);
        ll.insertAtTail(20);
        ll.display();

        // Inserting at head
        ll.insertAtHead(50);
        ll.insertAtHead(60);
        ll.display();

        // Deleting from head
        ll.deleteAtHead();
        ll.display();

        // Displaying size and search result
        System.out.println("Size of Linked List: " + ll.size);
        System.out.println("Element at Index: " + ll.search(10));

        // Inserting at a given index
        System.out.print("Enter value and index: ");
        ll.insert(45, 2);
        ll.display();

        // Getting value at a specific index
        System.out.println("Value at Index is: " + ll.getValueAt(2));

        // Deleting a node at a specific index
        ll.delete(2);
        ll.display();

        sc.close(); // Closing scanner
    }
}