import java.sql.SQLOutput;

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

    public void insertAt (int index, int data){
        Node node = new Node(data);
        Node n = head;


        if(index==0){
            insertAtStart(data);
        }

         for (int i=0;i<index-1;i++  )
         {
             // find the node that point to node of the giving index by "index -1"
             // to loop nodes you must use next pointer, therefor the next pointer must stop one before index-1
             n = n.next; // n became index 1  now
             System.out.println(n.value);
         }
        //System.out.println("Stopped at "+ n.value + ". So that "+node.next.value+" can point to "+n.next.value);
        //System.out.println("And" + n.next.value +" can point to "+node.value );
        node.next=n.next;
        n.next=node;

    }

    public void findByIndex(int index)
    {
        if (index==0){
            System.out.println(head);
        }

        int counter = 1;
        Node n =head.next;

        while (n!=null)
        {
            if (counter ==index)
            {
                System.out.println(n.value);
                break;
            }
            n=n.next;
            counter++;

        }

    }
    public void printNodes(){
        Node n = head;




        for (int i=0;i<3-1;i++  )
        {
            System.out.println(n.value);
            // finding the node that point to node before
            n = n.next;

        }

    }




}
