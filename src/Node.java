public class Node {
    int value;
    Node next;

    public Node(int number) {
        this.value = number;

    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(6);
        System.out.println(head.next);
    }
}
