import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("What is your name?\n");
        String name = scanner.nextLine();
        System.out.print("What is your favorite number?\n");

        try {
            num = scanner.nextInt();
            System.out.println("Hi " + name + "! " + num + " is a great number!");
        }
        catch(Exception e) {
            System.out.print("Please enter a number.");
        } // End try-catch block
    } // End constructor
} //Myra Rudy