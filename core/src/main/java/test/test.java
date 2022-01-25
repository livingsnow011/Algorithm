package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

            public static void main(String[] args) {
                List<String> list = Arrays.asList("A", "B", "C", "A");
                List<String> newList = list.stream().distinct().collect(Collectors.toList());
                System.out.println(newList);
                System.out.println(list);
            }

}
