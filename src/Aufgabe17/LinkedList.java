package Aufgabe17;


public class LinkedList <T> {

    private Integer nodeCount;

    public LinkedList() {
        this.nodeCount = 0;
    }

    public class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node head ;
    private Node tail;

    public String addNodeToEnd(T data) {
        Node newNode = new Node(data);
        if(this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            if(this.head == this.tail && getNodeCount() == 1) {
                this.head.next = this.head;
            }
            this.tail = newNode;
        }
        this.nodeCount++;
        return display();
    }

    public String display() {
        String result = "";
        Node current = head;
        if(head == null) {
            result = "List is empty";
        } else {
            while(current != null) {
                result = result + current.data.toString();
                current = current.next;
            }
        }
        return result;
    }

    public Integer getNodeCount() {
        return nodeCount;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
