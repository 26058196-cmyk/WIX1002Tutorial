/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial2;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double diameter = keyboard.nextDouble();
        double circumference = diameter * Math.PI;
        System.out.printf("The circumference of the circle is: %.3f\n", circumference);
        keyboard.close();
    }
}