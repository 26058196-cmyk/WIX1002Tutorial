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

public class q7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inches = keyboard.nextDouble();
        double meters = inches * 2.54 / 100.0;
        System.out.printf("%.2f inches = %.2f meters\n", inches, meters);
        keyboard.close();
    }
}