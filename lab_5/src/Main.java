import java.util.*;
import java.util.stream.*;

public class Main {
    /*1*/public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    /*2*/public static double findAverage(List<Double> values) {
        return values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    /*3*/public static List<String> sortStringsAlphabet(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    /*4*/public static int sumEvenNumb(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    /*5*/public static long factorial(int number) {
        return IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }

    /*6*/public static Map<String, Integer> sumAndProduct(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(i -> i).sum();
        int product = numbers.stream().reduce(1, (a, b) -> a * b);

        Map<String, Integer> result = new HashMap<>();
        result.put("sum", sum);
        result.put("product", product);
        return result;
    }

    /*7*/public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    /*8*/public static List<String> sortByLength(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    /*9*/public static long countWords(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    /*10*/public static Optional<String> findFirstNotEmpty(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();
    }

    /*11*/public static boolean allStartWithUpperCase(List<String> strings) {
        return strings.stream()
                .allMatch(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }

   /*12*/public static Optional<Integer> findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    /*13*/public static Optional<Integer> findMaxEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compare);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.0);
        List<String> stringList = Arrays.asList("banana", "apple", "pear", "fig");
        List<String> sentenceList = Arrays.asList("", " ", "Hello", "world");
        String sentence = "чотири чотири чотири чотири";

        System.out.println("1. Непарні числа: " + filterOddNumbers(intList));
        System.out.println("2. Середнє: " + findAverage(doubleList));
        System.out.println("3. Сортування за алфавітом: " + sortStringsAlphabet(stringList));
        System.out.println("4. Сума парних: " + sumEvenNumb(intList));
        System.out.println("5. Факторіал 5: " + factorial(5));
        System.out.println("6. Сума і добуток: " + sumAndProduct(intList));
        System.out.println("7. Квадрати чисел: " + squareNumbers(intList));
        System.out.println("8. Сортування за довжиною: " + sortByLength(stringList));
        System.out.println("9. Кількість слів: " + countWords(sentence));
        System.out.println("10. Перший непорожній рядок: " + findFirstNotEmpty(sentenceList).orElse("Немає"));
        System.out.println("11. Всі з великої літери: " + allStartWithUpperCase(Arrays.asList("Hello", "World", "Java")));
        System.out.println("12. Друге найбільше: " + findSecondLargest(Arrays.asList(5, 2, 8, 8, 6)).orElse(null));
        System.out.println("13. Найбільше парне: " + findMaxEven(intList).orElse(null));
    }
}
