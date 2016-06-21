package com.leapfrog.cube;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class program {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        double length, breadth, height;
        int cal_option;
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the following(1-3): ");
        System.out.println("1.Rectangle \t 2. Cube \t 3.Square ");
        int option = input.nextInt();
        while (true) {
            switch (option) {
                case 1:

                   // ProcessA();
                    break;

                case 2:
                    ProocessB();
                    break;

                default:
                    System.out.println("Invalid Selection");

            }

        }

    

     public static double  ProcessA(double length, double breadth){
     double total = 0;
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the lenght:");
     length = input.nextInt();
     System.out.println("Please enter the width:");
     breadth = input.nextInt();
     System.out.println("Please choose what you want to calculate");
     System.out.println("\t1.Area2 \t 2.Perimeter");
     int area, perimeter;
     int cal_option = input.nextInt();

     switch (cal_option) {
     case 1:
     total = length * breadth;
     System.out.println("Area of rectangle:" + total);
     break;

     case 2:
     total = 2 * (length + breadth);
     System.out.println("Perimeter of rectangle:" + total);
     break;

     default:
     System.out.println("Invalid Selection.");
     }
     return total;
     }
    private static double ProcessB(double length, double total) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght:");
        length = input.nextInt();
        System.out.println("Please choose what you want to calculate");
        System.out.println("\t1.Area \t 2.Perimeter \t 3.Volume");

        int cal_option = input.nextInt();

        switch (cal_option) {
            case 1:
                total = 6 * length * length;
                System.out.println("Area of cube:" + total);
                break;

            case 2:
                total = 12 * length;
                System.out.println("Perimeter of cube:" + total);
                break;
            case 3:
                total = length * length * length;
                System.out.println("Volume of cube:" + total);
                break;
            default:
                System.out.println("Invalid Selection.");

        }
        return total;
    }
}
