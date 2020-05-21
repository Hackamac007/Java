package Arrays;

public class BinarySearchRecursion {

     int binarySearch(int arr[], int low,int high, int toFind ){

        if(high>=low){
             int mid = low + (high - low) / 2;
             if (arr[mid] == toFind)
                 // Remove line 13 i.e return mid; and below 2 lines
                 // result = mid
                 // high=mid -1 : For first occurrence, low= mid+1 : For last occurrence
                 return mid;
             if (toFind < arr[mid])
                 return binarySearch(arr, low, mid - 1, toFind);
             else
                 return binarySearch(arr, mid + 1, high, toFind);
         }
        return -1;
    }

    public static void main(String[] args) {

         BinarySearchRecursion binaryArray= new BinarySearchRecursion();
         int[] arr ={1,2,3,4,10,45,50,54,56,};
         int n=arr.length;
         System.out.println("Array Length is : "+ n);
         int position= binaryArray.binarySearch(arr,0,n-1,45);
         if(position== -1)
             System.out.println("Not present");
         else
             System.out.println("Element present at : "+ position);
    }
}
