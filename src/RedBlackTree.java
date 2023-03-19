public class RedBlackTree {
    private Node root;

    protected Node getRoot(){
        return this.root;
    }
    protected Boolean add(int value){
        if (root != null){
            boolean result = addNode(value, root);
            root = rebalance(root);
            root.color = Node.Color.BLACK;
            return result;
        } else{
            root = new Node();
            root.color = Node.Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private Boolean addNode(int value, Node node){
        if (node.getValue()==value){
            return false;
        }else{
            if (node.getValue()>value){
                if (node.leftChild != null){
                    boolean result = addNode(value, node.leftChild);
                    node.leftChild = rebalance(node.leftChild);
                   return result;
                }else{
                    node.leftChild = new Node();
                    node.leftChild.color = Node.Color.RED;
                    node.leftChild.value = value;
                    return true;
            }
            }else{
                if (node.rightChild != null){
                    boolean result = addNode(value, node.rightChild);
                    node.rightChild = rebalance(node.rightChild);
                   return result;
                }else{
                    node.rightChild = new Node();
                    node.rightChild.color = Node.Color.RED;
                    node.rightChild.value = value;
                    return true;
                }
            }
        }
    }
    private Node rebalance(Node node){
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Node.Color.RED && 
            (result.leftChild == null || result.leftChild.color == Node.Color.BLACK)){
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Node.Color.RED &&
            (result.leftChild.leftChild != null && result.leftChild.leftChild.color == Node.Color.RED)){
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Node.Color.RED &&
            result.rightChild != null && result.rightChild.color == Node.Color.RED){
                needRebalance = true;
                colorSwap(result);
            }
        }
        while(needRebalance);
        return result;
    }
    private void colorSwap(Node node){ //меняем цвет
        node.leftChild.color = Node.Color.BLACK;
        node.rightChild.color = Node.Color.BLACK;
        node.color = Node.Color.RED;

    }
    private Node leftSwap(Node node){
        Node leftChild = node.leftChild;
        Node between = node.leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = between;
        leftChild.color = node.color;
        node.color = Node.Color.RED;
        return leftChild;
    }

    private Node rightSwap(Node node){
        Node rightChild = node.rightChild;
        Node between = node.rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = between;
        rightChild.color = node.color;
        node.color = Node.Color.RED;
        return rightChild;
    }
    protected void printRedBlackTree(Node node) {
        if (node.equals(root)) {
            System.out.println(node.toString() + " корневой узел");
        }       
        if (node.leftChild != null){
            System.out.print(node.leftChild.toString() + " левый, род:"+node.getValue());
            System.out.println(" ");
            printRedBlackTree(node.leftChild);
        }
        if (node.rightChild != null){
            System.out.print(node.rightChild.toString() + " правый, род:"+node.getValue());
            System.out.println(" ");
            printRedBlackTree(node.rightChild);
        }
            
    }
} 
