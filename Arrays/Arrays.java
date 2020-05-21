package Arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myinteger = getIntegers(5);
        for(int i=0; i<myinteger.length;i++){
            System.out.println("Values is "+myinteger[i]);
        }
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number+ " integer values");
        int[] values=new int[number];

        for(int i=0;i<values.length;i++){
            values[i]= scanner.nextInt();
        }
        return  values;
    }


}
