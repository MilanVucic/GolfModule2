package lesson_6;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Milanco", "Marco", "Linda", "Maximilian", "Maximilian");
        Stream<String> stream = names.stream();
        Optional<String> optional = stream.filter(s -> s.length() > 7).findAny();
        optional.ifPresent(System.out::println);
    }

    private static void streamExample3(List<String> names, Stream<String> stream) {
        List<Integer> lengths = stream.map(String::length).toList();
        List<Character> initials = names.stream().map(s -> s.charAt(0)).toList();
        System.out.println(lengths);
        System.out.println(initials);
    }

    private static void streamExample1() {
        List<String> names = List.of("Milanco", "Marco", "Linda", "Maximilian", "Maximilian");
        Stream<String> stream = names.stream();
        List<String> filtered = stream
                .filter(s -> s.startsWith("M"))
                .distinct()
                .filter(s -> s.length() > 5)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .toList();
        System.out.println(filtered);
    }

    private static void lambdaExamples() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 54, 5));
        Comparator<Integer> integerComparator = (o1, o2) -> o1.compareTo(o2);

        Collections.sort(list, integerComparator);

        List<String> names = List.of("Milan", "Marco", "Linda");
        PrintHelper printHelper = new PrintHelper(">>>");
        names.forEach(printHelper::print);
        names.forEach(Main::print);
        names.forEach(PrintHelper::new);
    }

    private static void print(String name) {
        System.out.println("______");
        System.out.println(name);
        System.out.println("______");
    }
}
