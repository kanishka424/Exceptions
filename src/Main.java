import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x=0;
        int y=0;

//        System.out.println("getInt() returned "+getInt());
//        System.out.println("getIntLBYL()  value "+getIntLBYL());
        System.out.println("getIntEAFP()  value "+getIntEAFP());

    }


//    public static int getInt(){
//        Scanner scan=new Scanner(System.in);
//        int value=scan.nextInt();//if anything other than an int it will throw an InputMismatchException
//        return value;
//    }


//    public static  int getIntLBYL(){
//        Scanner s=new Scanner(System.in);
//        boolean isValid=true;
//        String input=s.next();
//        for(int i=0;i<input.length();i++) {
//            if (!Character.isDigit(input.charAt(i))) {//new method()
//                isValid = false;
//                break;
//            }
//        }
//            if(isValid){
//                return Integer.parseInt(input);
//            }
//            return 0;
//
//    }



    public static int getIntEAFP(){//this has less code than getIntLBYL() but depends on what to choose
        Scanner s=new Scanner(System.in);
        System.out.println("please enter an  Integer ");

        try{
            int input =s.nextInt();
            return input;
        }catch(InputMismatchException e){
                return 0;
        }
    }
}














//===============================================================EXAMPLE 1============================================================

//public class Main {
//    public static void main(String[] args) {
//        int x=98;
//        int y=0;
//        System.out.println("divideLBLY(x,y) "+divideLBLY(x,y));
//        System.out.println("divideEAFP(x,y) "+divideEAFP(x,y));
//        System.out.println(" divide(x,y)"+divide(x,y));
//
//    }
//
//
//    public static int divideLBLY(int x,int y){
//        if(y!=0){
//            return x/y;
//        }
//        return 0;
//
//    };
//
//    public static int  divideEAFP(int x,int y){
//        try {
//            return x / y;
//        }catch(ArithmeticException e){
//            return 0;
//        }
//    };
//
//    public static int divide(int x,int y){ //this trows an ArithmeticException
//        return x/y;
//
//    };
//}
