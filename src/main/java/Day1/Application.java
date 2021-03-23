package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        System.out.println(arr.stream().filter(x->x>4).reduce(0,(ans,i)->ans+i));

        ArrayList<String> arrayStrings = new ArrayList<>();
        arrayStrings.add("Mango");
        arrayStrings.add("Cat");
        arrayStrings.add("Cup");
        arrayStrings.add("Dog");
        arrayStrings.add("Rat");
        arrayStrings.add("Couple");
        arrayStrings.add("Friends");

        List<String> answer = arrayStrings.stream().filter(str->str.startsWith("C")).collect(Collectors.toList());

        System.out.println(answer);
    }
}
