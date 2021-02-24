import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }catch(ArithmeticException|NoSuchElementException e){//multiple exception in one statement i
            System.out.println(e.toString());
            System.out.println("Unable to perform division,autopilot shutting down");
        }
    }

    private static int divide() {
//int x;

        int x, y;

//    x=getInt();
//}catch(NoSuchElementException e){
//    x=getInt();
//}
            x = getInt();
            y = getInt();
            System.out.println("X is " + x + ", y is " + y);
            return x / y;

    }

    private static int getInt(){

        Scanner s=new Scanner(System.in);
        System.out.println("please enter an integer");
        while(true){
            try{
                return s.nextInt();

            }catch(InputMismatchException e){
                s.nextLine();//makes user enter again if wrong input
                System.out.println("please enter a number using the digits 0 to 9");
            }
        }
    }
}













//=====================================================Example 2 working multiple exceptions line by line==================================================
/*
public class Example {
    public static void main(String[] args) {
        int result=divide();
        System.out.println(result);

    }

    private static int divide() {
//int x;
        int x, y;
        try {
//    x=getInt();
//}catch(NoSuchElementException e){
//    x=getInt();
//}
            x = getInt();
            y = getInt();
            System.out.println("X is " + x + ", y is " + y);
            return x / y;
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("no suitable input");//how to throw an exception
        }
        catch (ArithmeticException e) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
    }

    private static int getInt(){

        Scanner s=new Scanner(System.in);
        System.out.println("please enter an integer");
        while(true){
            try{
                return s.nextInt();

            }catch(InputMismatchException e){
                s.nextLine();//makes user enter again if wrong input
                System.out.println("please enter a number using the digits 0 to 9");
            }
        }
    }
}
*/
