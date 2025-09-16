/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\(|\\)|,|\\s]+");
        System.out.print("How many times to run the program?:  ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Input coordinate point: ");
            double pointOneX = scanner.nextDouble();
            double pointOneY = scanner.nextDouble();
            double pointTwoX = scanner.nextDouble();
            double pointTwoY = scanner.nextDouble();
            double distance = Math.pow((Math.pow((pointTwoX - pointOneX), 2) +
                    (Math.pow((pointTwoY - pointOneY), 2))), 0.5);

            System.out.println(distance);
        }
    }
}