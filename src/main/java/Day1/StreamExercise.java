package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExercise {
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        Optional<String> concat = strings.stream().filter(x->x.length()>0).reduce((ans, i)->ans+","+i);

        System.out.println(concat.get());




        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

        int highest = integers.stream().max(Integer::compare).get();

        System.out.println(highest);

        int lowest = integers.stream().min(Integer::compare).get();

        System.out.println(lowest);

        int sum = integers.stream().reduce(0,(ans,i)->ans+i);
        System.out.println(sum);

        int average = sum/integers.size();
        System.out.println(average);

        int distinctSquareSum = integers.stream().map(x->x*x).distinct().reduce(0,(ans,i)->ans+i);
        System.out.println(distinctSquareSum);
    }
}
