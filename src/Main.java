import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] weights = {1.57, 7.654, 9.986};
        int[] ages = {2, 5, 9, 13, 17, 27, 36, 47, 58, 62, 75, 83};
        System.out.println("Задача 2");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
            if (i < ages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = ages.length - 1; i >= 0; i--) {
            System.out.print(ages[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] % 2 != 0) {
                ages[i] += 1;
            }
        }
        System.out.println(Arrays.toString(ages));
    }
}