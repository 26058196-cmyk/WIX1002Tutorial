/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author USER
 */
public class number2 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 5;
        int x = 5, y = 3, z = 1;
        String s1 = "abc", s2 = "abc";

        // a.
        if (num1 == num2) {
            System.out.println("Number 1 is equal to number 2.");
        }

        // b.
        if (x > y && y > z) {
            System.out.println("x is the largest number");
        }

        // c.
        if (s1.equals(s2)) {
            System.out.println("They are equal strings.");
        } else {
            System.out.println("They are not equal strings.");
        }

        // d.
        if (x > 0 || y > 0) {
            System.out.println("Either x or y is positive");
        }
    }
}