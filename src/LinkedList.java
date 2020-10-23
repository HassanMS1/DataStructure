public class LinkedList {
    Node head;


    // inserting node at end or in the begnining if the list is first element/ head is empty
    public void insert (int data )
    {
        Node node = new Node(data);

        // checking if the the list is empty , if yes place the new node in the head
        if(head==null)
        {
            head=node;
        }
        // insert at the end
        else
        {
          // check where start traversing the list to find the last node
            Node n = head;
            while (n.next!=null) {
                n = n.next; // assining node to next until the last one before null

          }
            n.next= node;

        }
    }


    public void show()
    {    // going to the list and printing all elements
        Node nodes = head ;
        while (nodes.next!=null)
        {
            System.out.print(nodes.value +" ");
            nodes =nodes.next; // update the node to next node so the while goes ahead
        }
        System.out.println(nodes.value);

    }

    // insert new node in the begining when list head is not empty
    public void insertAtStart (int data)
    {
        Node node = new Node(data);
        node.next = head;  // first pointing the new value to the old head head = 3 , new value 4. 4 ->3 .
        head = node;

    }

    public void count (){
        Node node = head;
        int counter = 1 ;
        // asking if the next object / node is null . cant check the value becoz its integer
        while (node.next!=null)
        {
            counter++;
            node = node.next;
        }
        System.out.println(counter);

    }



}
