public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(8);
        list.insert(7);
        list.show();
        list.insertAtStart(6);
        list.show();
        list.count();
    }
}
