package leetcode;

import java.util.*;

public class fizzbuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> answers = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleby5 = i % 5 == 0;
            boolean divisibleby3 = i % 3 == 0;
            if (divisibleby5 && divisibleby3) {
                answers.add("FizzBuzz");
            }

            else if (divisibleby5) {
                answers.add("Buzz");
            } else if (divisibleby3) {
                answers.add("Fizz");
            }

            else {
                answers.add(String.valueOf(i));
            }
        }
        return answers;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n: ");
        n = sc.nextInt();
        List<String> answers = fizzBuzz(n);
        System.out.println(answers);
        sc.close();
    }
}
