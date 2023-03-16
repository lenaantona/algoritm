
public class Main {
    public static void main(String[] args) {
        Node nodeHead = new Node(1);
        LinkedList list = new LinkedList(nodeHead, nodeHead); //создаем односвязный список
        list.LastAdd(2);
        list.LastAdd(3);
        list.LastAdd(4);
        list.LastAdd(5);
        list.PrintLinkedList(); // печать списка
        list.reverseList(); //разворот списка
        list.PrintLinkedList(); // печать результата
    }
}     