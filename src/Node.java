public class Node{
    private int value;
    Node nextNode;

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }
    public Node() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}