package Java_progect.hw_002;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;




public class task003{
    public static void main(String args[]){
        Logger logger = Logger.getLogger("MyLogger");
        logger.setLevel(Level.INFO);
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        Scanner sc = new Scanner(System.in, "Cp866");
        SimpleFormatter sf = new SimpleFormatter();
        info.setFormatter(sf);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operation: ");
        String operatiom = sc.next();
        sc.close();
        if (operatiom.equals("+")) {
            System.out.println((num1+num2));
            logger.log(Level.INFO, "addition");}
        else if (operatiom.equals("-")) {
            System.out.println(num1-num2);
            logger.log(Level.INFO, "subtraction");}
        else if (operatiom.equals("*")) {
            System.out.println(num1*num2);
            logger.log(Level.INFO, "multiplication");}
        else if (operatiom.equals("/")) {
            System.out.println(num1/num2);
            logger.log(Level.INFO, "division");}

    }
}



