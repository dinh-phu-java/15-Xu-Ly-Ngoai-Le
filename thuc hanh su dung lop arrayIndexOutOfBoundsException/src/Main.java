import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myArr=generateArray();

        Scanner in =new Scanner(System.in);

        System.out.println("Nhập index của phần tử cần tìm: ");
        int findIndex=in.nextInt();

        try {
            System.out.println("phần tử cần tìm là "+myArr[findIndex]);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Can't access"+findIndex +" because it is greater than 100");
        }

    }

    public static int[] generateArray() {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i]= (int)Math.floor(Math.random()*myArr.length) ;
        }
        return myArr;
    }
}
