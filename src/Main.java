public class Main {
    public static void main(String[] args) {

        // The following code creates a linked list with five nodes

        // Each references a Node.
        // For example,
        // 'Node head' references the first Node
        // 'Node node1' references the second Node
        // 'Node node2' references the third Node
        Node head;
        Node node1;
        Node node2;
        Node node3;
        Node tail;

        // **************************************************

        // These Nodes below I'd consider "special"
        // 'selection' will reference or "select" whichever Node it gets assigned
        // 'middle' will reference the middle Node of the linked list.
        // 'empty' will reference an empty linked list which is denoted by using "null"

        Node selection; // 'selection' is a reference to the selected node
        Node middle; // 'middle' is a reference to the middle node
        Node empty = null; // empty is null, which represents an empty list.

        // **************************************************

        // In the following code, we're allocating memory for five different instances of the 'Node' class

        head =  new Node(10, null); // Instance of 'Node' class, otherwise known as an 'Object'
        node1 = new Node(30, null);
        node2 = new Node(40, null);
        node3 = new Node(50, null);
        tail =  new Node(60, null);

        // **************************************************

        // In the following code, after creating all of our five Nodes,
        // We now set the link of each Node to reference the Node after it.
        // In this example, 'head' references 'node1' and 'node1' references 'node2'
        // These statements essentially behave in a way similar to a "chain" or "link" of containers

        // head -> node1 -> node2 -> node3 -> tail -> null
        head.setLink(node1);
        node1.setLink(node2);
        node2.setLink(node3);
        node3.setLink(tail);

        // **************************************************

        // In the following commented code,
        // 'head = head.getLink();' will "remove" a Node starting from the head of the list
        // The line of code is essentially the reference to the next Node of the list.
        // So 'head.getLink' is the reference to 'node1'
        // so 'head = head.getLink()' means that the head of our list is now 'node1.'
        // Or the second node to our list.

        // head = head.getLink(); // References the second node of the list (the first node is removed)
        // head = head.getLink(); // References the third node of the list (the second node is removed)
        // head = head.getLink(); // References the fourth node of the list (the third node is removed)

        // **************************************************

        System.out.println("The size of an empty linked list: " + Node.listLength(empty));

        System.out.println("\nOriginal list:");

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

        // In the following line code,
        // 'Node copyList = Node.listCopy(head)'
        // will create a copy of our original list starting from the head of the list
        // The copy of our original list is stored in the 'copyList' reference or variable
        Node copyList = Node.listCopy(head);
        System.out.println("\nHead reference for the copy of the original list: " + copyList);
        System.out.println("Copy of original list: ");
        Node.listData(copyList); // This will print the data of the copied list

        // **************************************************

        System.out.println("\nOriginal list V2: ");
        Node.listData(head);

        System.out.println("\nThe size of our original linked list: " + Node.listLength(head));
        System.out.println(Node.listSearch(head, 40)); // This will return a reference to the target value (its data is 40)

        System.out.println("\nList after adding 20 and removing 50 and 60:");

        selection = head; // Set 'selection' to the first node
        selection.addNodeAfter(20); // Add a node after the first node with a value of 20

        System.out.println(selection.getData()); // Print the value of the first node
        System.out.println(selection.getLink()); // Print the value of the first node's link which refers to the second node

        System.out.println(selection.getLink().getData()); // Print the value of the second node
        System.out.println(selection.getLink().getLink()); // Print the value of the second node's link which refers to the third node

        System.out.println(node1.getData()); // Print the value of the third node
        System.out.println(node1.getLink()); // Print the value of the third node's link which refers to the fourth node

        middle = node2;
        middle.removeNodeAfter();

        System.out.println(node2.getData()); // Print the value of the fourth node
        System.out.println(node2.getLink()); // Print the value of the fourth node's link which refers to the fifth node

        // Activating this code below will result in the program throwing a 'NullPointerException'
        // Recall;
        // that it doesn't make sense to remove the node after the tail node
        // because there are no more nodes present.

        // selection = tail;
        // selection.removeNodeAfter();

        System.out.println(tail.getData()); // Print the value of the last node
        System.out.println(tail.getLink()); // Print the value of the last node's link which is null

        System.out.println("\nPosition/Reference to the fourth the node: " + Node.listPosition(head, 6));

        // **************************************************

        Node shortList;
        Node copy;
        Node pointer;

        shortList = new Node(10, null);
        shortList.addNodeAfter(20);
        shortList.addNodeAfter(30);
        shortList.addNodeAfter(40);
        shortList.addNodeAfter(50);
        copy = Node.listCopy(shortList);
        System.out.println("Head reference for the original Short List: " + shortList);
        System.out.println("Short list:");
        Node.listData(shortList);
        System.out.println("\nHead reference for the copied Short List: " + copy);
        System.out.println("Copy of short list:");
        Node.listData(copy);

        // **************************************************

        pointer = Node.listPosition(shortList, 3);
        System.out.println("\nSelected Node: " + pointer.getData());

        // tail.removeNodeAfter();

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