package lesson_10;

import java.util.ArrayList;
import java.util.List;

public class RecursionPractice {
    // Additional HW: USE RECURSION
    // 1. Binary search in a sorted array
    // {1, 2, 5, 20, 30, 45, 100, 200}
    // 2. Find the index of an element in an array
    // 3. Implement Fibonacci Sequence (1,1,2,3,5,8,13,21...)
    // 4. Reverse a String
    // 5. Check if a String is a palindrome
    // 6. Calculate a^b (a to the power of b: a*a*a...*a)
    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 6, 10}; // 23
        // array[0] + array[withoutFirst]
        System.out.println(sumOfArray(array));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(20); // 38
        System.out.println(sumOfList(numbers));
    }

    private static int sumOfList(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }
        Integer first = numbers.removeFirst();
        return first + sumOfList(numbers);
    }

    // [1,2,3,4,5] -> index = 1
    private static int sumOfArray(Integer[] array) {
        return sumOfArray(array, 0);
    }

    private static int sumOfArray(Integer[] array, int index) {
        if (index == array.length) {
            return 0;
        }

        return array[index] + sumOfArray(array, index + 1);
    }

    // 5! = 5 * 4 * 3 * 2 * 1
    // fact(5) = fact(4) * 5
    // 3! = 3 * 2 * 1
    // 1! = 1
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // n -> 10, return sum of 1+2+...+9+10;
    // sum(10) = sum(9) + 10;
    // sum(9) = sum(8) + 9;
    // ...
    // sum(1) = 1 + sum(0);
    // sum(0) = 0
    public static int sumOfFirstN(int n) {
        if (n < 1) {
            return 0;
        }
        int previousSum = sumOfFirstN(n - 1);
        return n + previousSum;
    }
}
