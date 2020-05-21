package Arrays;

import java.util.Scanner;

public class Sorting {

     // Zoom meeting ID - 892-767-844
    //https://zoom.us/w/892767844?tk=IqVjGHmpsYMitkoCb-5AgezmrA9voNvjUBvUX60awBg.DQEAAAAANTaOZBYtaFdwdGEzdVJXcWNjdFpaTW42a013AA&uuid=WN_JMnvWTntT663NIWrMxAyTQ

    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers= getIntegers(5);
        printArray(myIntegers);
        sortArray(myIntegers);

    }

    private static int[] getIntegers(int fixedNumber) {
        int[] myValues= new int[fixedNumber];
        for (int i=0;i<myValues.length;i++){
            myValues[i]=scanner.nextInt();
        }
        return myValues;
    }

    private static void sortArray(int[] myIntegers) {
        // to do later
    }

    // Printing Array
    private static void printArray(int[] myIntegers) {
        for(int i=0; i< myIntegers.length;i++){
            System.out.println("The "+ i +"value in array is -"+myIntegers[i]);
        }
    }
}
