import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    private double first;
    private double second;
    private double result;


    public static void main(String[] args) {

        Main main = new Main();
        main.options();
        main.doOption();

    }

    void options() {
        System.out.println("What do you want to do? Choose option: \n" +
                "1.Add \n" +
                "2.Substract \n" +
                "3.Multiply \n" +
                "4.Divide \n" +
                "0.Exit");

    }

    double getNumberFromUser() {
        return sc.nextDouble();
    }

    public void add() {
        sameLines();
        result = first + second;
        System.out.println("result is: " + result);
        options();
    }

    public void substract() {
        sameLines();
        result = first - second;
        System.out.println("result is: " + result);
        options();

    }

    public void multiply() {
        sameLines();
        result = first * second;
        System.out.println("result is: " + result);
        options();
    }

    public void divide() {
        sameLines();
        if (second == 0) {
            result = 0;
            System.err.println("You can not divide by 0.");
        } else
            result = first / second;
        System.out.println("result is: " + result);
        options();

    }

    void sameLines() {
        System.out.println("give first number: ");
        first = getNumberFromUser();
        sc.nextLine();
        System.out.println("give second number: ");
        second = getNumberFromUser();
        sc.nextLine();
    }

    void doOption() {
        int number = 0;
        boolean start = true;
        while (start) {
            try {
                number = (int) getNumberFromUser();
            } catch (InputMismatchException e) {
                System.err.println("You can use only numbers!");
                number = (int) getNumberFromUser();
            } finally {
                switch (number) {
                    case 1 -> add();
                    case 2 -> substract();
                    case 3 -> multiply();
                    case 4 -> divide();
                    case 0 -> {
                        System.out.println("Goodbye");
                        start = false;
                    }
                    default -> {
                        System.out.println("Wrong option");
                        options();
                        doOption();
                    }

                }
            }
        }
    }
}

