package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String args[])
    {

        List<Integer> number = Arrays.asList(56,35,43,52);

        List<Integer> numbers = Arrays.asList(21,35,40,55,24);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream","Refraction","Recursion");

        List<Integer> multipleOfThree = numbers.stream().filter(x->x%3==0).collect(Collectors.toList());

        int cubeSum = number.stream().map(x->x*x*x).reduce(0,(ans, i)->ans+i);


        System.out.println(multipleOfThree);
        System.out.println(cubeSum);
        names.stream().filter(x->x.startsWith("Re")).sorted().forEach(x->System.out.println(x));


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //Using Java 7
        int count1 = 0;
        for(int i=0;i<strings.size();i++)
        {
            if(strings.get(i).length()==0)
            {
                count1++;
                System.out.println((strings.get(i)));
            }
        }
        System.out.println(count1);

        //Using Java 8
        int count2 = (int) strings.stream().filter(x->x.length()==0).count();

        System.out.println(count2);

    }
}
