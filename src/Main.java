public class Main {
    public static void main(String[] args) {
        Node head; // 'head' is a reference to the first node
        Node node1; // 'node1' is a reference to the second node
        Node node2; // 'node2' is a reference to the third node
        Node node3; // 'node3' is a reference to the fourth node
        Node tail; // 'tail' is a reference to the last node

        Node selection; // 'selection' is a reference to the selected node

        head =  new Node(10, null);
        node1 = new Node(30, null);
        node2 = new Node(40, null);
        node3 = new Node(50, null);
        tail =  new Node(60, null);

        head.setLink(node1);
        node1.setLink(node2);
        node2.setLink(node3);
        node3.setLink(tail);

        // In the following code snippet, the statement 'head = head.getLink();'
        // Removes a node from the head of a linked list - 'head.getLink()' is a reference to the next node of the list

        head = head.getLink(); // References the second node of the list (the first node is removed)
        head = head.getLink(); // References the third node of the list (the second node is removed)
        head = head.getLink(); // References the fourth node of the list (the third node is removed)

        System.out.println("Original list:");

        System.out.println(head.getData());
        System.out.println(head.getLink());

        System.out.println(node1.getData());
        System.out.println(node1.getLink());

        System.out.println(node2.getData());
        System.out.println(node2.getLink());

        System.out.println(node3.getData());
        System.out.println(node3.getLink());

        System.out.println(tail.getData());
        System.out.println(tail.getLink());

        System.out.println("\n\nAfter adding 20 after the first node:");

        selection = head; // Set 'selection' to the first node
        selection.addNodeAfter(20); // Add a node after the first node with a value of 20

        System.out.println(selection.getData()); // Print the value of the first node
        System.out.println(selection.getLink()); // Print the value of the first node's link which refers to the second node

        System.out.println(selection.getLink().getData()); // Print the value of the second node
        System.out.println(selection.getLink().getLink()); // Print the value of the second node's link which refers to the third node

        System.out.println(node1.getData()); // Print the value of the third node
        System.out.println(node1.getLink()); // Print the value of the third node's link which refers to the fourth node

        System.out.println(node2.getData()); // Print the value of the fourth node
        System.out.println(node2.getLink()); // Print the value of the fourth node's link which refers to the fifth node

        System.out.println(node3.getData()); // Print the value of the fifth node
        System.out.println(node3.getLink()); // Print the value of the fifth node's link which refers to the last node

        System.out.println(tail.getData()); // Print the value of the last node
        System.out.println(tail.getLink()); // Print the value of the last node's link which is null

        // Mind the code below, it's just for reference, and it's not used in this example (it's commented out)

        //Node node1; // 'node1' is a reference to the second node
        //Node node2; // 'node2' is a reference to the third node
        //Node node3; // 'node3' is a reference to the fourth node
        //Node tail; // 'tail' is a reference to the last node
        //Node selection; // 'selection' is a reference to the selected node

        //head = new Node(10, head);  // Create a new node with a value of 10 and no link
        //node1 = new Node(20, head); // Create a new node with a value of 20 and no link
        //head.setLink(node1); // Set the first node's link to the second node
        //node2 = new Node(30, head); // Create a new node with a value of 30 and no link
        //node1.setLink(node2); // Set the second node's link to the third node
        //node3 = new Node(40, head); // Create a new node with a value of 40 and no link
        //node2.setLink(node3); // Set the third node's link to the fourth node
        //tail = new Node(50, head); // Create a new node with a value of 50 and no link
        //node3.setLink(tail); // Set the fourth node's link to the last node
        //tail.setLink(null); // Set the last node's link to null
        //System.out.println(head.getData()); // Print the value of the first node
        //System.out.println(head.getLink()); // Print the value of the first node's link
        //System.out.println(node1.getData()); // Print the value of the second node
        //System.out.println(node1.getLink()); // Print the value of the second node's link
        //System.out.println(node2.getData()); // Print the value of the third node
        //System.out.println(node2.getLink()); // Print the value of the third node's link
        //System.out.println(node3.getData()); // Print the value of the fourth node
        //System.out.println(node3.getLink()); // Print the value of the fourth node's link
        //System.out.println(tail.getData()); // Print the value of the last node
        //System.out.println(tail.getLink()); // Print the value of the last node's link


        // head = new Node(20, head); // Create a new node with a value of 20 and a link to the first node
        // selection = head; // Set 'selection' to the second node
        // selection.addNodeAfter(42); // Add a node after the second node with a value of 42
        // System.out.println(head.getData()); // Print the value of the first node
        // System.out.println(head.getLink()); // Print the value of the first node's link
        // System.out.println(selection.getLink().getData()); // Print the value of the third node
        // System.out.println(selection.getLink().getLink()); // Print the value of the third node's link
        // head = new Node(30, null);
        // System.out.println(head.getData());
        // System.out.println(head.getLink());

    }
}