public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(8);
        list.insert(7);
        list.insert(4);
        list.insertAtStart(6);
       list.show();
       list.findByIndex(2);
       //list.insertAt(3,6);
       //list.show();
        //list.printNodes();
    }
}
