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

    public static int listLength(Node head) {
        int answer = 0;
        Node cursor;
        for (cursor = head; cursor != null; cursor = cursor.link) {
            answer++;
        }
        return answer;
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
