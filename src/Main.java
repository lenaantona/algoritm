
public class Main {

    public static void printBoolean(boolean b){
        if (b = true) {
            System.out.println("Ребенок добавлен в дерево");
           } else {
            System.out.println("Ребенок не добавлен в дерево");
           }
    }
    public static void main(String[] args) {
       RedBlackTree tree = new RedBlackTree();
       printBoolean(tree.add(5));
       printBoolean(tree.add(7));
       printBoolean(tree.add(10));
       printBoolean(tree.add(3));
       printBoolean(tree.add(6));
       tree.printRedBlackTree(tree.getRoot());
    }
}     