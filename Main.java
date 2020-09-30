//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/28/2020
//Lab 7

//driver program to display menu and ask for input (including validation)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 7;
        do {
            choice = 7;
            System.out.println();
            System.out.println("---MENU---");
            System.out.println();
            System.out.println("0 - EXIT");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println();
            while((choice > 4) || (choice < 0)){
                System.out.print("Please Choose an Option: ");
                choice = sc.nextInt();
            }
            if(choice == 0)
                break;
            System.out.println("Please enter the first number:");
            double number = sc.nextDouble();
            System.out.println("Please enter the second number: ");
            double number2 = sc.nextDouble();



            if (choice == 0) {
                break;
            }
            else if (choice == 1) {
                Calculator calc = new Calculator(number, number2);
                System.out.println();
                System.out.println(calc.addition());
            }
            else if (choice == 2){
                Calculator calc = new Calculator(number, number2);
                System.out.println();
                System.out.println(calc.subtraction());
            }
            else if (choice == 3){
                Calculator calc = new Calculator(number, number2);
                System.out.println();
                System.out.println(calc.multiplication());
            }
            else if (choice == 4){
                Calculator calc = new Calculator(number, number2);
                System.out.println();
                System.out.println(calc.division());
            }
        }while(choice != 0);

        System.out.println();
        System.out.println("You chose to exit");
    }
}
