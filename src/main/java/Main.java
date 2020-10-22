import java.io.InputStream;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        System.out.println("\nType what you want to do. The options are:\n");
        System.out.println("\tadd <int> <int>");
        System.out.println("\tsubtract <int> <int>");
        System.out.println("\tmultiply <int> <int>");
        System.out.println("\tdivide <int> <int>");
        System.out.println("\tfibonacci <int>");
        System.out.println("\tbinary <int>");

        String command;
        int num1, num2 = 0;
        Scanner scanner = new Scanner(System.in);

        boolean terminate = false;
        Calculator calc = new Calculator();




//        System.out.println(command + " " + num1 + " " + num2);
        while(true) {
            command = scanner.next();
//        num1 = command.
            num1 = scanner.nextInt();
            if(command.equals("add") || command.equals("subtract") ||
                    command.equals("multiply") || command.equals("divide")) num2 = scanner.nextInt();

            if (command.equals("add")) System.out.println(calc.add(num1, num2));
            if (command.equals("subtract")) System.out.println(calc.subtract(num1, num2));
            if (command.equals("multiply")) System.out.println(calc.multiply(num1, num2));
            if (command.equals("divide")) System.out.println(calc.divide(num1, num2));
            if (command.equals("fibonacci")) System.out.println(calc.fibonacciNumberFinder(num1));
            if (command.equals("binary")) System.out.println(calc.intToBinaryNumber(num1));
            if(command.equals("terminate")) break;
        }
    }
}
