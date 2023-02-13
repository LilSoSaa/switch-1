package it.develhope.switchstatement;


import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between 1 and 10: ");
            int number = scanner.nextInt();


            switch (number) {
                case 1:
                    System.out.println("The number is: ONE ");
                    break;
                case 2:
                    System.out.println("The number is: TWO ");
                    break;
                case 3:
                    System.out.println("The number is: THREE ");
                    break;
                case 4:
                    System.out.println("The number is: FOUR ");
                    break;
                case 5:
                    System.out.println("The number is: FIVE ");
                    break;
                case 6:
                    System.out.println("The number is: SIX ");
                    break;
                case 7:
                    System.out.println("The number is: SEVEN ");
                    break;
                case 8:
                    System.out.println("The number is: EIGHT ");
                    break;
                case 9:
                    System.out.println("The number is: NINE ");
                    break;
                case 10:
                    System.out.println("The number is: TEN ");
                    break;
            }
                if (number < 1 || number > 10) {

                    System.out.println("Cannot give you the name!");
                }
            }
        }


}

