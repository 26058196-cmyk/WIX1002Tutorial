/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author USER
 */
public class number4 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Biggest number is " + max);
    }
}