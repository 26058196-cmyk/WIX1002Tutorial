/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author USER
 */
public class number1 {
    public static void main(String[] args) {
        // a.
        boolean a = (3 * 8 == 27);
        System.out.println(a);

        // b.
        int num = 4;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // c.
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital letter");
        }

        // d.
        String s1 = "apple";
        String s2 = "Banana";
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println(s1 + " " + s2);
        } else {
            System.out.println(s2 + " " + s1);
        }

        // e.
        int day = 0;
        switch (day) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
        }
    }
}