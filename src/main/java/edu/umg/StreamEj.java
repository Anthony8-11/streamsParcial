package edu.umg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEj {

    // ** Operaciones Intermedias **

    // 1. filter: Filtra elementos que cumplen con una condición.
    public static void filterExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("1. filter: " + evenNumbers);
    }

    // 2. map: Aplica una función a cada elemento.
    public static void mapExample() {
        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("2. map: " + wordLengths);
    }

    // 3. flatMap: Aplana un stream de streams.
    public static void flatMapExample() {
        List<List<String>> nestedWords = Arrays.asList(Arrays.asList("hello", "world"), Arrays.asList("java", "stream"));
        List<String> flatWords = nestedWords.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("3. flatMap: " + flatWords);
    }

    // 4. distinct: Elimina duplicados del stream.
    public static void distinctExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("4. distinct: " + distinctNumbers);
    }

    // 5. limit: Limita el tamaño del stream.
    public static void limitExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> limitedNumbers = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("5. limit: " + limitedNumbers);
    }

    // 6. skip: Omite los primeros elementos del stream.
    public static void skipExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = numbers.stream().skip(2).collect(Collectors.toList());
        System.out.println("6. skip: " + skippedNumbers);
    }

    // ** Operaciones Terminales **

    // 7. forEach: Ejecuta una acción para cada elemento del stream.
    public static void forEachExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.stream().forEach(num -> System.out.println("7. forEach: " + num));
    }

    // 8. collect: Convierte el stream a una colección u otro resultado.
    public static void collectExample() {
        List<String> words = Arrays.asList("apple", "banana", "orange");
        String concatenated = words.stream().collect(Collectors.joining(", "));
        System.out.println("8. collect: " + concatenated);
    }

    // 9. reduce: Combina los elementos en un solo resultado.
    public static void reduceExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (acc, num) -> acc + num);
        System.out.println("9. reduce: " + sum);
    }

    // 10. anyMatch: Verifica si al menos un elemento cumple con una condición.
    public static void anyMatchExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        boolean hasEven = numbers.stream().anyMatch(num -> num % 2 == 0);
        System.out.println("10. anyMatch: " + hasEven);
    }

    // 11. allMatch: Verifica si todos los elementos cumplen con una condición.
    public static void allMatchExample() {
        List<Integer> numbers = Arrays.asList(2, 4, 6);
        boolean allEven = numbers.stream().allMatch(num -> num % 2 == 0);
        System.out.println("11. allMatch: " + allEven);
    }

    // 12. noneMatch: Verifica si ningún elemento cumple con una condición.
    public static void noneMatchExample() {
        List<Integer> numbers = Arrays.asList(1, 3, 5);
        boolean noneEven = numbers.stream().noneMatch(num -> num % 2 == 0);
        System.out.println("12. noneMatch: " + noneEven);
    }

    // 13. count: Cuenta el número de elementos en el stream.
    public static void countExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long count = numbers.stream().count();
        System.out.println("13. count: " + count);
    }

    // 14. max: Encuentra el elemento máximo del stream.
    public static void maxExample() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 8, 5);
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("14. max: " + max);
    }

    // 15. min: Encuentra el elemento mínimo del stream.
    public static void minExample() {
        List<Integer> numbers = Arrays.asList(3, 6, 1, 9, 4);
        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("15. min: " + min);
    }

}
