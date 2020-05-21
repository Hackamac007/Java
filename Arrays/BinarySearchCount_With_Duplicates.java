package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinarySearchCount_With_Duplicates {

    static int BinarySearch(int[] arr, int length, int tofind, boolean searchPosition){
        int low=0;
        int high=length-1;
        int result=-1;
        while (high>=low){
            int mid=low+ (high-low)/2;
            if(arr[mid] == tofind){
                result=mid;
                if(searchPosition)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else if(tofind< arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return result;
    }


    public static void main(String[] args) throws IOException {

        Scanner scanner= new Scanner(System.in);
        int arr[]={1,2,3,4,5,5,5,5,5,6,6,6,7,7,8,9,10};
        System.out.println("Length of array: "+ arr.length);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        int firstIndexofNumber= BinarySearch(arr, arr.length,number,true);
        System.out.println("firstIndexofNumber is : "+firstIndexofNumber);
        if(firstIndexofNumber== -1)
            System.out.println("Count of "+number+" is 0");
        else{
            int lastIndexofNumber= BinarySearch(arr,arr.length,number,false);
            System.out.println("lastIndexofNumber is : "+lastIndexofNumber);
            System.out.println("Count of "+number+" is "+(lastIndexofNumber - firstIndexofNumber+1));
        }
    }
}
