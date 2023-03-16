public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    public LinkedList(Node head) {
        this.head = head;
        this.tail = null;
    }
  
    public void reverseList(){ //метод разворота списка
        Node node = head; // текущий
        Node pre = null; //предыдущий
        while (node != null){
           if (node.nextNode != null){
             Node next = node.nextNode; //следующий
             if (pre != null){
                node.nextNode = pre;
               }
               else {
                tail = node;
                node.nextNode = null;
               }
               pre = node;
               node = next;
           }
           else {
            node.nextNode = pre;
            head = node;
            return;
           }   
           
        }
    }

    public void PrintLinkedList(){ //печать списка
        Node n = head;
        System.out.print(n.getValue());
        while((n.nextNode != null)) {
            Node tmp = n.nextNode;
            System.out.print(tmp.getValue());
            n = n.nextNode;;
        } 
        System.out.println();
    }

    public void LastAdd(int value) { //метод добавления в конец списка
        Node node = new Node(value);
        tail.nextNode = node;
        tail = node;
        }
}
