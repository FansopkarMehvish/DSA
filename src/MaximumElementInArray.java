import java.util.Scanner;

public class MaximumElementInArray {

    public static int maximumElementOfArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumElementOfArray(arr));
    }
}
