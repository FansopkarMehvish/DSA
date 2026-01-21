import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

    public static int[] reverseArray(int[] arr){
        int[] reverseArray = new int[arr.length];
//        [4,5,6,3,6]
//        i=0 arr[0]= 4, reverseArray[arr.length-1]
//        i=1 arr[1]=5 reverseArray[arr.length-1-i]
//        i=2 arr[2]=6 reverseArray[arr.length-1-i]

        for(int i = 0; i < arr.length; i++){
//            reverseArray[i] = arr[arr.length-i-1];
            reverseArray[arr.length-i-1] = arr[i];
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
