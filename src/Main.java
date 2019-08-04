import java.util.Scanner;

public class Main implements Actions {
    Scanner sc = new Scanner(System.in);
    private static double first;
    private static double second;
    private static double sum;

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

    public void add() {
      sameLines();
        sum = first + second;
        System.out.println("result is: " + sum);
        options();
        doOption();
    }

    public void substract() {
   sameLines();
        sum = first - second;
        System.out.println("result is: " + sum);
        options();
        doOption();
    }

    public void multiply() {
     sameLines();
        sum = first * second;
        System.out.println("result is: " + sum);
        options();
        doOption();
    }

    public void divide() {
        sameLines();
        if (second == 0) throw new IllegalArgumentException("You can not divide by 0");
        sum = first / second;
        System.out.println("result is: " + sum);
        options();
        doOption();
    }

    void doOption() {
        int number = sc.nextInt();
        boolean start = true;
        while (start) {
            switch (number) {
                case 1 -> add();
                case 2 -> substract();
                case 3 -> multiply();
                case 4 -> divide();
                case 0 -> start = false;
            }
        }
    }

    void sameLines() {
        System.out.println("give first number: ");
        first = sc.nextDouble();
        System.out.println("Give second number: ");
        second = sc.nextDouble();
    }
}

