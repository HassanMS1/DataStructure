import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

public class Deque_ {


    public static void main(String[] args) {

        // Deque is an interface it must be implemented by another class either linkedlist or arrayListDeque
        // you have to create an instance/object of class that has implemented deque
        // ArrayDeque and linkedlist implement Deque

        Deque <String> list_ArrayDeque = new ArrayDeque<>();
        Deque <String> list_LinkedList = new LinkedList<>();
        // offerFirst ellement venstre og last element til siste høyre
      // mange måter å legge til push og offerfirst er et samme. offerlast legger til høyre eller siste plass
        // kan brukes som stack ved legge til og fjerne fra samme side hele tiden






        // Que mode
        // vanlig que mode FIFO(first in first out)  legger til bak og fjerner fra start
        list_ArrayDeque.offerLast("Hassan");
        list_ArrayDeque.offerLast("Ahmed");
        list_ArrayDeque.offerLast("Furqan");

        System.out.println("Lagt til alle elementer " + list_ArrayDeque);
        // sletter først eller serverer først pollfirst og poll sletter første som kom inn
        list_ArrayDeque.poll();
        System.out.println("Første elemment som kom inn er slettet "+list_ArrayDeque);
        // sletter alt
        list_ArrayDeque.clear();
        System.out.println("Slettet "+list_ArrayDeque);


        // Stack mode
        list_ArrayDeque.offerLast("Hassan");
        list_ArrayDeque.offerLast("Ahmed");
        list_ArrayDeque.offerLast("Furqan");

        // sletter siste som kom inn
        list_ArrayDeque.pollLast();
        System.out.println("Stack mode "+ list_ArrayDeque);
        list_ArrayDeque.clear();


        // addfirst og push er like , push/addfirst setter i først plass add i siste plass / venstre siden
        list_ArrayDeque.add("Hassan");
        list_ArrayDeque.add("Ahemd");
        list_ArrayDeque.addFirst("furqan"); // push og addfirst er like
        System.out.println(list_ArrayDeque);








        // pop removes first elemenet or venstre verdi
        while (!list_ArrayDeque.isEmpty()){

            System.out.println(list_ArrayDeque.peek());

        }


        //System.out.println(list_ArrayDeque);

    }
}
