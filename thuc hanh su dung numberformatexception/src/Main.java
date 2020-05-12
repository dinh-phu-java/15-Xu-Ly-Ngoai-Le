import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Nhập a ");
        int a= in.nextInt();
        System.out.println("Nhập b ");
        int b= in.nextInt();

        Main.calculate(a,b);

    }

    public static void calculate(int x,int y){
        try{
            int a= x+y;
            int b= x-y;
            int c= x/y;
            int d= x*y;
            System.out.println("Tổng "+a);
            System.out.println("Hiệu "+b);
            System.out.println("Chia "+c);
            System.out.println("Nhân "+d);
        }catch(Exception e){
            System.out.println("Error is "+e.getMessage());
        }

    }
}
