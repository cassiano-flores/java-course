package memory_arrays_lists.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//first time studying Lists in Java
public class Exercise42 {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        /**
        list.size();
        list.get(index);
        list.remove(index);             somethings that we can do with a List, and we have much more...
        list.clear();
        list.isEmpty();
        list.add(e);
         */

        list.add("Luana");
        list.add("Cassiano");
        list.add("Ana Clara");
        list.add("Rita");
        list.add("Cano");
        list.add("Leo");
        list.add(2, "Maharich");    //add in a specific index

        System.out.println(list.size());

        for (String x : list){                          //for each repetition
            System.out.println(x);
        }

        System.out.println("----------------------");

        list.remove("Maharich");        //remove a element (with the name or the index)

        for (String x : list){                          //for each repetition
            System.out.println(x);
        }

        System.out.println("----------------------");

        list.removeIf(x -> x.charAt(0) == 'C');    //remove with a condition

        for (String x : list){                          //for each repetition
            System.out.println(x);
        }

        System.out.println("----------------------");

        System.out.println("Index of Luana: " + list.indexOf("Luana"));
        System.out.println("Index of Cano: " + list.indexOf("Cano"));   //if the element doesnt exist, the function returns -1 !!!

        System.out.println("----------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        //the list Result will be returns a new list just with the elements that satisfy this condition
        //stream() is a type that accepted operations with lambda
        //filter receive a predicated and do it
        //collect is just to convert again to List and do this operations

        for (String x : result){                          //for each repetition
            System.out.println(x);
        }

        System.out.println("----------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        //name is a variable that receive some filters and returns what they want
        //in this case, returns the first element (or null if dont have) that first letter is an "L"

        System.out.println(name);
    }
}