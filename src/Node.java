public class Node{
    protected int value;
    protected Color color;
    Node leftChild;
    Node rightChild;

    protected enum Color{
        RED, BLACK;
    }

    public Node(int value, Color color, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.color = color;
    }

    
    public Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
    public Node() {
    }

    public int getValue() {
        return value;
    }
    public Node getLeftChild() {
        return leftChild;
    }

    public Node getrightChild() {
        return rightChild;
    }

    public void setrightChild(Node rightChild){
        this.rightChild = rightChild;
    }

    @Override
    public String toString(){
        return "Node {" + value +" "+ color + '}';
    }

}