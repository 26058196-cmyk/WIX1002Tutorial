/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial2;

/**
 *
 * @author USER
 */
public class q5 {
    public static void main(String[] args) {
        // a.
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);

        // b.
        String chapter = "Summary";

        // c.
        System.out.println(chapter);
        int num = 5;
        int num1;
        num++;
        num1 = num;

        // d.
        int numVal = 3000;
        System.out.printf("%4.2f\n", (double)numVal);

        // e.
        String contact;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        contact = keyboard.nextLine();
        keyboard.close();
    }
}