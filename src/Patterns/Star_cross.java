package Patterns;

import java.util.Scanner;

public class Star_cross {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for the pattern size: ");
        int size = scanner.nextInt();

        // Loop through rows
        for (int i = 0; i <size; i++) {
            // Loop through columns
            for (int j = 0; j < size; j++) {
                // Print star if on either diagonal
                if (i == j || i + j == size-1 ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                        }
                    }
            // Move to the next line after completing a row
            System.out.println();
                }

            }
        }

