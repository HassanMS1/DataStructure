import java.util.Stack;

public class stack_ {

    public static void main(String[] args) {
        Stack <String> names = new Stack<>();
        names.add("Hassan");
        names.add("Furqan");
        names.add("Ahmed");
        // printing all elements in the stack object
        System.out.println(names);

        // push and addeleement are the same , you can add string object if you wish
        String obj = "String object";
        names.push(obj);
        System.out.println(names);

        // slett verdi , sletter siste verdi

        names.pop();

        System.out.println(names);
        // peak is the last object
        System.out.println(names.peek());


    }
}


