/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan48.kalkulator;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung 
 * pertambahan, pengurangan, perkalian dan pembagian
 */
public class PBO210117070Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.print("Masukkan Value 1 : ");
        double a = scn.nextDouble();
        System.out.print("Masukkan Value 2 : ");
        double b = scn.nextDouble();
        System.out.println();
        
        kalkulator.setNameProject("Project Calculator");
        kalkulator.setNoteProject("The project shown you how to manage method in java");
        
        System.out.println();
        System.out.println("Result Add is = " + kalkulator.add(a, b));
        System.out.println("Result Minus is = " + kalkulator.minus(a, b));
        System.out.println("Result Multiple = " + kalkulator.multiplication(a, b));
        System.out.println("Result Division = " + kalkulator.division(a, b));
    }
    
}
