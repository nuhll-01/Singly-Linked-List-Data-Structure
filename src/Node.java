public class Node {
    private int data; // 'data' is the value stored in the node
    private Node link; // 'link' is a reference to the next node

    public Node(int initialData, Node initialLink) { // Constructor for the Node class
        data = initialData;
        link = initialLink;
    }

    public Node getLink() { // Returns the link to the next node
        return link;
    }

    public static Node listSearch(Node head, int target) { // Search for a particular piece of data in a linked list
        Node cursor;
        for (cursor = head; cursor != null; cursor = cursor.link) {
            if (target == cursor.data) {
                return cursor;
            }
        }
        return null;
    }

    public static void listData(Node head) {
        Node cursor;
        System.out.println("Linked List:");
        for (cursor = head; cursor != null; cursor = cursor.link) {
            System.out.println(cursor.data);
        }
    }

    public static int listLength(Node head) { // Returns the number of nodes in a linked list
        int answer = 0;
        Node cursor;
        for (cursor = head; cursor != null; cursor = cursor.link) {
            answer++;
        }
        return answer;
    }


    // This method will return a reference to the node at the specified position in the list
    public static Node listPosition(Node head, int position) {
        Node cursor;

        // Check for an invalid position
        if (position <= 0) {
            throw new IllegalArgumentException("Position must be greater than 0");
        }

        cursor = head;
        for (int i = 1; i < position && cursor != null; i++) {
            cursor = cursor.link;
        }
        return cursor;
    }

    public static Node listCopy(Node source) {
        Node copyHead; // Head reference for the list
        Node copyTail; // Tail reference for the list


        if (source == null) {
            return null;
        }

        copyHead = new Node(source.data, null);
        copyTail = copyHead;

        while (source.link != null) {
            // Copy the next node
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }
        return copyHead;
    }

    public int getData() { // Returns the data stored in the node
        return data;
    }

    public void setData(int newData) { // Sets the data stored in the node
        data = newData;
    }

    public void setLink(Node newLink) { // Sets the link to the next node
        link = newLink;
    }

    public void addNodeAfter(int element) throws OutOfMemoryError { // Adds a node after the current node
        link = new Node(element, link);
    }

    public void removeNodeAfter() { // Removes the node after the current node
        link = link.link;
    }
}
