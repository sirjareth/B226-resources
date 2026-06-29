/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.discussion;

import java.util.Scanner;

public class ForLoopStatement {

    public static void main(String[] args) {
        // syntax
        // Print your name 10 times 
        for (int i = 0; i < 10; i++) {
            //System.out.println(i + 1 + ": Winter");
        }

        // calculates the sum of numbers from 1 to 5:
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            //      5
            sum += i;
            // 1 + 2 + 3 + 4 + 5 = 15
        }

        //System.out.println(sum); // print sum
        // Mini-Activity: Calculates the product of numbers from 1 to 5
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        
//        
//        long product = 1;
//        for (int i = 1; i <= num; i++) {
//            //      5
//            product *= i;
//            // 1 * 2 * 3 * 4 * 5 = 120
//        }
        //System.out.println("Product: " + product); // print sum
        // Print the first five even numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
        }

    }
}
