public class Node {
    private int data; // 'data' is the value stored in the node
    private Node link; // 'link' is a reference to the next node

    public Node(int initialData, Node initialLink) { // Constructor
        data = initialData;
        link = initialLink;
    }

    public Node getLink() {
        return link;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) { // 'newData' is the new data to place in a node
        data = newData;
    }

    public void setLink(Node newLink) { // 'newLink' is a reference to the next node or NPE if no node is present
        link = newLink;
    }

    public void addNodeAfter(int element) throws OutOfMemoryError {
        link = new Node(element, link);
    }

}
