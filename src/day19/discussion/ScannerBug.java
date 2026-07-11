/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day19.discussion;

import java.util.Scanner;

/**
 *
 * @author Yuno
 */
public class ScannerBug {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your mobile number: ");
        String mobileNum = scanner.nextLine();
        
        
    }
}
