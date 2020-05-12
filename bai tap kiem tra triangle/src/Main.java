import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a= in.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b= in.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c= in.nextDouble();

        if(isNegative(a) || isNegative(b) || isNegative(c) ){
            throw new IllegalTriangleException("Your side can't be a negative number");
        }else if(is2SideLessThan1Side(a,b,c)){
            throw new IllegalTriangleException("Total of 2 side is less than 1 side");
        }else{
            System.out.println("Here is a triangle");
        }


    }

    public static boolean isNegative(double inputNumber){
        if (inputNumber < 0){
            return true;
        }else{
            return false;
        }
    }

    public static  boolean is2SideLessThan1Side(double a,double b,double c){
        if ( (a + b < c) || (a + c < b) || (c + b < a))
            return true;
        else return false;
    }
}
